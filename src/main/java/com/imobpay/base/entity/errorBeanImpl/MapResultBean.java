package com.imobpay.base.entity.errorBeanImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.imobpay.base.console.Console_Column;
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
public class MapResultBean<T> extends ReultErrorBean {
    /**
     * 列表对象返回类
     */
    private List<?> resultBean;
    /**
     * 对象返回
     */
    private T resultBeans;
 
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
    
    
    @Override
    public String returnBeanJson(String msgCode, String msgText) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(Console_Column.MSG_CODE, msgCode);
        resultMap.put(Console_Column.MSG_TEXT, msgText);
        return JSONObject.toJSONString(resultMap, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty);
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
    public String getTotalResult(List<?> resultBean, String msgCode, String msgText) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(Console_Column.MSG_CODE, msgCode);
        resultMap.put(Console_Column.MSG_TEXT, msgText);
        resultMap.put(Console_Column.RESULTBEAN, resultBean);
        return JSONObject.toJSONString(resultMap, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.DisableCircularReferenceDetect);

    }
    /**
     * 
     * 方法名： getTotalResult.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:15:37.<br/>
     * 参数或者异常：@param resultBeans
     * 参数或者异常：@param msgCode
     * 参数或者异常：@param msgText
     * 参数或者异常：@return .<br/>
     * 返回值： @return 返回结果：String.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public String getTotalResult( T resultBeans, String msgCode, String msgText) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put(Console_Column.MSG_CODE, msgCode);
        resultMap.put(Console_Column.MSG_TEXT, msgText); 
        resultMap.put(Console_Column.RESULTBEAN, resultBeans); 
        return JSONObject.toJSONString(resultMap, filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.DisableCircularReferenceDetect);

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
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:11:49.<br/>
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
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:11:49.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public void setResultBean(List<?> resultBean) {
        this.resultBean = resultBean;
    }


    /** 
     * 方法名： getResultBeans.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:11:49.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public T getResultBeans() {
        return resultBeans;
    }


    /** 
     * 方法名： setResultBeans.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param resultBeans 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:11:49.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public void setResultBeans(T resultBeans) {
        this.resultBeans = resultBeans;
    }


}
