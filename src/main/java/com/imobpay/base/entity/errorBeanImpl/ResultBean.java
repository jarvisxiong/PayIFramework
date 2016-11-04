package com.imobpay.base.entity.errorBeanImpl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.entity.Message;
import com.imobpay.base.entity.ReultErrorBean;

/**
 * 
 * 类名: UserJSONBean <br/>
 * 作用：公共返回类<br/>
 * 创建者: 张朝辉. <br/>
 * 添加时间: 2016年7月5日 下午2:31:23 <br/>
 * 版本：
 * 
 * @param <T>
 * @since JDK 1.6 PayUserServer 1.0
 */
@Service
public class ResultBean<T> extends ReultErrorBean {


    /**
     * 返回码信息
     */
    private Message result = new Message();
    /**
     * 返回实体bean对象
     */
    private T       resultBean;
    /**
     * 返回结果map
     */
    private Map<String, Object>       queryMenu;
    
    /**
     * 过滤器方法
     */
    private static ValueFilter filter = new ValueFilter() {
        @Override
        public Object process(Object obj, String s, Object v) {
            if (v == null){
                return "";
            }
            return v;
        }
    };

    /**
     * 方法名： getResult.<br/>
     * 返回值：@return 返回值 创建者：张朝辉.<br/>
     * 创建日期：2016年6月28日.<br/>
     * 创建时间：下午4:44:52.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public Message getResult() {
        return result;
    }

    /**
     * 方法名： setResult.<br/>
     *
     * 参数： @param result 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月28日.<br/>
     * 创建时间：下午4:44:52.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setResult(Message result) {
        this.result = result;
    }

    /**
     * 方法名： getResultBean.<br/>
     *
     * 返回值：@return 返回值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午2:30:25.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public T getResultBean() {
        return resultBean;
    }

    /**
     * 方法名： setResultBean.<br/>
     *
     * 参数： @param resultBean 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午2:30:25.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public void setResultBean(T resultBean) {
        this.resultBean = resultBean;
    }
    
    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return result.getResultCode();
    }

    /** 
     * resultCode. 
     * 
     * @param   resultCode    the resultCode to set 
     * @since   JDK 1.6 PayIFramework
     */
    public void setResultCode(String resultCode) {
        this.result.setResultCode(resultCode);
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return this.result.getMessage();
    }

    /** 
     * message. 
     * 
     * @param   message    the message to set 
     * @since   JDK 1.6 PayIFramework
     */
    public void setMessage(String message) {
        this.result.setMessage(message);
    }

    
    
    @Override
    public String returnBeanJson(String msgCode, String msgText) {
        JSONObject totalResult = new JSONObject();
        this.result.setResultCode(msgCode);
        this.result.setMessage(msgText);
        totalResult.put(Console_Column.HU_TOTALRESULT, this);
        return JSONObject.toJSONString(totalResult, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty);
    }
    
    
    /**
     * 
     * 方法名： getTotalResult.<br/>
     * 方法作用:返回字符结果数据.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：上午9:49:55.<br/>
     * 参数者异常：@param resultBean
     * 参数者异常：@param resultCode
     * 参数者异常：@param message
     * 参数者异常：@return String.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getTotalResult(T resultBean, String resultCode, String message) {
        JSONObject totalResult = new JSONObject();
        this.result.setResultCode(resultCode);
        this.result.setMessage(message);
        this.setResultBean(resultBean);
        totalResult.put(Console_Column.HU_TOTALRESULT, this);
        return JSONObject.toJSONString(totalResult, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.DisableCircularReferenceDetect);

    }
    /**
     * 
     * 方法名： getTotalResult.<br/>
     * 方法作用:返回字符结果数据.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：上午9:49:55.<br/>
     * 参数者异常：@param resultBean
     * 参数者异常：@param resultCode
     * 参数者异常：@param message
     * 参数者异常：@return String.<br/>
     * 其它内容： JDK 1.6 PayUserServer 1.0.<br/>
     */
    public String getTotalResult(Map<String, Object> queryMenu, String resultCode, String message) {
        JSONObject totalResult = new JSONObject();
        this.result.setResultCode(resultCode);
        this.result.setMessage(message);
        this.setQueryMenu(queryMenu);
        totalResult.put(Console_Column.HU_TOTALRESULT, this);
        return JSONObject.toJSONString(totalResult, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.DisableCircularReferenceDetect);
        
    }

    /** 
     * 方法名： getQueryMenu.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月2日.<br/>
     * 创建时间：下午1:53:21.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public Map<String, Object> getQueryMenu() {
        return queryMenu;
    }

    /** 
     * 方法名： setQueryMenu.<br/>
     *
     * 参数： @param queryMenu 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月2日.<br/>
     * 创建时间：下午1:53:21.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public void setQueryMenu(Map<String, Object> queryMenu) {
        this.queryMenu = queryMenu;
    }


    
}
