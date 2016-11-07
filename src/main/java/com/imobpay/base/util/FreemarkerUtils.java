/**
 *  <pre>	
 *  Project Name:PayIFramework .</br>
 *  File: FreemarkerUtils.java .</br>
 *  Package Name:com.imobpay.base.util .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月3日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * <pre>
 * ClassName: FreemarkerUtils <br/> 
 * Function:  自动生成代码工具. <br/> 
 * Reason:   ADD REASON(可选). <br/> 
 * date: 2016年6月3日 下午10:50:38 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 PayIFramework 1.0 . <br/>
 * </pre>
 */
public class FreemarkerUtils {

    /**
     * main:(自动生成文件). <br/>
     * 使用工具生成Bean.java Xml .<br/>
     * 
     * @author Lance.Wu <br/>
     * @param args
     *            args <br/>
     * @throws Exception
     *             Exception <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    public static void main(String[] args) throws Exception {

        // createFtl("tb_cust_mobile_nets");
        // createFtl("cs_cardbin");
        createFtl("tb_fans_sys_notice");
    }

    /**
     * 
     * 方法名： createFtl.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月5日.<br/>
     * 创建时间：下午3:33:02.<br/>
     * 参数者异常：@param str 参数者异常：@throws Exception .<br/>
     * 
     * @exception Exception
     *                系统异常 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public static void createFtl(String... str) throws Exception {
        for (String string : str) {
            String tableName = string.toUpperCase();
            /** 生成文件目录 */
            String path = "d:\\bean/";

            File f = new File(path);
            if (!f.exists()) {
                f.mkdir();
            }

            Map<String, Object> map = DBHelper.getTableInfo(tableName);
            String clsName = map.get("clsName").toString();
            // 执行插值，并输出到指定的输出流中
            createFile("sqlxml.ftl", path + clsName + "Mapper.xml", map);
            createFile("bean.ftl", path + clsName + ".java", map);
            createFile("dao.ftl", path + clsName + "Dao.java", map);
            System.out.println("创建完成");
        }

    }

    /**
     * createFile:(这里用一句话描述这个方法的作用). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param templatName
     *            templatName <br/>
     * @param fileName
     *            fileName <br/>
     * @param map
     *            map <br/>
     * @throws IOException
     *             IOException <br/>
     * @throws TemplateException
     *             TemplateException <br/>
     * @since JDK 1.6 PayIFramework 1.0 <br/>
     */
    public static void createFile(String templatName, String fileName, Map<String, Object> map) throws IOException, TemplateException {
        @SuppressWarnings("deprecation")
        Configuration cfg = new Configuration();
        String path = FreemarkerUtils.class.getResource("").getPath() + "ftlProject";
        cfg.setDirectoryForTemplateLoading(new File(path));
        Template t = cfg.getTemplate(templatName);
        t.process(map, new OutputStreamWriter(new FileOutputStream(fileName)));
    }

}
