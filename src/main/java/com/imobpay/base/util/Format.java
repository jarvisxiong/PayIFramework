package com.imobpay.base.util;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.imobpay.base.log.LogPay;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 
 * <pre>
 * ClassName: Format <br/> 
 * Function: 关于格式化的工具类. <br/> 
 * Reason: 关于格式化的工具类. <br/> 
 * date: 2016年6月1日 下午1:46:06 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 ServerFramework 1.0 . <br/> 
 * </pre>
 */
@SuppressWarnings("all")
public class Format {
    /**
     * 序列
     */
    private static int sequence = 0;

    /**
     * 
     * 方法名： getLocalTrmSeqNum.<br/>
     * 获取六位自动增长码
     * 创建者：madman.<br/>
     * 创建日期：2016年3月15日.<br/>
     * 创建时间：上午11:11:08.<br/>
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 userServer 1.0.<br/>
     */
    public static synchronized String getSequenceNo() {
        sequence = sequence >= 999999 ? 1 : sequence + 1;
        String s = Integer.toString(sequence);
        return addLeftZero(s, 6);
    }

    /**
     * 
     * 方法名： time.<br/>
     * 方法作用:
     * 获取系统当前时间
     * 创建者：madman.<br/>
     * 创建日期：2016年3月15日.<br/>
     * 创建时间：下午1:10:52.<br/>
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 userServer 1.0.<br/>
     */
    public static String time() {
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmss");
        String sdate = sd.format(date);
        return sdate;
    }

    /**
     * string缂侀悗鐤亹閹惧啿闁哄啨鍎插﹢?
     * 
     * @return String
     */
    public static String formatDate() {
        String sdate = time();
        return sdate.substring(0, 8);
    }

    /**
     * String缂侀悗鐤亹閹惧啿闁哄啫鐖煎Λ?濞达綇鎷�     * 
     * @return String
     */
    public static String formatTime() {
        String sdate = time();
        return sdate.substring(8, 14);
    }

    /**
     * 
      *@方法名称:getBeforeMin
      *@方法作用：取当前时间的前多少分钟
      *@方法条件：
      *@方法流程：
      *@作者:madman
      *@param i 参数
      *@return 返回结果
     */
    public static String getBeforeMin(int i) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, -i);
        date = calendar.getTime();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateBefore = sd.format(date);
        return dateBefore;
    }

    /**
     * 
     * @author madman  浣滆�
     * @param number 鍙傛暟
     * @return  缁撴灉
     * @since JDK 1.6 JDK鐗堟湰
     */
    public static boolean luhnTest(String number) {
        int s1 = 0;
        int s2 = 0;
        String reverse = new StringBuffer(number).reverse().toString();
        for (int i = 0; i < reverse.length(); i++) {
            int digit = Character.digit(reverse.charAt(i), 10);
            if (i % 2 == 0) {
                s1 += digit;
            } else {
                s2 += 2 * digit;
                if (digit >= 5) {
                    s2 -= 9;
                }
            }
        }
        return (s1 + s2) % 10 == 0;
    }

    /**
     * 闁轰胶澧楀畵渚�冀閻撳海纭�柛鏍垫嫹
     * 
     * @param str
     *            濞磋偐濮撮崣鍡�濡ゅ喚鍎婂☉鎾瑰皺鐞氬垂鐎ｇ暠闁轰胶澧楀畵?
     * @return String
     */
    public static String formatDecimal(String str) {
        if (str == null) {
            str = "0.00";
            return str;
        }
        return String.valueOf(Double.parseDouble(str));
    }

    /**
     * @param date
     *            濞磋偐濮撮崣鍡�濡ゅ喚鍎婂☉鎾瑰皺鐞氬垂鐎ｇ暠闁哄啨鍎插﹢?
     * @throws Exception
     *             NullPointerException
     * @return String
     */
    public static String dateTimeFormat(String date) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Date d = df.parse(date);
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return df2.format(d);
    }

    /**
     *
     * @param date
     *            濞磋偐濮撮崣鍡�濡ゅ喚鍎婂☉鎾瑰皺鐞氬垂鐎ｇ暠闁哄啨鍎插﹢?
     * @throws Exception
     *             NullPointerException
     * @return String
     */
    public static String dateFormat(String date) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date d = df.parse(date);
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        return df2.format(d);
    }

    /**
     * 
      *@方法名称:getTrmSeqNum
      *@方法作用：
      *@方法条件：
      *@方法流程：
      *@作者:madman
      *@return 返回结果
     */
    public static synchronized String getTrmSeqNum() {
        sequence = sequence >= 999999 ? 1 : sequence + 1;
        String s = Integer.toString(sequence);
        return addLeftZero(s, 6);
    }

    /**
     * 
      *@方法名称:addLeftZero
      *@方法作用：
      *@方法条件：
      *@方法流程：
      *@作者:madman
      *@param s 参数
      *@param length 长度
      *@return 结果
     */
    public static String addLeftZero(String s, int length) {
        // StringBuilder sb=new StringBuilder();
        int old = s.length();
        if (length > old) {
            char[] c = new char[length];
            char[] x = s.toCharArray();
            if (x.length > length) {
                throw new IllegalArgumentException("Numeric value is larger than intended length: " + s + " LEN " + length);
            }
            int lim = c.length - x.length;
            for (int i = 0; i < lim; i++) {
                c[i] = '0';
            }
            System.arraycopy(x, 0, c, lim, x.length);
            return new String(c);
        }
        return s.substring(0, length);

    }

    /**
     * 16閺夆晜绋戦崺妤佹姜椤戣儻绀�閺夆晜绋戦崺?
     * 
     * @param hexString
     *            16閺夆晜绋戦崺妤�濡ゅ喚鍎婂☉鎿勬嫹
     * @return String
     */
    public static String hexString2binaryString(String hexString) {
        if (hexString == null || hexString.length() % 2 != 0) {
            return null;
        }

        String bString = "";
        String tmp;
        for (int i = 0; i < hexString.length(); i++) {
            tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString.substring(i, i + 1), 16));
            bString += tmp.substring(tmp.length() - 4);
        }
        return bString;
    }

    /**
     * 閺夌偞妲掕缂傚啯閿�闁绘瑯鍏涚粭鍌炲礂閹峰苯鐏�闁奸缚绮鹃崵婊勫?绁╂慨妯奸崵婊兠归敓浠嬫嚐闁秵纰傞柛鏍ㄧ墪婢с倖绗熼敓浠嬪船閸欐闁哄洦褰冮崺鍡欑矉閿熺晫鎷担鍛婅含闁告碍绋掗敓浠嬫煂閿熶粙寮伴妸锔斤級闁烩晠鏅茬欢?濞寸姴锕ら¨宥夊矗閸垺绁茬紒鍌︽嫹濞戞搫鎷烽崵骞冮崣澶婄亞 缂備礁鐗忛—褎鎷呴崗鍛溄闁奸鑳堕悡?缂佹鍨奸惃銉╁础閸愩劌瀣�柟褰冮弸?16閺夆晜绋戦崺妤呭极閹峰本绁☉鎾虫惈閻⊙囨嚍閸屾稒娈剁紓渚婃嫹
     * 
     * @param hexString
     *            16閺夆晜绋戦崺妤呭极閿�
     * @return 閻庢稒婵″极閹电煁
     */
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || "".equals(hexString)) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    /**
     * byte闁轰焦澹嗙划宥嗘姜椤掍礁搴婇柟杈炬嫹6閺夆晜绋戦崺妤�濡ゅ喚鍎婂☉鎿勬嫹
     * 
     * @param src
     *            濞磋偐濮撮崣鍡�濡ゅ嫬螡闁轰焦澹嗙划?
     * @return String
     */
    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * byte闁轰焦澹嗙划宥嗘姜椤掍礁搴婇柟杈炬嫹6閺夆晜绋戦崺妤�濡ゅ喚鍎婇柡浣瑰缁�
     * 
     * @param src
     *            濞磋偐濮撮崣鍡�濡ゅ嫬螡闁轰焦澹嗙划?
     * @return String
     */
    public static String[] bytesToHexStrings(byte[] src) {
        if (src == null || src.length <= 0) {
            return null;
        }
        String[] str = new String[src.length];

        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                str[i] = "0";
            }
            str[i] = hv;
        }
        return str;
    }

    /**
     * byte闁轰焦澹嗙划宥嗘姜椤掍礁搴婇柟杈炬嫹6閺夆晜绋戦崺妤�濡ゅ喚鍎婇柡浣瑰缁�
     * 
     * @param c
     *            濞磋偐濮撮崣鍡�濮婃潱
     * @return byte
     */
    private static byte charToByte(char c) {

        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /**
     * md5闁告梻濮撮惁?16閺夆晜绋戦崺妤佹姜椤�鎽熼柤鍝勫�閺嗙喓绱掗崚纾�闁告梻濮撮惁?
     * 
     * @param b
     *            閻庢稒婵″极閹电煁
     * @return String
     */
    public static final String md5(byte[] b) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        try {
            byte[] strTemp = b;
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 闁告帒妫滃ù鍡涘箲椤ゅ秷绀嬮柛蹇ユ嫹
     * 
     * @param fen 
     *            閻庢稒椤戜焦绋夐敓?
     * @return String
     */
    public static String fromFenToYuan(String fen) {
        String yuan = "";
        // 鐎归潻绠戦獮?
        int mULTIPLIER = 100;
        Pattern pattern = Pattern.compile("^[1-9][0-9]*{1}");
        Matcher matcher = pattern.matcher(fen);
        if (matcher.matches()) {
            yuan = new BigDecimal(fen).divide(new BigDecimal(mULTIPLIER)).setScale(2).toString();
        }
        return yuan;
    }

    /**
     * base64字符转为byte数组
     * 
     * @param baseString
     *            base64字符
     * @return byte[]
     */
    public static byte[] decryptBASE64(String baseString) {
        if (baseString == null || "".equals(baseString)) {
            return null;
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] by = decoder.decodeBuffer(baseString);
            for (int i = 0; i < by.length; ++i) {
                if (by[i] < 0) {// 调整异常数据
                    by[i] += 256;
                }
            }
            return by;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 字节数组转base64
     * 
     * @param parme
     *            字节数组
     * @return String
     */
    public static String encoderBASE64(byte[] parme) {
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(parme);

    }

    /**
     * BASE64閻熸瑱绲介惁鎲塺l
     * 
     * @param b
     *            閻庢稒椤戜焦绋夐幓鎺旀闁告牭鎷�     * @throws Exception
     *             濠㈠爢鍐＝閻㈡嫹
     */
    public static void writePic(byte[] b) throws Exception {
        File f = new File("/home/weblogic/outs.jpg");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(b);

        fos.flush();
        fos.close();
    }

    /** 
     * pc-qt 閻庢稒椤戜焦绋夐煫鐟濋悺鎺戝暱娑斿繒鎮伴敓?
     * @param str 闂傚浄鎷烽—鍛村即鐎涙ɑ鐓�柣銊ュ閻⊙呯箔閿旇儻
     * @param strLength 闁哄牞鎷烽幃妤呮閿熺晫婀撮柣銊ュ閻⊙呯箔閿旇儻闁汇劌瀚伴弳杈ㄦ償閿�
     * @return
     * 
     * @return String
     */
    public static String addZeroForNum(String str, int strLength) {
        int strLen = str.length();
        StringBuffer sb = null;
        while (strLen < strLength) {
            sb = new StringBuffer();
            sb.append("0").append(str); // 鐎归潻鎷烽柛鎿勬嫹閻炴冻鎷� str = sb.toString();
            strLen = str.length();
        }
        return str;
    }

    /**
     * 定义数据
     */
    public static final Object[] RAND = { 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };

    /**
     * 
      *@方法名称:getRandom
      *@方法作用：
      *@方法条件：
      *@方法流程：
      *@作者:madman
      *@return 返回随机数
     */
    public static String getRandom() {
        Random random = new Random();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(10);
            str.append(RAND[r]);
        }
        return str.toString();
    }

    /**
     * 生成两位随机数
     * @return String
     */
    public static String getTwoRand() {
        StringBuffer random = new StringBuffer();
        Random r = new Random();
        for (int i = 0; i < 2; i++) {
            random.append(r.nextInt(9));
        }
        return random.toString();
    }

    /**
     * 
     * 【方法名】    : 判断当前字符串是否为数字. <br/> 
     * 【注意】: (这里描述这个方法的注意事项 – 可选).<br/> 
     * 【作者】: 张朝辉 .<br/>
     * 【时间】： 2016年10月18日 下午4:18:47 .<br/>
     * 【参数】： .<br/>
     * @param str 返回数字字符串
     * @return .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: 张朝辉 修改描述：创建新新件 .<br/>
     * <p/>
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 【方法名】    : getloantime. <br/> 
     * 【注意】: (这里描述这个方法的注意事项 – 可选).<br/> 
     * 【作者】: 张朝辉 .<br/>
     * 【时间】： 2016年10月18日 下午4:18:47 .<br/>
     * 【参数】： .<br/>
     * @param date 日期字符串
     * @return .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: 张朝辉 修改描述：创建新新件 .<br/>
     * <p/>
     * @throws Exception 
     */
    public static boolean getloantime(String date) throws Exception  {
        boolean flag = false;
        Date date1 = null;
        Date date2 = null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        date1 = sf.parse(date);
        date2 = sf.parse(formatDate());
        long l = (date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24);
        LogPay.info("据需还款日："+l);
        if (l>=0&&l < 4) {
            flag = true;
        }
        return flag;

    }
    /**
     * 
     * @param args 传入参数
     * @throws Exception 
     * @throws ParseException
     */
    public static void main(String[] args) throws Exception{
/*        String dateStr = "20161025";
        boolean flag = false;
        Date date = null;
        Date nowDate = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        try {
            date = sf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long l = (date.getTime() - nowDate.getTime()) / (1000 * 60 * 60 * 24);
        if (l < 4) {
            System.out.println(l);
        }
        System.out.println(20161023 - 20161020);
        System.out.println("没有到临近账单日");*/
        
        System.out.println(getloantime("20161028"));
    }
}
