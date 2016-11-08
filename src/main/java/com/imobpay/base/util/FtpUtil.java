package com.imobpay.base.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.net.TelnetInputStream;
import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;

import com.imobpay.base.console.Console_Column;

/**
 * FTP工具类
 * <p>
 * 提供FTP文件列表、上传、下载功能
 * 
 * @author 杜忠(Michael.Du)
 * @version 1.0
 * @since 1.5
 */

@SuppressWarnings("restriction")
public class FtpUtil {
    /**
     * 获取类日志对象
     */
    private static Logger log = LoggerFactory.getLogger(FtpUtil.class);


    /**
     * 
     * 方法名： ftpPic.<br/>
     * 方法作用:上传图片.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年9月2日.<br/>
     * 创建时间：下午2:58:22.<br/>
     * 参数或者异常：@param server IP地址
     * 参数或者异常：@param port   端口
     * 参数或者异常：@param user   用户名
     * 参数或者异常：@param password 密码
     * 参数或者异常：@param targetPath 目录
     * 参数或者异常：@param sourcePath 文件内容
     * 参数或者异常：@param fileName   文件名
     * 参数或者异常：@param isFlag     是否调用FTP
     * 参数或者异常：@param ftpConnTimes FTP连接时间
     * 参数或者异常：@param ftpReadTimes FTP读取时间
     * 返回值： @return 返回结果：boolean.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public static boolean ftpPic(String server, int port, String user, String password, String targetPath, String sourcePath, String fileName, String isFlag, String ftpConnTimes,String ftpReadTimes) {
        long l = System.currentTimeMillis();
        // 是否开启FTP上传功能
        boolean bool = true;
        if (isFlag.equals("Y")) {
            FtpClient ftpClient = new FtpClient();
            TelnetOutputStream os = null;
            try {
                log.info("FTP连接时间:" + Integer.parseInt(ftpConnTimes) + ",ftp读取时间:" + Integer.parseInt(ftpReadTimes));
                ftpClient.setConnectTimeout(Integer.parseInt(ftpConnTimes));
                ftpClient.setReadTimeout(Integer.parseInt(ftpReadTimes));
                ftpClient.openServer(server, port);
                ftpClient.login(user, password);
                createDir(ftpClient, targetPath);
                ftpClient.cd(Console_Column.CATALOGMARK);
                if (targetPath.length() != 0) {
                    ftpClient.cd(targetPath);
                }

                ftpClient.binary();
                os = ftpClient.put(fileName);
                byte[] b = Format.decryptBASE64(sourcePath);
                os.write(b);
                os.flush();
            } catch (IOException e) {
                log.info(e.getMessage(), e);
                log.error(e.getMessage(), e);
                log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                bool = false;
                return bool;
            } finally {
                try {
                    if (os != null) {
                        os.close();
                        log.info("os已关闭");
                    }
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                    bool = false;
                    return bool;
                }
                try {
                    if (ftpClient != null) {
                        ftpClient.closeServer();
                        log.info("ftpClient已关闭");
                    }
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                    bool = false;
                    return bool;
                }
                log.info("FTP上传耗时:" + (System.currentTimeMillis() - l) + "FTP上传结果:" + bool);
            }
            return true;
        } else {
            FileOutputStream fos = null;
            try {
                File apple2 = new File(targetPath);
                if (!apple2.exists()) {
                    apple2.mkdirs();
                }
                File apple = new File(targetPath + fileName);
                fos = new FileOutputStream(apple);
                byte[] b = Format.decryptBASE64(sourcePath);
                fos.write(b);
                fos.flush();
            } catch (Exception e) {
                log.info(e.getMessage(), e);
                log.error(e.getMessage(), e);
                log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                bool = false;
                return bool;
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                        log.info("fos已关闭");
                    }
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                    bool = false;
                    return bool;
                }
                log.info("FTP上传耗时:" + (System.currentTimeMillis() - l) + "FTP上传结果:" + bool);
            }

            return true;
        }

    }
    /**
     * 
     * 方法名： ftpFile.<br/>
     * 方法作用:上传图片.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年9月2日.<br/>
     * 创建时间：下午2:58:22.<br/>
     * 参数或者异常：@param server IP地址
     * 参数或者异常：@param port   端口
     * 参数或者异常：@param user   用户名
     * 参数或者异常：@param password 密码
     * 参数或者异常：@param targetPath 目录
     * 参数或者异常：@param sourcePath 文件内容
     * 参数或者异常：@param fileName   文件名
     * 参数或者异常：@param isFlag     是否调用FTP
     * 参数或者异常：@param ftpConnTimes FTP连接时间
     * 参数或者异常：@param ftpReadTimes FTP读取时间
     * 返回值： @return 返回结果：boolean.<br/>
     * 其它内容： JDK 1.6 PayIFramework 1.0.<br/>
     */
    public static boolean ftpFile(String server, int port, String user, String password, String targetPath, String sourcePath, String fileName, String isFlag, String ftpConnTimes,String ftpReadTimes) {
        long l = System.currentTimeMillis();
        // 是否开启FTP上传功能
        boolean bool = true;
        if (isFlag.equals("Y")) {
            FtpClient ftpClient = new FtpClient();
            TelnetOutputStream os = null;
            try {
                log.info("FTP连接时间:" + Integer.parseInt(ftpConnTimes) + ",ftp读取时间:" + Integer.parseInt(ftpReadTimes));
                ftpClient.setConnectTimeout(Integer.parseInt(ftpConnTimes));
                ftpClient.setReadTimeout(Integer.parseInt(ftpReadTimes));
                ftpClient.openServer(server, port);
                ftpClient.login(user, password);
                createDir(ftpClient, targetPath);
                ftpClient.cd(Console_Column.CATALOGMARK);
                if (targetPath.length() != 0) {
                    ftpClient.cd(targetPath);
                }
                
                ftpClient.binary();
                os = ftpClient.put(fileName);
                byte[] b = Format.decryptBASE64(sourcePath);
                os.write(b);
                os.flush();
            } catch (IOException e) {
                log.info(e.getMessage(), e);
                log.error(e.getMessage(), e);
                log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                bool = false;
                return bool;
            } finally {
                try {
                    if (os != null) {
                        os.close();
                        log.info("os已关闭");
                    }
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                    bool = false;
                    return bool;
                }
                try {
                    if (ftpClient != null) {
                        ftpClient.closeServer();
                        log.info("ftpClient已关闭");
                    }
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                    bool = false;
                    return bool;
                }
                log.info("FTP上传耗时:" + (System.currentTimeMillis() - l) + "FTP上传结果:" + bool);
            }
            return true;
        } else {
            FileOutputStream fos = null;
            try {
                File apple2 = new File(targetPath);
                if (!apple2.exists()) {
                    apple2.mkdirs();
                }
                File apple = new File(targetPath + fileName);
                fos = new FileOutputStream(apple);
                byte[] b = Format.decryptBASE64(sourcePath);
                fos.write(b);
                fos.flush();
            } catch (Exception e) {
                log.info(e.getMessage(), e);
                log.error(e.getMessage(), e);
                log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                bool = false;
                return bool;
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                        log.info("fos已关闭");
                    }
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    log.debug("上传失败数据,目录地址:" + targetPath + ",文件名:" + fileName + ",文件数据:" + sourcePath);
                    bool = false;
                    return bool;
                }
                log.info("FTP上传耗时:" + (System.currentTimeMillis() - l) + "FTP上传结果:" + bool);
            }
            
            return true;
        }
        
    }

    /**
     * @param ftpClient
     *            ftp客户端
     * @param path
     *            地址参数
     * @return 返回结果
     * @throws IOException
     */
    public static boolean createDir(FtpClient ftpClient, String path) {
        if (path.length() > 0) {
            String[] str = path.split(Console_Column.CATALOGMARK);
            for (int i = 0; i < str.length; i++) {
                try {
                    String pathName = ftpClient.pwd();
                    if (!isExitDirectory(ftpClient, str[i])) {
                        ftpClient.sendServer("MKD " + pathName + Console_Column.CATALOGMARK + str[i] + "\r\n");
                    } else {
                        continue;
                    }
                    ftpClient.readServerResponse();
                    ftpClient.cd(str[i]);
                } catch (Exception e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * 
     * @param ftpClient
     *            ftp客户端
     * @param pathExit
     *            文件路径
     * @return boolean
     */
    public static boolean isExitDirectory(FtpClient ftpClient, String pathExit) {
        try {
            ftpClient.cd(pathExit);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 获取ftp图片
     * 
     * @param server
     *            服务器地址
     * @param user
     *            用户名
     * @param password
     *            密码
     * @param path
     *            路径
     * @param filename
     *            文件名
     * @param port
     *            端口号
     * @return String
     * @throws IOException
     * 
     */
    public static String ftpGetPic(String server, int port, String user, String password, String path, String filename, String ftpConnTimes,String ftpReadTimes) {
        long l = System.currentTimeMillis();
        FtpClient ftpClient = new FtpClient();
        TelnetInputStream is = null;
        String result = "";
        try {
            ftpClient.setConnectTimeout(Integer.parseInt(ftpConnTimes));
            ftpClient.setReadTimeout(Integer.parseInt(ftpReadTimes));
            ftpClient.openServer(server, port);
            ftpClient.login(user, password);
            if (path.length() != 0) {
                ftpClient.cd(path);
            }

            ftpClient.binary();
            is = ftpClient.get(filename);
            byte[] bytes = IOUtils.toByteArray(is);
            result = Format.bytesToHexString(bytes);
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            log.error(e.getMessage(), e);
            result = "";
        } finally {
            try {
                if (is != null) {
                    is.close();
                    log.info("is已关闭");
                }
            } catch (IOException e) {
                log.info(e.getMessage(), e);
                log.error(e.getMessage(), e);
            }
            if (ftpClient != null) {
                try {
                    ftpClient.closeServer();
                    log.info("ftpClient已关闭");
                } catch (IOException e) {
                    log.info(e.getMessage(), e);
                    log.error(e.getMessage(), e);
                }
            }
            log.info("FTP下载耗时:" + (System.currentTimeMillis() - l));
        }
        return result;
    }
}