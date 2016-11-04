/**
 *  <pre>	
 *  Project Name:PayIFramework .</br>
 *  File: CustomerStatus.java .</br>
 *  Package Name:com.imobpay.base.enums .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月16日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.enums;

/**
 * <pre>
 * ClassName: CustomerStatus <br/> 
 * Function: 用户状态. <br/> 
 * date: 2016年6月16日 下午5:26:58 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 PayIFramework 1.0 . <br/>
 * </pre>
 */
public enum CustomerStatus {

    /** 新用户 */
    NEW {
        @Override
        public String getDesc() {
            return "新用户";
        }

        @Override
        public String getStatus() {
            return "0";
        }
    },
    /** 已完善信息 */
    PERFECT {
        @Override
        public String getDesc() {
            return "已完善信息";
        }

        @Override
        public String getStatus() {
            return "1";
        }
    },
    /** 审核中 */
    REVIEWIN {
        @Override
        public String getDesc() {
            return "审核中";
        }

        @Override
        public String getStatus() {
            return "2";
        }
    },
    /** 初审通过 */
    REVIEWSTARTPASS {
        @Override
        public String getDesc() {
            return "初审通过";
        }

        @Override
        public String getStatus() {
            return "3";
        }
    },
    /** 您的实名初审已通过，请等待终审*/
    FIRSTAUDIT {
        @Override
        public String getDesc() {
            return "您的实名初审已通过，请等待终审";
        }

        @Override
        public String getStatus() {
            return "3";
        }
    },
    /** 审核通过 */
    REVIEWENDPASS {
        @Override
        public String getDesc() {
            return "审核通过";
        }

        @Override
        public String getStatus() {
            return "5";
        }
    },
    /** 审核驳回 */
    REVIEWFAIL {
        @Override
        public String getDesc() {
            return "审核驳回";
        }

        @Override
        public String getStatus() {
            return "4";
        }
    },

    /** 图片上传中 */
    REALNAMEUPDATE {
        @Override
        public String getDesc() {
            return "图片上传中";
        }

        @Override
        public String getStatus() {
            return "5";
        }
    },
    /** 状态未知 */
    STATUSFAIL {
        @Override
        public String getDesc() {
            return "状态未知";
        }

        @Override
        public String getStatus() {
            return "6";
        }
    };

    /**
     * getDesc:(获取内容). <br/>
     * 
     * @author Lance.Wu <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    public abstract String getDesc();

    /**
     * getStatus:(获取状态). <br/>
     * 
     * @author Lance.Wu <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    public abstract String getStatus();

}
