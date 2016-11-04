package com.imobpay.base.util;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.log.LogPay;
import com.tibco.tibjms.TibjmsQueueConnectionFactory;

/**
 * 
 * @author Lance.Wu
 * @since 2015年7月10日 上午9:52:24
 * 
 *        <pre>
 * 发送Tibco外部服务接口
 * </pre>
 */
public class PubTibcoSend {
    /**
     * 
     * main:(这里用一句话描述这个方法的作用). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author madman
     * @param args 脚本参数
     * @since JDK 1.6 PayUserServer 1.0
     */
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("123", "123");
        sendCoreInfo("tcp://192.168.1.7:7222", "UserDubboServerxx.IN", "UserDubboServerxx.OUT", json.toString(), false);
    }

    /**
     * 
     * sendCoreInfo:(这里用一句话描述这个方法的作用). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author madman
     * @param url f
     * @param sendDescName f
     * @param recDescName f 
     * @param str f
     * @param isRecFalg f 
     * @returnf 
     * @return 返回结果：String f 
     * @since JDK 1.6 PayUserServer 1.0 f
     */
    public static String sendCoreInfo(String url, String sendDescName, String recDescName, String str, Boolean isRecFalg) {
        TibjmsQueueConnectionFactory tqc = null;
        QueueSession sendSession = null;
        QueueSession recSession = null;
        QueueConnection conn = null;

        MessageProducer mp = null;
        QueueReceiver receiver = null;

        String logno = Tools.getOnlyPK();
        LogPay.info("发送地址为=====>>>" + url);
        LogPay.info("发送队列=====>>>" + sendDescName);
        LogPay.info("发送核心数据=====>>>" + str);
        
        try {
            tqc = new TibjmsQueueConnectionFactory(url);
            conn = tqc.createQueueConnection("admin", "");
            conn.start();

            /** 初始化数据-得到连接*/

            sendSession = conn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            Queue sendQ = sendSession.createQueue(sendDescName);
            mp = sendSession.createProducer(sendQ);

            BytesMessage message = sendSession.createBytesMessage();
            message.setJMSCorrelationID(logno);
            message.writeBytes(str.getBytes("GBK"));
            mp.send(message);
            if (isRecFalg == Boolean.TRUE) {
                recSession = conn.createQueueSession(false, Session.CLIENT_ACKNOWLEDGE);
                Queue recQueue = recSession.createQueue(recDescName);
                receiver = recSession.createReceiver(recQueue, "JMSCorrelationID='" + logno + "'");
                BytesMessage receive = (javax.jms.BytesMessage) receiver.receive(28000);
                byte[] bmessage = new byte[(int) receive.getBodyLength()];
                receive.readBytes(bmessage);
                receive.acknowledge();

                String content = new String(bmessage, "GBK");
                LogPay.info("接收核心队列数据=====[" + recDescName + "]>>>" + content);
                return content;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (mp != null) {
                    mp.close();
                }
                if (receiver != null) {
                    receiver.close();
                }
                if (recSession != null) {
                    recSession.close();
                }
                if (sendSession != null) {
                    sendSession.close();
                }
                if (conn != null) {
                    conn.stop();
                    conn.close();
                }
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
        return logno;
    }

}
