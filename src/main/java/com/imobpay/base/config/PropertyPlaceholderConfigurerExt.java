/**
 *  <pre>	
 *  Project Name:UserDServer .</br>
 *  File: Snippet.java .</br>
 *  Package Name:com.imobpay.base.util .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月1日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.config;

import java.util.Properties;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.imobpay.base.util.DesEncrypt;
import com.imobpay.base.util.Hex;
import com.imobpay.base.util.MD5;
import com.imobpay.base.util.Tools;

/**
 * <pre>
 * ClassName: Snippet <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2016年6月1日 下午5:24:15 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
public class PropertyPlaceholderConfigurerExt extends PropertyPlaceholderConfigurer {

    /**
     * 描述：对数据密码进行加密码.<br/>
     * 创建人：Lance.Wu .<br/>
     * 创建时间：2016年6月1日 下午5:24:52 .<br/>
     * 
     * @param beanFactory
     *            文件工厂.<br/>
     * @param props
     *            属性文件.<br/>
     */
    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) {

        String key = props.getProperty("db.proDesEncryptKey");
        String pwd = props.getProperty("db.password");
        key = MD5.md5(key);
        key = (key + key).substring(0, 48);
        String dec = dec(key, pwd);
        props.setProperty("db.password", dec);
        super.processProperties(beanFactory, props);
    }

    /**
     * dec:(解密). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param key
     *            密钥 <br/>
     * @param content
     *            密文内容 <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    private static String dec(String key, String content) {
        
        DesEncrypt des = new DesEncrypt();
        des.setKey(Hex.fromString(key));
        int s1len = content.length() / 2;
        if (s1len % 8 != 0) {
            int fill = ((s1len / 8) + 1) * 16;
            content = Tools.rightFill(content, fill, "0");
        }
        byte[] get3DesDesCode = des.get3DesDesCode(Hex.fromString(content));
        return new String(get3DesDesCode).trim();
    }

}
