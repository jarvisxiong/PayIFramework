/**
 * Copyright Shanghai F-Road Commercial Services Co.,Ltd. All Rights Reserved.
 *
 * 文件名称: JunitBase.java
 * 修改历史: 
 *   2014-1-17  Lance.Wu    Create
 * 
 */
package com.imobpay.base.util;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.atomic.AtomicLong;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.log.LogPay;

/**
 * 
 * 类名: JunitBase <br/>
 * 作用：调用老系统工具类<br/>
 * 创建者: HuaiYu.Wen. <br/>
 * 添加时间: 2016年7月29日 下午1:19:41 <br/>
 * 版本：
 * 
 * @since JDK 1.6 PayIFramework 1.0
 */
public class JunitBase {

    /** 范围地址. */
    public static String         url          = "http://localhost:8080/TSM/tsm";

    /** key值. */
    private String               key;

    /** 请求连接. */
    private HttpURLConnection    connection;

    /** 缓存ID. */
    private String               jsessionId   = null;
    /** 是否加密. */
    private boolean              isEnc        = false;
    /** 计数器. */
    private int                  count        = 0;

    /** 报文编码. */
    private static final String  ENC_CODE     = "UTF-8";

    /** bits per input character. 8 - ASCII; 16 - Unicode */
    private static final int     CHRSZ        = 8;

    /**
     * hex output format. false -lowercase; true - uppercase.
     * 
     */
    private static final boolean HEXCASE      = false;

    /**
     * 16进制常量.
     */
    private static final int     HEX_0F       = 0x0F;

    /**
     * 16进制常量.
     */
    private static final int     HEX_FF       = 0xFF;

    static String[]              byteHexTable = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "0A", "0B", "0C", "0D", "0E", "0F", "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "1A", "1B", "1C", "1D", "1E", "1F", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "2A", "2B", "2C", "2D", "2E", "2F", "30", "31", "32", "33", "34", "35", "36", "37",
            "38", "39", "3A", "3B", "3C", "3D", "3E", "3F", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "4A", "4B", "4C", "4D", "4E", "4F", "50", "51", "52", "53", "54", "55", "56",
            "57", "58", "59", "5A", "5B", "5C", "5D", "5E", "5F", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "6A", "6B", "6C", "6D", "6E", "6F", "70", "71", "72", "73", "74", "75",
            "76", "77", "78", "79", "7A", "7B", "7C", "7D", "7E", "7F", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "8A", "8B", "8C", "8D", "8E", "8F", "90", "91", "92", "93", "94",
            "95", "96", "97", "98", "99", "9A", "9B", "9C", "9D", "9E", "9F", "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "AA", "AB", "AC", "AD", "AE", "AF", "B0", "B1", "B2", "B3",
            "B4", "B5", "B6", "B7", "B8", "B9", "BA", "BB", "BC", "BD", "BE", "BF", "C0", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "CA", "CB", "CC", "CD", "CE", "CF", "D0", "D1", "D2",
            "D3", "D4", "D5", "D6", "D7", "D8", "D9", "DA", "DB", "DC", "DD", "DE", "DF", "E0", "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "EA", "EB", "EC", "ED", "EE", "EF", "F0", "F1",
            "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "FA", "FB", "FC", "FD", "FE", "FF", };

    /**
     * The internal state associated with this pseudorandom number generator.
     * (The specs for the methods in this class describe the ongoing computation
     * of this value.)
     *
     * @serial
     */
    private final AtomicLong     seed         = new AtomicLong(0L);

    private final static long    multiplier   = 0x5DEECE66DL;
    private final static long    addend       = 0xBL;
    private final static long    mask         = (1L << 48) - 1;

    /**
     * 构造.
     * 
     * @param realpath
     *            : 服务器访问地址
     */
    public JunitBase(String realpath) {
        if (EmptyChecker.isNotEmpty(realpath)) {
            url = realpath;
        }
    }

    /**
     * @param realpath
     *            : 服务器访问地址
     * @param isEnc
     *            : 是否需要先获取密钥
     */
    public JunitBase(String realpath, boolean isEnc) {
        if (EmptyChecker.isNotEmpty(realpath)) {
            url = realpath;
        }
        if (isEnc) {
            String json = "{'JYM':'100000'}";
            getKey(json);
        }
    }

    /**
     * 构造.
     * 
     * @param realpath
     *            : 服务器访问地址
     * @param isEnc
     *            : 是否需要先获取密钥
     * @param json
     *            请求参数
     * @param 自定义密钥获取报文
     */
    public JunitBase(String realpath, boolean isEnc, String json) {
        if (EmptyChecker.isNotEmpty(realpath)) {
            url = realpath;
        }
        if (isEnc) {
            getKey(json);
        }
    }

    /***
     * 
     * 获取密钥.
     * 
     * <pre>
     *  Lance.Wu <功能详细描述>
     * </pre>
     * 
     * @param json
     *            获取密钥交易
     */
    public void getKey(String json) {
        isEnc = false;
        String resultMsg = send(json);
        JSONObject rjs = (JSONObject) JSONObject.toJSON(resultMsg);
        String rkey = rjs.getString("TOKEN");
        if (EmptyChecker.isNotEmpty(rkey)) {
            key = rkey;
            isEnc = true;
        }
    }

    /**
     * 
     * 发送请求.
     * 
     * <pre>
     *  Lance.Wu <功能详细描述>
     * </pre>
     * 
     * @param content
     *            请求报文
     * @return String
     */
    @SuppressWarnings("unused")
    public String send(String content) {

        String randonStr = createRandomNumber(Integer.parseInt("6"));
        try {
            URL urlConnect = new URL(url);
            connection = (HttpURLConnection) urlConnect.openConnection();
            connection.setConnectTimeout(Integer.parseInt("60000"));
            connection.setDoOutput(true);
            connection.setDoInput(true);
            if (EmptyChecker.isNotEmpty(jsessionId)) {
                connection.setRequestProperty("Cookie", "JSESSIONID=" + jsessionId);
            }
            connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("请检查URL是否正确" + e);

            return null;
        }

        String resultMsg = null;
        try {
            byte[] data = null;
            if (!isEnc) {
                data = content.getBytes("utf-8");
            } else {
                DesEncrypt des = new DesEncrypt();
                des.setKey(String2Hexbyte(key));

                String hexStr = byteArrayToHexString(content.getBytes(ENC_CODE));

                int s1len = hexStr.length() / 2;
                if (s1len % Integer.parseInt("8") != 0) {
                    int fill = ((s1len / Integer.parseInt("8")) + 1) * Integer.parseInt("16");
                    hexStr = rightFill(hexStr, fill, "0");
                }

                data = des.get3DesEncCode(String2Hexbyte(hexStr));
            }
            byte[] random = randonStr.getBytes();

            String macData = randonStr + byteArrayToHexString(data);
            macData = getMac(macData);

            byte[] mac = macData.getBytes();

            int len = mac.length + random.length + data.length;
            byte[] blen = encodeHeadLength(len, 0, Integer.parseInt("16"), Integer.parseInt("8"), 0);

            connection.getOutputStream().write(blen);
            connection.getOutputStream().write(mac);
            connection.getOutputStream().write(random);
            connection.getOutputStream().write(data);

            connection.getOutputStream().flush();
            connection.getOutputStream().close();

            if (EmptyChecker.isEmpty(jsessionId)) {
                jsessionId = connection.getHeaderField("Set-Cookie");
                if (EmptyChecker.isNotEmpty(jsessionId)) {
                    jsessionId = jsessionId.substring(jsessionId.indexOf("=") + 1, jsessionId.indexOf(";"));
                }
            }
            InputStream is = connection.getInputStream();

            byte[] b = new byte[Integer.parseInt("8")];
            is.read(b, 0, Integer.parseInt("8"));
            int bodylen = decodeHeadLength(b, 0, Integer.parseInt("16"));

            byte[] body = new byte[bodylen];
            is.read(body, 0, bodylen);

            len = 0;
            String ctype = new String(body, len, 2);
            len = len + 2;
            String rmac = new String(body, len, Integer.parseInt("32"));
            len = len + Integer.parseInt("32");
            String randomStr = new String(body, len, Integer.parseInt("6"));
            len = len + Integer.parseInt("6");
            byte[] rbody = new byte[body.length - len];

            System.arraycopy(body, len, rbody, 0, body.length - len);

            if ("01".equals(ctype) && count != 0) {
                DesEncrypt des = new DesEncrypt();
                // System.out.println("密钥：" + key);
                des.setKey(String2Hexbyte(key));
                rbody = data = des.get3DesDesCode(rbody);
            }

            resultMsg = new String(rbody, ENC_CODE);

            // System.out.println("===================================");
            // System.out.println("是否加密：" + ctype);
            // System.out.println("验签字符串：" + rmac);
            // System.out.println("随机数：" + randomStr);
            // System.out.println("响应报文内容：" + resultMsg);
            // System.out.println("===================================");
            connection.disconnect();
            count++;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return resultMsg;
    }

    /**
     * 
     * 转换报文长度.
     * 
     * @param blen
     *            报文字节长度
     * @param lencode
     *            包头长度编码解析包头长度 缺省为0
     * @param type
     *            十进制 十六进制
     * @return int 报文长度
     * @see [类、类#方法、类#成员]
     */

    public static int decodeHeadLength(byte[] blen, int lencode, int type) {
        int length = 0;
        /*
         * 根据包头长度编码解析包头长度
         */
        if (lencode == 1) {
            // 按照网络字节序解析二进制包头长度
            // 网络字节序为：BIG-ENDIAN，与Java字节序相同。不需做高低字节转换
            length = Integer.parseInt(hex(blen), Integer.parseInt("16"));

        } else if (lencode == 2) {
            // 按照BCD解析二进制包头长度
            StringBuffer sb = new StringBuffer(blen.length * 2);
            for (int i = 0; i < blen.length; i++) {
                sb.append((blen[i] >>> Integer.parseInt("4")) & HEX_0F).append(blen[i] & HEX_0F);
            }
            length = Integer.parseInt(sb.toString(), Integer.parseInt("10"));
        } else {
            // 缺省按照ASCII 码解析
            String sLen = new String(blen);
            sLen = sLen.trim();
            length = Integer.parseInt(sLen, type);
        }

        return length;
    }

    /**
     * hex(将byte[]转换为十六进制的字符串)
     *
     * @Title: hex
     * @Description: 将byte[]转换为十六进制的字符串
     * @Date May 4, 2012 3:01:53 PM
     * @modifyDate May 4, 2012 3:01:53 PM
     * @param dst
     *            需要转换的byte[]
     * @return String 得到的十六进制的字符串 java.lang.String
     * 
     *         <pre>
     * 案例：
     * 
     *         String str = "hello";
     *         byte[] data = str.getBytes();
     *         String hex = hex(data);
     *         
     *         结果： hex : 68656C6C6F
     * </pre>
     */
    public static String hex(byte[] dst) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < dst.length; i++) {
            sb.append(byteHexTable[dst[i] & 0xff]);
        }
        return sb.toString();
    }

    /**
     * 
     * 生成报文长度.
     * 
     * @param contentlen
     *            报文长度
     * @param lencode
     *            报文类型 1。二进制包头长度 2. 按照BCD组织二进制包头长度
     * @param type
     *            缺省按照ASCII 码情况下 10 十进制 16 十六进制
     * @param len
     *            转换后的长度
     * @param fill
     *            缺省按照ASCII 码情况下 补位数据
     * @return byte[] 字节数据
     * @see [类、类#方法、类#成员]
     */

    public static byte[] encodeHeadLength(int contentlen, int lencode, int type, int len, int fill) {
        byte[] bLen = new byte[len];
        /*
         * 根据包头长度编码组织包头长度
         */
        if (lencode == 1) {

            // 按照网络字节序组织二进制包头长度
            // 将长度转换为4字节
            byte[] bLenByte = new byte[Integer.parseInt("4")];
            bLenByte[0] = (byte) ((contentlen >>> Integer.parseInt("24")) & HEX_FF);
            bLenByte[1] = (byte) ((contentlen >>> Integer.parseInt("16")) & HEX_FF);
            bLenByte[2] = (byte) ((contentlen >>> Integer.parseInt("8")) & HEX_FF);
            bLenByte[Integer.parseInt("3")] = (byte) (contentlen & HEX_FF);

            // 设置包头长度
            for (int i = 1; i <= bLenByte.length && i <= len; i++) {
                bLen[len - i] = bLenByte[bLenByte.length - i];
            }
        } else if (lencode == 2) {
            // 按照BCD组织二进制包头长度
            String length = contentlen + "";
            if (contentlen % 2 != 0) {
                length = "0" + length;
            }
            byte[] bLenByte = new byte[length.length() / 2];
            for (int i = 0; i < bLenByte.length; i++) {
                bLenByte[i] = (byte) ((Integer.parseInt(length.substring(i * 2, i * 2)) << Integer.parseInt("4") + Integer.parseInt(length.substring(i * 2 + 1, i * 2 + 1))) & HEX_FF);
            }
            // 设置包头长度
            for (int i = 1; i <= bLenByte.length && i <= len; i++) {
                bLen[len - i] = bLenByte[bLenByte.length - i];
            }
        } else {
            // 缺省按照ASCII 码组织
            String length = "";
            if (type == Integer.parseInt("16")) {
                length = Integer.toHexString(contentlen);
            } else if (type == Integer.parseInt("10")) {
                length = contentlen + "";
            }
            while (length.length() < len) {
                length = fill + length;
            }
            bLen = length.getBytes();
        }

        return bLen;
    }

    /**
     * rightFill(按总长度-已经有的长度来右补数据) (是通过字节形式的长度来得到长度的)
     *
     * @Title: rigntFill
     * @Description: 按补的位数，右补数据
     * @Date May 4, 2014 2:31:16 PM
     * @modifyDate May 4, 2014 2:31:16 PM
     * @param src
     *            需要补位的数据 java.lang.String
     * @param count
     *            需要的总长度
     * @param in
     *            需要补的内容 java.lang.String
     * @return String 左补之后的内容
     */
    public static String rightFill(String src, int count, String in) {
        if (count > 0) {
            if (src.getBytes().length < count) {
                int i;
                String fills = "";
                if (in == null || in.equals(""))
                    in = "0";
                for (i = 0; i < count; i++) {
                    fills += in;
                }
                return src + fills.substring(0, fills.getBytes().length - src.getBytes().length);
            } else {
                return src;
            }
        } else {
            return src;
        }
    }

    /**
     * byteArrayToHexString(byte[]转换为十六进制的字符串形式)
     *
     * @Title: byteArrayToHexString
     * @Description: byte[]数组转换为十六进制的字符串形式
     * @Date May 2, 2014 25:42:19 PM
     * @modifyDate May 2, 2014 25:42:19 PM
     * @param b
     *            需要转换byte[]
     * @return String 十六进制的字符串 java.lang.String
     */
    public static String byteArrayToHexString(byte b[]) {
        return Hex.toString(b, 0, b.length);
    }

    /**
     * String2Hexbyte(将字符串转换为16进制形式的byte[])
     *
     * @Title: String2Hexbyte
     * @Description: 将字符串转换为16进制形式的byte[]
     * @Date May 2, 2014 26:20:10 PM
     * @modifyDate May 2, 2014 26:20:10 PM
     * @param src
     *            需要转换的字符串
     * @return byte[] 转换成功的byte[]
     */
    public static byte[] String2Hexbyte(String src) {
        byte[] b = null;
        int i, count;
        String temp = "";
        if (src.length() % 2 != 0) {
            src = "0" + src;
        }
        b = new byte[(src.length() / 2)];
        count = 0;
        for (i = 0; i < src.length();) {
            temp = src.substring(count * 2, count * 2 + 2);
            b[count] = Hex.fromString(temp)[0];
            count++;
            i += 2;
        }
        return b;
    }

    /**
     * 获取 connection.
     * 
     * @return 返回 connection
     */
    public HttpURLConnection getConnection() {
        return connection;
    }

    /**
     * 
     * 验证MAC.
     *
     * <pre>
     *  Lance.Wu <功能详细描述>
     * </pre>
     * 
     * @param c
     *            请求内容
     * @return
     * @return String
     */
    private static String getMac(String c) {
        return hex_sha1(c).substring(0, Integer.parseInt("32"));
    }

    /**
     * This is one of the functions you'll usually want to call It take a string
     * argument and returns either hex or base-64 encoded strings Creation date:
     * (3/27/2004 6:05:10 PM).
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return java.lang.String
     * @param s
     *            java.lang.String
     */
    public static String hex_sha1(String s) {
        s = (s == null) ? "" : s;
        return binb2hex(core_sha1(str2binb(s), s.length() * CHRSZ));
    }

    /**
     * Convert an array of big-endian words to a hex string. Creation date:
     * (3/27/2004 6:05:10 PM)
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return java.lang.String
     * @param binarray
     *            int[]
     */
    private static String binb2hex(int[] binarray) {
        String hexTab = HEXCASE ? "0123456789ABCDEF" : "0123456789abcdef";
        String str = "";
        for (int i = 0; i < binarray.length * 4; i++) {
            char a = (char) hexTab.charAt((binarray[i >> 2] >> ((3 - i % 4) * 8 + 4)) & 0xF);
            char b = (char) hexTab.charAt((binarray[i >> 2] >> ((3 - i % 4) * 8)) & 0xF);
            str += new Character(a).toString() + new Character(b).toString();
        }
        return str;
    }

    /**
     * Convert an 8-bit or 16-bit string to an array of big-endian words In
     * 8-bit function, characters >255 have their hi-byte silently ignored.
     * Creation date: (3/26/2004 1:05:01 PM)
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int[]
     * @param str
     *            java.lang.String
     */
    private static int[] str2binb(String str) {
        str = (str == null) ? "" : str;
        int[] tmp = new int[str.length() * CHRSZ];
        int mask = (1 << CHRSZ) - 1;
        for (int i = 0; i < str.length() * CHRSZ; i += CHRSZ) {
            tmp[i >> 5] |= ((int) (str.charAt(i / CHRSZ)) & mask) << (24 - i % 32);
        }
        int len = 0;
        for (int i = 0; i < tmp.length && tmp[i] != 0; i++) {
            len++;
        }
        int[] bin = new int[len];
        for (int i = 0; i < len; i++) {
            bin[i] = tmp[i];
        }
        return bin;
    }

    /**
     * Calculate the SHA-1 of an array of big-endian words, and a bit length
     * Creation date: (3/26/2004 1:05:01 PM).
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int
     * @param x
     *            java.lang.String[]
     * @param len
     *            int
     */
    private static int[] core_sha1(int[] x, int len) {
        /* append padding */
        int size = len >> 5;
        x = strechBinArray(x, size);
        x[len >> 5] |= 0x80 << (24 - len % 32);
        size = ((len + 64 >> 9) << 4) + 15;
        x = strechBinArray(x, size);
        x[((len + 64 >> 9) << 4) + 15] = len;
        int[] w = new int[80];
        int a = 1732584193;
        int b = -271733879;
        int c = -1732584194;
        int d = 271733878;
        int e = -1009589776;
        for (int i = 0; i < x.length; i += 16) {
            int olda = a;
            int oldb = b;
            int oldc = c;
            int oldd = d;
            int olde = e;
            for (int j = 0; j < 80; j++) {
                if (j < 16) {
                    w[j] = x[i + j];
                } else {
                    w[j] = rol(w[j - 3] ^ w[j - 8] ^ w[j - 14] ^ w[j - 16], 1);
                }
                int t = safe_add(safe_add(rol(a, 5), sha1_ft(j, b, c, d)), safe_add(safe_add(e, w[j]), sha1_kt(j)));
                e = d;
                d = c;
                c = rol(b, 30);
                b = a;
                a = t;
            }
            a = safe_add(a, olda);
            b = safe_add(b, oldb);
            c = safe_add(c, oldc);
            d = safe_add(d, oldd);
            e = safe_add(e, olde);
        }
        int[] retval = new int[5];
        retval[0] = a;
        retval[1] = b;
        retval[2] = c;
        retval[3] = d;
        retval[4] = e;
        return retval;
    }

    /**
     * Add ints, wrapping at 2^32. This uses 16-bit operations internally to
     * work around bugs in some JS interpreters. The original function is part
     * of the sha1.js library. It's here for compatibility. Creation date:
     * (3/26/2004 1:05:01 PM)
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int
     * @param x
     *            int
     * @param y
     *            int
     */
    private static int safe_add(int x, int y) {
        int lsw = (int) (x & 0xFFFF) + (int) (y & 0xFFFF);
        int msw = (x >> 16) + (y >> 16) + (lsw >> 16);
        return (msw << 16) | (lsw & 0xFFFF);
    }

    /**
     * Bitwise rotate a 32-bit number to the left. * Creation date: (3/26/2004
     * 1:05:01 PM) Creation date: (3/27/2004 6:05:10 PM)
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int
     * @param num
     *            int
     * @param cnt
     *            int
     */
    private static int rol(int num, int cnt) {
        return (num << cnt) | (num >>> (32 - cnt));
    }

    /**
     * Determine the appropriate additive constant for the current iteration
     * Creation date: (3/26/2004 1:05:01 PM).
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int
     * @param t
     *            int
     */
    private static int sha1_kt(int t) {
        return (t < 20) ? 1518500249 : (t < 40) ? 1859775393 : (t < 60) ? -1894007588 : -899497514;
    }

    /**
     * increase an int array to a desired sized + 1 while keeping the old
     * values. Creation date: (3/26/2004 1:05:01 PM)
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int[]
     * @param oldbin
     *            旧数据
     * @param size
     *            大小
     * 
     *            java.lang.String
     */
    private static int[] strechBinArray(int[] oldbin, int size) {
        int currlen = oldbin.length;
        if (currlen >= size + 1) {
            return oldbin;
        }
        int[] newbin = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newbin[i] = 0;
        }
        for (int i = 0; i < currlen; i++) {
            newbin[i] = oldbin[i];
        }
        return newbin;
    }

    /**
     * Perform the appropriate triplet combination function for the current
     * Creation date: (3/26/2004 1:05:01 PM).
     * 
     * @author T.N.Silverman
     * @version 1.0.0
     * @return int
     * @param t
     *            int
     * @param b
     *            int
     * @param c
     *            int
     * @param d
     *            int
     */
    private static int sha1_ft(int t, int b, int c, int d) {
        if (t < 20) {
            return (b & c) | ((~b) & d);
        }
        if (t < 40) {
            return b ^ c ^ d;
        }
        if (t < 60) {
            return (b & c) | (b & d) | (c & d);
        }
        return b ^ c ^ d;
    }

    /**
     * Returns a pseudorandom, uniformly distributed {@code int} value between 0
     * (inclusive) and the specified value (exclusive), drawn from this random
     * number generator's sequence. The general contract of {@code nextInt} is
     * that one {@code int} value in the specified range is pseudorandomly
     * generated and returned. All {@code n} possible {@code int} values are
     * produced with (approximately) equal probability. The method
     * {@code nextInt(int n)} is implemented by class {@code Random} as if by:
     * 
     * <pre>
     * {@code
     * public int nextInt(int n) {
     *   if (n <= 0)
     *     throw new IllegalArgumentException("n must be positive");
     * 
     *   if ((n & -n) == n)  // i.e., n is a power of 2
     *     return (int)((n * (long)next(31)) >> 31);
     * 
     *   int bits, val;
     *   do {
     *       bits = next(31);
     *       val = bits % n;
     *   } while (bits - val + (n-1) < 0);
     *   return val;
     * }}
     * </pre>
     *
     * <p>
     * The hedge "approximately" is used in the foregoing description only
     * because the next method is only approximately an unbiased source of
     * independently chosen bits. If it were a perfect source of randomly chosen
     * bits, then the algorithm shown would choose {@code int} values from the
     * stated range with perfect uniformity.
     * <p>
     * The algorithm is slightly tricky. It rejects values that would result in
     * an uneven distribution (due to the fact that 2^31 is not divisible by n).
     * The probability of a value being rejected depends on n. The worst case is
     * n=2^30+1, for which the probability of a reject is 1/2, and the expected
     * number of iterations before the loop terminates is 2.
     * <p>
     * The algorithm treats the case where n is a power of two specially: it
     * returns the correct number of high-order bits from the underlying
     * pseudo-random number generator. In the absence of special treatment, the
     * correct number of <i>low-order</i> bits would be returned. Linear
     * congruential pseudo-random number generators such as the one implemented
     * by this class are known to have short periods in the sequence of values
     * of their low-order bits. Thus, this special case greatly increases the
     * length of the sequence of values returned by successive calls to this
     * method if n is a small power of two.
     *
     * @param n
     *            the bound on the random number to be returned. Must be
     *            positive.
     * @return the next pseudorandom, uniformly distributed {@code int} value
     *         between {@code 0} (inclusive) and {@code n} (exclusive) from this
     *         random number generator's sequence
     * @exception IllegalArgumentException
     *                if n is not positive
     * @since 1.2
     */

    public static int nextInt(int n) {
        JunitBase base = new JunitBase("");

        if (n <= 0)
            throw new IllegalArgumentException("n must be positive");

        if ((n & -n) == n) // i.e., n is a power of 2
            return (int) ((n * (long) base.next(31)) >> 31);

        int bits, val;
        do {
            bits = base.next(31);
            val = bits % n;
        } while (bits - val + (n - 1) < 0);
        return val;
    }

    /**
     * 
     * 创建随机数.
     *
     * <pre>
     *  Lance.Wu <功能详细描述>
     * </pre>
     * 
     * @param len
     *            长度
     * @return
     * @return String
     */
    private static String createRandomNumber(int len) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append("" + nextInt(Integer.parseInt("9")));
        }
        return sb.toString();
    }

    /**
     * Generates the next pseudorandom number. Subclasses should override this,
     * as this is used by all other methods.
     *
     * <p>
     * The general contract of {@code next} is that it returns an {@code int}
     * value and if the argument {@code bits} is between {@code 1} and
     * {@code 32} (inclusive), then that many low-order bits of the returned
     * value will be (approximately) independently chosen bit values, each of
     * which is (approximately) equally likely to be {@code 0} or {@code 1}. The
     * method {@code next} is implemented by class {@code Random} by atomically
     * updating the seed to
     * 
     * <pre>
     * {@code (seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1)}
     * </pre>
     * 
     * and returning
     * 
     * <pre>
     * {@code (int)(seed >>> (48 - bits))}.
     * </pre>
     *
     * This is a linear congruential pseudorandom number generator, as defined
     * by D. H. Lehmer and described by Donald E. Knuth in <i>The Art of
     * Computer Programming,</i> Volume 3: <i>Seminumerical Algorithms</i>,
     * section 3.2.1.
     *
     * @param bits
     *            random bits
     * @return the next pseudorandom value from this random number generator's
     *         sequence
     * @since 1.1
     */
    protected int next(int bits) {
        long oldseed, nextseed;
        AtomicLong seed = this.seed;
        do {
            oldseed = seed.get();
            nextseed = (oldseed * multiplier + addend) & mask;
        } while (!seed.compareAndSet(oldseed, nextseed));
        return (int) (nextseed >>> (48 - bits));
    }

    /**
     * 
     * 发送请求.
     * 
     * <pre>
     *  Lance.Wu <功能详细描述>
     * </pre>
     * 
     * @param content
     *            请求报文
     * @return String
     */
    public static String creditMessage(String content) {

        String randonStr = createRandomNumber(Integer.parseInt("6"));
        String resultMsg = null;
        try {
            byte[] data = null;
            data = content.getBytes("UTF-8");
            byte[] random = randonStr.getBytes();
            String macData = randonStr + Hex.toString(data); // Tools.byteArrayToHexString(data);
            macData = getMac(macData);
            byte[] mac = macData.getBytes();
            int len = mac.length + random.length + data.length;
            byte[] blen = encodeHeadLength(len, 0, Integer.parseInt("16"), Integer.parseInt("8"), 0);
            resultMsg = new String(blen) + new String(mac) + new String(random) + new String(data, "UTF-8");
        } catch (Exception e) {
            LogPay.info(e.getMessage(), e);
            LogPay.error(e.getMessage(), e);
        }
        return resultMsg;

    }

}
