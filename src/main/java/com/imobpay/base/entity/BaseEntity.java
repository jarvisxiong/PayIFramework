/**
 *  <pre>	
 *  Project Name:PayIFramework .</br>
 *  File: BaseEntity.java .</br>
 *  Package Name:com.imobpay.base .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月6日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

import java.io.Serializable;

/**
 * <pre>
 * ClassName: BaseEntity <br/> 
 * Function: 基础类. <br/> 
 * date: 2016年6月6日 下午3:02:53 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 PayIFramework 1.0 . <br/>
 * </pre>
 */
public class BaseEntity implements Serializable {

    /** (一句话描述) */
    private static final long serialVersionUID = -3731281807105179107L;

    /** 是否分页 */
    private boolean           pageflag         = false;
    /** 当前页 */
    private Integer           curPage          = 1;
    /** 页大小 */
    private Integer           pageSize         = 10;
    /** 排序字段 */
    private String            orderByColumn    = "";
    /** 排序账号 */
    private String            orderByType      = "DESC";

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return isPage .<br/>
     */
    public boolean getPageBlag() {
        return pageflag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月6日 下午3:13:02 <br/>
     * 参数: @param pageflag 设置值. <br/>
     */
    public void setPageflag(boolean pageflag) {
        this.pageflag = pageflag;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return curPage .<br/>
     */
    public Integer getCurPage() {
        return curPage;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月6日 下午3:13:02 <br/>
     * 参数: @param curPage 设置值. <br/>
     */
    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return pageSize .<br/>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月6日 下午3:13:02 <br/>
     * 参数: @param pageSize 设置值. <br/>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return orderByColumn .<br/>
     */
    public String getOrderByColumn() {
        return orderByColumn;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月6日 下午3:13:02 <br/>
     * 参数: @param orderByColumn 设置值. <br/>
     */
    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return orderByType .<br/>
     */
    public String getOrderByType() {
        return orderByType;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月6日 下午7:56:25 <br/>
     * 参数: @param  orderByType 设置值.  <br/>
     */
    public void setOrderByType(String orderByType) {
        this.orderByType = orderByType;
    }

    /**
     * 描述：获取属性值.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return pageflag .<br/>
     */
    public boolean isPageflag() {
        return pageflag;
    }

    
    
}
