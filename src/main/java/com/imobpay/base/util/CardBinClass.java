package com.imobpay.base.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.exception.QTException;

/**
 * :
 * 
 * @author Lance.Wu
 * @since 2015年6月30日 下午6:15:30
 * 
 *        <pre>
 * 卡类型
 * </pre>
 */
public class CardBinClass {

    /** 卡类型列表 */
    public static Map<String, String> cType       = new HashMap<String, String>();
    /** 业务类型集合 */
    public static List<String>        bindType    = new ArrayList<String>();
    /** 业务类型集合 */
    public static Map<String, String> contactsMap = new HashMap<String, String>();

    /** 添加初始类型 */
    static {
        /** 01:借记卡 , 02:预付卡 , 03: 信用卡 */
        cType.put("01", "D");
        cType.put("02", "P");
        cType.put("03", "C");
        /** 交易类型 绑定类型 */
        bindType.add("T");
        bindType.add("L");
        bindType.add("ZY");
        contactsMap.put("01", "一级");
        contactsMap.put("02", "二级");
        contactsMap.put("03", "三级");
    }

    /**
     * 
     * getCType:(获取卡类型). <br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * 
     * @author madman 作者
     * @param key
     *            参数
     * @return 返回结果
     * @since JDK 1.6 JDK版本
     */
    public static String getCType(String key) {
        if (EmptyChecker.isEmpty(cType.get(key))) {
            return key;
        }
        return (String) cType.get(key);
    }

    /**
     * 
     * 【方法名】 : (判断当前交易是否支持当前卡). <br/>
     * 【作者】: madman .<br/>
     * 【时间】： 2016年10月24日 下午2:12:30 .<br/>
     * 【参数】： .<br/>
     * 
     * @param bindType
     *            绑定类型
     * @param cardType
     *            卡类型
     * @return 返回结果
     * @throws QTException .<br/>
     *         自定义异常
     *         <p>
     *         修改记录.<br/>
     *         修改人: madman 修改描述：创建新新件 .<br/>
     *         <p/>
     */
    public static boolean checkBindType(String bindType, String cardType) throws QTException {
        if ("RF".equals(bindType)) {
            if (!"D".equals(getCType(cardType))) {
                throw new QTException(Console_ErrCode.PARAM_EMPTY, Console_ErrCode.ERROR_BIND_D);
            }
            return true;
        } else {
            throw new QTException(Console_ErrCode.PARAM_EMPTY, Console_ErrCode.ERROR_BIND_TYPE);
        }
    }

    /**
     * 
     * 【方法名】 : (这里用一句话描述这个方法的作用). <br/>
     * 【注意】: (这里描述这个方法的注意事项 – 可选).<br/>
     * 【作者】: madman .<br/>
     * 【时间】： 2016年10月24日 下午2:47:33 .<br/>
     * 【参数】： .<br/>
     * 
     * @param bindType
     *            绑定类型
     * @param userName
     *            当前姓名
     * @param cusName
     *            客户姓名
     * @param cusStatus
     *            客户状态
     * @return 返回结果
     * @throws QTException .<br/>
     *         自定义异常
     *         <p>
     *         修改记录.<br/>
     *         修改人: madman 修改描述：创建新新件 .<br/>
     *         <p/>
     */
    public static boolean checkCardHolder(String bindType, String userName, String cusName, String cusStatus) throws QTException {
        if ("RF".equals(bindType)) {
            if (!"3".equals(cusStatus)) {
                throw new QTException(Console_ErrCode.PARAM_EMPTY, Console_ErrCode.ERROR_CUS_STATUS);
            }
            if (userName.equals(cusName)) {
                return true;
            }
            return false;
        } else {
            throw new QTException(Console_ErrCode.PARAM_EMPTY, Console_ErrCode.ERROR_BIND_TYPE);
        }
    }

    /**
     * 
     * 【方法名】 : (判断哪些交易类型需要判断是否为本人). <br/>
     * 【作者】: madman .<br/>
     * 【时间】： 2016年11月2日 下午2:51:15 .<br/>
     * 【参数】： .<br/>
     * 
     * @param bindType
     *            绑定类型
     * @param holder
     *            是否为本人
     * @return 返回结果
     * @throws QTException .<br/>
     *         <p>
     *         修改记录.<br/>
     *         修改人: madman 修改描述：创建新新件 .<br/>
     *         <p/>
     */
    public static boolean checkBindTypeHolder(String bindType, boolean holder) throws QTException {
        if ("RF".equals(bindType) && holder) {
            return true;
        }
        return false;
    }

    /**
     * 
     * 【方法名】 : (获取人脉类型). <br/>
     * 【作者】: madman .<br/>
     * 【时间】： 2016年11月8日 下午7:03:08 .<br/>
     * 【参数】： .<br/>
     * 
     * @param contact
     *            人脉类型
     * @return .<br/>
     *         <p>
     *         修改记录.<br/>
     *         修改人: madman 修改描述：创建新新件 .<br/>
     *         <p/>
     */
    public static String getContactValue(String contact) {
        if (EmptyChecker.isEmpty(contact)) {
            return "未知";
        }
        if (contactsMap.containsKey(contact.trim())) {
            return contactsMap.get(contact.trim());
        }
        return "未知";
    }
}
