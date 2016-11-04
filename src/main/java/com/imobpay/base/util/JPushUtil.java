/** 
 * 包名: package com.imobpay.service.util; <br/> 
 * 添加时间: 2016年2月26日 下午4:08:19 <br/> 
 */
/**
 *  Project Name:qtservices
 *  File: JPushUtil.java
 *  Package Name:com.imobpay.service.util
 *  <P>
 *  创建时间     创建者              修改记录
 *  2016年2月26日   黄强     Create
 *  </p>
 *  <p>File Description :  this Class dosome </p>
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.util;

import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

/**
 * 极光推送工具类 类名: JPushUtil <br/>
 * 作用：<br/>
 * 方法：<br/>
 * 创建者: 黄强. <br/>
 * 添加时间: 2016年2月26日 下午4:08:19 <br/>
 * 版本：
 * 
 * @since JDK 1.6 qtservices 1.0
 */
public class JPushUtil {
    /**
     * 按单个别名（alias）发送推送
     * 
     * @param alias
     *            别名
     * @param content
     *            内容
     * @return PushPayload
     */
    public static PushPayload pushByAlias(String alias, String content) {
        return PushPayload.newBuilder().setPlatform(Platform.all()).setAudience(Audience.alias(alias)).setNotification(Notification.alert(content))
                .setOptions(Options.newBuilder().setApnsProduction(true).build()).build();
    }

    /**
     * 按多个别名（alias）发送推送
     * 
     * @param alias
     *            别名
     * @param content
     *            内容
     * @return PushPayload
     */
    public static PushPayload pushByAliast(String[] alias, String content) {
        return PushPayload.newBuilder().setPlatform(Platform.all()).setAudience(Audience.alias(alias)).setNotification(Notification.alert(content))
                .setOptions(Options.newBuilder().setApnsProduction(true).build()).build();
    }

    /**
     * 
     * 方法名： pushBytag.<br/>
     * 适用条件:<br/>
     * 执行流程:<br/>
     * 注意事项:<br/>
     * 方法作用:构建推送对象：平台是all，目标是 tag 为 "tag" 的设备<br/>
     *
     * 创建者：黄强.<br/>
     * 创建日期：2016年3月3日.<br/>
     * 创建时间：上午11:21:31.<br/>
     * 参数者异常：@param tag  目标<br/>
     * 参数者异常：@param content 内容 <br/>
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 qtservices 1.0.<br/>
     */
    public static PushPayload pushBytag(String tag, String content) {
        return PushPayload.newBuilder().setPlatform(Platform.all()).setAudience(Audience.tag(tag)).setNotification(Notification.alert(content)).build();
    }

    /**
     * 按单个别名（alias）发送消息
     * 
     * @param alias
     *            别名
     * @param content
     *            内容
     * @return PushPayload
     */
    public static PushPayload messageByAlias(String alias, String content) {
        return PushPayload.newBuilder().setPlatform(Platform.all()).setAudience(Audience.alias(alias)).setMessage(Message.content(content)).build();
    }

    /**
     * 按多个别名（alias）发送消息
     * 
     * @param alias
     *            别名
     * @param content
     *            内容
     * @return PushPayload
     */
    public static PushPayload messageByAlias(String[] alias, String content) {
        return PushPayload.newBuilder().setPlatform(Platform.all()).setAudience(Audience.alias(alias)).setNotification(Notification.alert(content)).build();
    }
}
