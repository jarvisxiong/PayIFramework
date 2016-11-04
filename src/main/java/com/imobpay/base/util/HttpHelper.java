package com.imobpay.base.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.imobpay.base.log.LogPay;

/**
 * Http工具类 <br/>
 * 提供一个通过get和post方式访问url的工具 <br/>
 * 
 * @author 杜忠(Michael.Du) <br/>
 * @version 1.0 <br/>
 * @since 1.5 <br/>
 */

public class HttpHelper {

    /** 连接超时 */
    public static int    connectTimeout = 10000;
    /** 读取超时 */
    public static int    readTimeout    = 10000;

    /** 输入字符编码 */
    public static String inEncoding     = "UTF-8";

    /** 输出字符编码 */
    public static String outEncoding    = "GBK";

    /**
     * 以默认字符集，get方式访问url。 <br/>
     * 
     * @param url
     *            要访问的url <br/>
     * @return String 服务返回的HTML文本 <br/>
     * @throws IOException
     * <br/>
     */
    public static String get(String url) throws IOException {
        return get(url, inEncoding);
    }

    /**
     * 以指定字符集，get方式访问url。 <br/>
     * 
     * @param url
     *            要访问的url <br/>
     * @modify <br/>
     *         增加try{...}catch(...){...}finally{...}块，异常情况下断开http连接 <br/>
     * @param encoding
     *            输入的字符集 <br/>
     * @return String 服务返回的HTML文本 <br/>
     * @throws IOException
     * <br/>
     */
    public static String get(String url, String encoding) throws IOException {
        String result = "";
        URL httpUrl;
        HttpURLConnection httpConn = null;
        BufferedReader in = null;
        try {
            httpUrl = new URL(url);
            httpConn = (HttpURLConnection) httpUrl.openConnection();
            httpConn.setConnectTimeout(connectTimeout);
            httpConn.setReadTimeout(readTimeout);
            httpConn.connect();
            in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), encoding));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (IOException ioe) {
            throw ioe;
        } finally {
            if (in != null) {
                in.close();
            }
            if (httpConn != null) {
                httpConn.disconnect();
            }
        }
        return result;
    }

    /**
     * 以默认字符集，post方式访问url。<br/>
     * 
     * @param url
     *            要访问的url <br/>
     * @modify 增加try{...}catch(...){...}finally{...}块，异常情况下断开http连接 <br/>
     * @param param
     *            要传递的参数 <br/>
     * @return String 服务返回的HTML文本 <br/>
     * @throws IOException
     * <br/>
     */
    public static String post(String url, String param) throws IOException {
        return post(url, param, outEncoding, inEncoding);
    }

    /**
     * 以指定字符集，post方式访问url。<br/>
     * 
     * @param url
     *            要访问的url<br/>
     * @param param
     *            要传递的参数<br/>
     * @param outEncoding
     *            输出字符编码<br/>
     * @param inEncoding
     *            输入字符编码<br/>
     * 
     * @return String 服务返回的HTML文本 <br/>
     * @throws IOException
     * <br/>
     */
    public static String post(String url, String param, String outEncoding, String inEncoding) throws IOException {
        String result = "";
        HttpURLConnection httpConn = null;
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            URL httpurl = new URL(url);
            httpConn = (HttpURLConnection) httpurl.openConnection();
            httpConn.setConnectTimeout(connectTimeout);
            httpConn.setReadTimeout(readTimeout);
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(httpConn.getOutputStream(), outEncoding)));
            out.print(param);
            out.flush();
            in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), inEncoding));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

        } catch (IOException ioe) {
            throw ioe;
        } finally {

            if (out != null) {
                out.close();
            }

            if (in != null) {
                in.close();
            }

            if (httpConn != null) {
                httpConn.disconnect();
            }
        }
        return result;
    }
    
    /**
     * 
     * 方法名： send.<br/>
     * 方法作用:发送请求方法.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年4月12日.<br/>
     * 创建时间：下午6:08:12.<br/>
     * 参数者异常：@param callURL
     * 参数者异常：@param postData
     * 参数者异常：@return
     * 参数者异常：@throws Exception .<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public static String send(String callURL, String postData) throws Exception {

        com.imobpay.base.log.LogPay.info("call url is:" + callURL);
        LogPay.info("call postData is:" + postData);
        try {
            URL url = new URL(callURL);
            HttpURLConnection connection = null;
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(60000);
            connection.setReadTimeout(60000); // 设置从主机获取数据超时时间
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.connect();
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());

            out.write(postData.getBytes("UTF-8"));
            out.flush();
            out.close();
            int rc = connection.getResponseCode();
            LogPay.info("connect result is:" + rc);
            // 响应成功
            if (rc == 200) {
                String temp;
                InputStream in = null;
                in = connection.getInputStream();
                BufferedReader data = new BufferedReader(new InputStreamReader(in, "utf-8"));
                StringBuffer result = new StringBuffer();
                while ((temp = data.readLine()) != null) {
                    result.append(temp);
                    temp = null;
                }
                data.close();
                in.close();
                LogPay.info("returnData is:" + result.toString());
                return result.toString();
            }
        } catch (IOException io) {
            LogPay.info(io.getMessage(), io);
            LogPay.error(io.getMessage(), io);
            throw io;
        } catch (Exception e) {
            LogPay.info(e.getMessage(), e);
            LogPay.error(e.getMessage(), e);
            throw e;
        }
        return null;
    }
}
