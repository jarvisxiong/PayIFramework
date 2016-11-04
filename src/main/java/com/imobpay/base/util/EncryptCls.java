/**
 *  <pre>	
 *  Project Name:DBEncrypt .</br>
 *  File: EncryptCls.java .</br>
 *  Package Name:com.pay.base .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月15日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.util;


/**
 * <pre>
 * ClassName: EncryptCls <br/> 
 * date: 2016年6月15日 下午4:42:46 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 DBEncrypt 1.0 . <br/>
 * </pre>
 */
public class EncryptCls {
    /**
     * 
     * 方法名： main.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午3:32:12.<br/>
     * 参数者异常：@param args .<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public static void main(String[] args) {
        String key = "aaa111";
        String pwd = "qtpay";
//        if (args == null || args.length < 2) {
//            System.out.println("传入的参数不能为空[第一位：密钥，第二位：加密明文]");
//            System.exit(0);
//        }
        if (args.length > 0 && EmptyChecker.isNotEmpty(args[0])) {
            key =args[0];
        }
        if (args.length > 1 && EmptyChecker.isNotEmpty(args[1])) {
            pwd = args[1];
        }
        key = MD5.md5(key);
        key = (key + key).substring(0, 48);
        String enc = enc(key, pwd);
        System.out.println("生成的密钥为:"+enc);
    }

//    /**
//     * dec:(解密). <br/>
//     * @author Lance.Wu <br/>
//     * @param key 密钥 <br/>
//     * @param content 密文内容 <br/>
//     * @return 返回结果：String <br/>
//     * @since JDK 1.6 PayIFramework 1.0 <br/>
//     */
//    private static String dec(String key, String content) {
//        DesEncrypt des = new DesEncrypt();
//        des.setKey(Hex.fromString(key));
//        int s1len = content.length() / 2;
//        if (s1len % 8 != 0) {
//            int fill = (s1len / 8) + 1 * 16;
//            content = Tools.rightFill(content, fill, "0");
//        }
//        byte[] get3DesDesCode = des.get3DesDesCode(Hex.fromString(content));
//        return new String(get3DesDesCode);
//    }

    /**
     * 
     * dec:(加密). <br/>
     * @author Lance.Wu <br/>
     * @param key 密钥
     * @param content  密文内容
     * @return 返回结果：String <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    private static String enc(String key, String content) {
        content = Hex.toString(content.getBytes());
        DesEncrypt des = new DesEncrypt();
        des.setKey(Hex.fromString(key));
        int s1len = content.length() / 2;
        
        if (s1len % 8 != 0) {
            int fill = ((s1len / 8) + 1) * 16;
            content = Tools.rightFill(content, fill, "0");
        }
        byte[] bye = des.get3DesEncCode(Hex.fromString(content));
        return Hex.toString(bye).trim();
    }
}
