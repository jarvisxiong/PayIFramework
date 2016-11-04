/**
 *  <pre>	
 *  Project Name:UserDServer .</br>
 *  File: BusinessInterface.java .</br>
 *  Package Name:com.imobpay.base.services .</br>
 *  Date      Author       Changes .</br>
 *  2016年5月30日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.iface;

import com.imobpay.base.exception.QTException;

/**
 * <pre>
 * ClassName: BusinessInterface <br/> 
 * Function: 业务实现类接口-execute. <br/> 
 * Reason: 提供给所有子类实现的方法. <br/> 
 * date: 2016年5月30日 下午3:44:09 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
public interface BusinessInterface {
    /**
     * 
     * execute:(这里用一句话描述这个方法的作用). <br/> 
     * 
     * @author madman
     * @param reqParame 请求参数
     * @return 返回 结果
     * @throws QTException  异常
     * @since JDK 1.6 PayIFramework 1.0
     */
    String execute(String reqParame) throws QTException;
}
