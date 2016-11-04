package com.imobpay.base.entity.errorBeanImpl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.entity.ReultErrorBean;

/**
 * 
 * 类名: DefaultResultBean <br/> 
 * 作用：默认返回类<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年7月5日 下午2:31:23 <br/> 
 * 版本：
 * @since JDK 1.6 PayUserServer 1.0
 */
@Service
public class DefaultResultBean extends ReultErrorBean {

    /** 返回对像 */
    JSONObject json = new JSONObject();
    
    @Override
    public String returnBeanJson(String msgCode, String msgText) {
        json.put(Console_Column.MSG_CODE, msgCode);
        json.put(Console_Column.MSG_TEXT, msgText);
        return json.toString();
    }
    
    
    
   
}
