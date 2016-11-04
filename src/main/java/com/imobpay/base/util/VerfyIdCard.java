package com.imobpay.base.util;

/**
 * ClassName: VerfyIdCard <br/>
 * Function: 身份证号验证、长度转换类 <br/>
 * date: 2015年7月24日 下午12:02:44 <br/>
 * @author Lance.Wu
 * @version
 * @since JDK 1.6
 */
public final class VerfyIdCard {
    /** wi =2(n-1)(mod 11);加权因子 **/ 
    static final int[]    WI   = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
    /** 校验码 */ 
    static final int[]    VI   = { 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 };
    /** 格式 */
    private static int[]  ai   = new int[18];

    /** 最后一位数字 */ 
    private static String last = null;                                                       

    /** 私有 */
    private  VerfyIdCard() {
    }

    /**
     * convert218:(将15位身份证转换成18位). <br/>
     * @author Lance.WU
     * @param idcard15
     *            15位身份证号码
     * @return 18位身份证号码
     * @since JDK 1.6e
     * 
     *        <pre>
     * 案例：
     *     
     *     定义一个： 15位身份证
     *     
     *     String idcard15 = "130503670401001"
     *     String convert218 = convert218(idcard15);
     *     
     * 显示结果为：130503196704010016
     * </pre>
     */
    public static String convert218(String idcard15) {
        if (idcard15.length() == 15) {
            String idcard = uptoeighteen(idcard15);
            last = getVerify(idcard);
            idcard += last;
            return idcard;
        }
        return idcard15;
    }

    /**
     * 
     * conver18CardTo15:(将18位身份证转换成15位). <br/>
     * 
     * @autho Lance.WU
     * @param idCard
     *            18位身份证号码
     * @return 15位身份证
     * @since JDK 1.6
     * 
     *        <pre>
     * 案例：
     *     
     *     定义一个： 18位身份证
     *     
     *     String idcard18 = "130503196704010016"
     *     String convert218 = conver18CardTo15(idcard18);
     *     
     * 显示结果为：130503670401001
     * </pre>
     */
    public static String conver18CardTo15(String idCard) {
        String idCard15 = "";
        if (idCard.length() != 18) {
            return null;
        }
        StringBuffer sb = new StringBuffer(idCard);
        sb.deleteCharAt(17);
        sb.deleteCharAt(7);
        sb.deleteCharAt(6);
        idCard15 = sb.toString();
        return idCard15;
    }

    /**
     * 
     * verify:(校验身份证的校验码). <br/>
     * 
     * @author Lance.Wu
     * @param idcard
     *            身份证号码
     * @return 验证结果
     * @since JDK 1.6
     * 
     *        <pre>
     * 案例：
     * 
     *     String idCard18 = "130503196704010016" ;
     *     String idCard15 = "130503670401001" ;
     *     
     *     boolean result18 = verify(idCard18);
     *     boolean result15 = verify(idCard15);
     *     
     * 结果： true 代表有效身份证。 false 代表无效身份证
     * 
     * </pre>
     */
    public static boolean verify(String idcard) {
        if (idcard.length() == 15) {
            idcard = uptoeighteen(idcard);
            last = getVerify(idcard);
            idcard += last;
        }
        if (idcard.length() != 18) {
            return false;
        }
        last = idcard.substring(17, 18);
        if (last.equals(getVerify(idcard))) {
            return true;
        }
        return false;
    }

    /**
     * 
     * uptoeighteen:(15位转18位 --17位). <br/>
     * 
     * @author Lance.Wu
     * @param fifteen
     *            15位身份证号码
     * @return 转换后身份证号码
     * @since JDK 1.6
     * 
     * 
     *        <pre>
     * 案例：
     * 
     *     String idCard15 = "130503670401001" ;
     *     String uptoeighteen = uptoeighteen(idCard15);
     *     
     * 结果 ：13050319670401001
     * </pre>
     * 
     */
    private static String uptoeighteen(String fifteen) {
        StringBuffer eighteen = new StringBuffer(fifteen);
        eighteen = eighteen.insert(6, "19");
        return eighteen.toString();
    }

    /**
     * 
     * getVerify:(计算最后一位校验值 当为17位时 计算最后一位 当为18长度时，可校验最后一位). <br/>
     * 
     * @author Lance.Wu
     * @param eighteen
     *            18位身份证
     * @return 身份证的最后一份计算
     * @since JDK 1.6
     * 
     *        <pre>
     * 案例：
     *  String idCard18 = "130503196704010016";;
     *         String result = getVerify(idCard18);
     * 
     * 结果为： result: 6
     * </pre>
     */
    public static String getVerify(String eighteen) {
        int remain = 0;
        if (eighteen.length() == 18) {
            eighteen = eighteen.substring(0, 17);
        }
        if (eighteen.length() == 17) {
            int sum = 0;
            for (int i = 0; i < 17; i++) {
                String k = eighteen.substring(i, i + 1);
                ai[i] = Integer.valueOf(k).intValue();

            }
            for (int i = 0; i < 17; i++) {
                sum += WI[i] * ai[i];
            }
            remain = sum % 11;
        }
        return remain == 2 ? "X" : String.valueOf(VI[remain]);
    }
}