/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: ${clsName}.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  ${curDate} ${curTime}    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: ${clsName} <br/> 
 * date: ${curDate} ${curTime} <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
 public class ${clsName} extends BaseEntity {

	/** 序号 */
    private static final long serialVersionUID = 1L;

	<#list TABLINFO as x>
   	/** 属性描述：${x.columnDesc} */	
   	private ${x.columnClsType}            ${x.columnClsName};
   	</#list>
   	
  	<#list TABLINFO as x>
    /**
     * 描述：获取属性值-${x.columnDesc}.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return ${x.columnClsType} .<br/>
     */
   	public ${x.columnClsType} get${x.columnClsName?cap_first}() {
        return ${x.columnClsName};
    }
 

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ${x.columnClsName} :${x.columnDesc} 设置值. <br/>
     */
    public void set${x.columnClsName?cap_first}(${x.columnClsType} ${x.columnClsName}) {
        this.${x.columnClsName} = ${x.columnClsName};
    }
   
    </#list>
   	

}