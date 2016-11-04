/**
 *  <pre>	
 *  Project Name:ServerFramework .</br>
 *  File: UserServer.java .</br>
 *  Package Name:com.imobpay.base.services .</br>
 *  Date      Author       Changes .</br>
 *  2016年5月30日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.services;

/**
 * 
 * ClassName: ParentServer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2016年6月30日 上午9:13:01 <br/> 
 * 
 * 接口公用类
 * 
 * @author madman
 * @version  
 * @since JDK 1.6 PayIFramework 1.0
 */
public interface ParentServer {

    /**
     * 
     * execute:定义dubbo接口. <br/> 
     * 
     * @author madman
     * @param json json格式的字符串
     * @return
     * @return 返回结果：String
     * @since JDK 1.6 PayIFramework 1.0
     */
    String execute(String json);
}