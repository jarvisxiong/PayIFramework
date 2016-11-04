/**
 *  <pre>	
 *  Project Name:PayIFramework .</br>
 *  File: VipStartLev.java .</br>
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
 * ClassName: VipStartLev <br/> 
 * Function: 星级. <br/> 
 * date: 2016年6月16日 下午5:12:25 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 PayIFramework 1.0 . <br/>
 * </pre>
 */
public enum VipStartLev {
    /** 普通用户 */
    COMMON {
        @Override
        public String getDesc() {
            return "普通用户";
        }

        @Override
        public int getLev() {
            return 1;
        }
    },
    /** 一星用户 */
    ONE {
        @Override
        public String getDesc() {
            return "一星用户";
        }

        @Override
        public int getLev() {
            return 2;
        }
    },
    /** 二星用户 */
    TWO {
        @Override
        public String getDesc() {
            return "二星用户";
        }

        @Override
        public int getLev() {
            return 3;
        }
    },
    /** 三星用户 */
    THREE {
        @Override
        public String getDesc() {
            return "三星用户";
        }

        @Override
        public int getLev() {
            return 4;
        }
    },
    /** 四星用户 */
    FOUR {
        @Override
        public String getDesc() {
            return "四星用户";
        }

        @Override
        public int getLev() {
            return 5;
        }
    },
    /** 五星用户 */
    FIVE {
        @Override
        public String getDesc() {
            return "五星用户";
        }

        @Override
        public int getLev() {
            return 6;
        }
    };

    /**
     * 
     * getDesc:(获取内容). <br/>
     * 
     * @author Lance.Wu <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    public abstract String getDesc();

    /**
     * 
     * getLev:(获取等级). <br/>
     * 
     * @author Lance.Wu <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    public abstract int getLev();
}
