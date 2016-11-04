/**
 *  <pre>	
 *  Project Name:PayIFramework .</br>
 *  File: BeanToMapUtil.java .</br>
 *  Package Name:com.imobpay.base.util .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imobpay.base.log.LogPay;

/**
 * <pre>
 * ClassName: BeanToMapUtil <br/> 
 * Function: 对转与Map之间互转换. <br/> 
 * date: 2016年6月2日 下午2:59:02 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 PayIFramework 1.0 . <br/>
 * </pre>
 */
public final class BeanToMapUtil {

    /** 对像转Map */
    private BeanToMapUtil() {
    }

    /**
     * 将一个 Map 对象转化为一个 JavaBean <br/>
     * 
     * @param type
     *            要转化的类型 <br/>
     * @param map
     *            包含属性值的 map
     * @return 转化出来的 JavaBean 对象 <br/>
     */
    public static Object convertMap(Class<?> type, Map<String, Object> map) {
        Object obj = null;
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性
            obj = type.newInstance(); // 创建 JavaBean 对象
            // 给 JavaBean 对象的属性赋值
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptors.length; i++) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                if (map.containsKey(propertyName)) {
                    // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
                    Object value = map.get(propertyName);
                    Object[] args = new Object[1];
                    args[0] = value;
                    descriptor.getWriteMethod().invoke(obj, args);
                }
            }
        } catch (Exception e) {
            LogPay.error(e.getMessage(), e);
        }
        return obj;
    }

    /**
     * 将一个 Map 对象转化为一个 JavaBean <br/>
     * @param type 要转化的类型 <br/>
     * @param  maps 包含属性值的 map
     * @return 转化出来的 JavaBean 对象 <br/>
     */
    public static List<Object> convertListMap(Class<?> type, List<Map<String, Object>> maps) {
        List<Object> li = new ArrayList<Object>();
        for (Map<String, Object> map : maps) {
            Object obj = convertMap(type, map);
            li.add(obj);
        }
        return li;
    }

    /**
     * 将一个 JavaBean 对象转化为一个 Map <br/>
     * 
     * @param bean
     *            要转化的JavaBean 对象 <br/>
     * @return 转化出来的 Map 对象 <br/>
     */
    public static Map<String, Object> convertBean(Object bean) {
        Map<String, Object> returnMap = null;
        try {

            Class<?> type = bean.getClass();
            returnMap = new HashMap<String, Object>();
            BeanInfo beanInfo = Introspector.getBeanInfo(type);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptors.length; i++) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                if (!"class".equals(propertyName)) {
                    Method readMethod = descriptor.getReadMethod();
                    Object result = readMethod.invoke(bean, new Object[0]);
                    if (result != null) {
                        returnMap.put(propertyName, result);
                    } else {
                        returnMap.put(propertyName, "");
                    }
                }
            }
        } catch (Exception e) {
            LogPay.error(e.getMessage(), e);
        }
        return returnMap;
    }

    /**
     * 将一个 JavaBean 对象转化为一个 Map <br/>
     * @param beans 要转化的JavaBean 对象 <br/>
     * @return 转化出来的 Map 对象 <br/>
     */
    public static List<Map<String, Object>> convertListBean(List<?> beans) {
        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        try {
            for (Object bean : beans) {
                items.add(convertBean(bean));
            }
        } catch (Exception e) {
            LogPay.error(e.getMessage(), e);
        }
        return items;
    }

}
