package com.imobpay.base.entity.errorBeanImpl;

import java.util.List;

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
public class NoteResultBean<T> extends ReultErrorBean {


    /**
     * 返回码信息
     */
    private Message result = new Message();
    /**
     * 客户端更新列表
     */
    private List<?>            resultBean;
    /**
     *  客户端本次更新必要参数
     */
    private T                  summary;
    
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
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月19日.<br/>
     * 创建时间：上午10:41:39.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
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
     * 创建日期：2016年7月19日.<br/>
     * 创建时间：上午10:41:39.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setResult(Message result) {
        this.result = result;
    }
    
    
    @Override
    public String returnBeanJson(String msgCode, String msgText) {
        JSONObject totalResult = new JSONObject();
        JSONObject results =new JSONObject();
        this.result.setResultCode(msgCode);
        this.result.setMessage(msgText);
        results.put(Console_Column.RESULT, this.result);
        totalResult.put(Console_Column.HU_TOTALRESULT, results);
        return JSONObject.toJSONString(totalResult, filter);
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
    public String getTotalResult(T summary, List<?> resultBean, String resultCode, String message) {
        JSONObject totalResult = new JSONObject();
        this.result.setResultCode(resultCode);
        this.result.setMessage(message);
        this.setResultBean(resultBean);
        this.setSummary(summary);
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
    public String getTotalResult(List<?> resultBean, String resultCode, String message) {
        JSONObject totalResult = new JSONObject();
        this.result.setResultCode(resultCode);
        this.result.setMessage(message);
        this.setResultBean(resultBean);
        totalResult.put(Console_Column.HU_TOTALRESULT, this);
        System.out.println(JSONObject.toJSONString(totalResult));
        return JSONObject.toJSONString(totalResult, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.DisableCircularReferenceDetect);
        
    }

    /** 
     * 方法名： getResultBean.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：上午10:34:59.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public List<?> getResultBean() {
        return resultBean;
    }

    /** 
     * 方法名： setResultBean.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param resultBean 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：上午10:34:59.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public void setResultBean(List<?> resultBean) {
        this.resultBean = resultBean;
    }

    /** 
     * 方法名： getSummary.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：上午10:34:59.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public T getSummary() {
        return summary;
    }

    /** 
     * 方法名： setSummary.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param summary 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：上午10:34:59.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public void setSummary(T summary) {
        this.summary = summary;
    }

}
