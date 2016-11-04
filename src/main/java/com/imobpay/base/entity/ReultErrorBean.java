/**
 *  <pre>	
 *  Project Name:PayIFramework .</br>
 *  File: reultErrorBean.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  2016年7月12日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;


/**
 * <pre>
 * ClassName: reultErrorBean <br/> 
 * date: 2016年7月12日 下午2:41:29 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 PayIFramework 1.0 . <br/>
 * </pre>
 */
public abstract class ReultErrorBean {

    
    /**
     * returnBeanJson:(返回内容). <br/> 
     * @author Lance.Wu  <br/>
     * @return 返回结果：String  <br/>
     * @param msgCode 错误码
     * @param msgText 错误内容
     * @since JDK 1.6 PayIFramework 1.0  <br/>
     */
    public abstract String returnBeanJson(String msgCode, String msgText);
    
}
