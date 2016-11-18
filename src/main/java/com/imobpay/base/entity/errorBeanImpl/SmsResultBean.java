/** 
 * 包名: package com.imobpay.base.entity.errorBeanImpl; <br/> 
 * 添加时间: 2016年11月18日 上午11:23:03 <br/> 
 */
package com.imobpay.base.entity.errorBeanImpl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.entity.ReultErrorBean;

/**
 * <pre>
 * 【类型】: SmsResultBean <br/> 
 * 【作用】: 短信返回类 <br/>  
 * 【时间】：2016年11月18日 上午11:23:03 <br/> 
 * 【作者】：黄强 <br/>
 * </pre>
 */
@Service
public class SmsResultBean extends ReultErrorBean {
    /** 返回对像 */
    JSONObject json = new JSONObject();

    @Override
    public String returnBeanJson(String msgCode, String msgText) {
        json.put(Console_Column.P_MSG_CODE, msgCode);
        json.put(Console_Column.P_MSG_TEXT, msgText);
        return json.toString();
    }

}
