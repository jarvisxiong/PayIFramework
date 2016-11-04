package com.imobpay.base.exception;

import java.util.HashMap;
import java.util.Map;

import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;

/**
 * 
 * ClassName: QTException <br/>
 * Function: 自定义异常处理类. <br/>
 * date: 2015年7月29日 下午4:03:34 <br/>
 * 
 * @author Lance.Wu <br/>
 * @version 1.0.0 <br/>
 * @since JDK 1.6 <br/>
 */
public class QTException extends Exception {

    /** 序号 */
    private static final long serialVersionUID = 1L;
    /** 流程码 */
    private String            respCode         = "9999";
    /** 返回内容 */
    private String            respMsg;

    /** 返回码 */

    /**
     * 
     * 方法名:(自定义异常构造函数). <br/>
     * 描述：(无参数).<br/>
     * 流程：(默认错误码为：异常系统).<br/>
     * 注意事项：(不提供使用 – 可选).<br/>
     * 
     * 创建者： Lance.Wu .<br/>
     * 创建时间： 2016年5月30日 下午3:34:33 .<br/>
     * 参数： .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: Lance.Wu 修改描述：创建新新件 .<br/>
     * <p/>
     */
    public QTException() {
        this.respCode = Console_ErrCode.SYSERROR;
        this.respMsg = "系统繁忙，请稍后重试[NT]";
    }

    /**
     * 
     * 方法名:(自定义异常构造函数). <br/>
     * 注意事项：(推荐使用 – 可选).<br/>
     * 
     * 创建者： Lance.Wu .<br/>
     * 创建时间： 2016年5月30日 下午3:39:18 .<br/>
     * 参数：@param errCode 错误码 .<br/>
     * 参数：@param respMsg 错误描述 .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: Lance.Wu 修改描述：创建新新件 .<br/>
     * <p/>
     */
    public QTException(String errCode, String respMsg) {
        super(respMsg);
        this.respCode = errCode;
        this.respMsg = respMsg;
    }

    /**
     * getRespCode:(得到返回码). <br/>
     * 
     * @author Lance.Wu. <br/>
     * @return 返回结果：String . <br/>
     * @since JDK 1.6 qtservices 1.0
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * setRespCode:(获取返回码). <br/>
     * 
     * @author Lance.Wu . <br/>
     * @param respCode
     *            respCode . <br/>
     * @since JDK 1.6 qtservices 1.0
     */
    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    /**
     * 
     * getRespCode:(得到返回码). <br/>
     * 
     * @author Lance.Wu . <br/>
     * @return 返回结果：String
     * @since JDK 1.6 qtservices 1.0
     */
    public String getRespMsg() {
        return respMsg;
    }

    /**
     * setRespCode:(获取返回码). <br/>
     * 
     * @author Lance.Wu . <br/>
     * @param respMsg
     *            respMsg . <br/>
     * @since JDK 1.6 qtservices 1.0
     */
    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    /**
     * 
     * setResultMapContenxt:(这里用一句话描述这个方法的作用). <br/> 
     * TODO(这里描述这个方法适用条件 – 可选).<br/> 
     * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
     * 
     * @author madman
     * @param items  参数 
     * @since JDK 1.6 PayIFramework 1.0
     */
    public static final void setResultMapContenxt(Map<String, Object> items) {
        if (!items.containsKey("result")) {
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("message", items.get(Console_Column.MSG_TEXT));
            result.put("resultCode", items.get(Console_Column.MSG_CODE));
            items.put("result", result);
        }

        if (!items.containsKey("resultBean")) {
            Map<String, Object> resultBean = new HashMap<String, Object>();
            items.put("resultBean", resultBean);
        }

        if (!items.containsKey("summary")) {
            Map<String, Object> resultBean = new HashMap<String, Object>();
            items.put("summary", resultBean);
        }
    }

    
}
