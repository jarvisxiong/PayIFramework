package com.imobpay.base.entity;

/**
 * 
 * ClassName: Message <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2016年6月28日 下午2:45:10 <br/> 
 * 
 * @author madman
 * @version  
 * @since JDK 1.6 PayIFramework 1.0
 */
public class Message {
    /**
     * 
     */
    private String resultCode;
    /**
     * 
     */
    private String message;

    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * resultCode. 
     * 
     * @param   resultCode    the resultCode to set 
     * @since   JDK 1.6 PayIFramework
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /** 
     * message. 
     * 
     * @param   message    the message to set 
     * @since   JDK 1.6 PayIFramework
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
