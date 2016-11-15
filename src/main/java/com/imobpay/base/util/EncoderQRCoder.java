package com.imobpay.base.util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.imobpay.base.log.LogPay;
import com.swetake.util.Qrcode;

/**
 * 
 * <pre>
 * 【类型】: EncoderQRCoder <br/> 
 * 【作用】: 二维码工具类. <br/>  
 * 【时间】：2016年8月30日 上午10:40:56 <br/> 
 * 【作者】：qt <br/>
 * </pre>
 */
public class EncoderQRCoder {

    /**
     * 
     * 【方法名】 : (生在二维码). <br/>
     * 【注意】: (这里描述这个方法的注意事项 – 可选).<br/>
     * 【作者】: qt .<br/>
     * 【时间】： 2016年8月30日 上午10:40:33 .<br/>
     * 【参数】： .<br/>
     * 
     * @param content
     *            加入二维码参数
     * @return .<br/>
     *         <p>
     *         修改记录.<br/>
     *         修改人: qt 修改描述：创建新新件 .<br/>
     *         <p/>
     */
    public static byte[] encoderQRCoder(String content) {

        ByteArrayOutputStream out = null;
        byte[] data = null;

        try {
            Qrcode handler = new Qrcode();
            out = new ByteArrayOutputStream();
            handler.setQrcodeErrorCorrect('M');
            handler.setQrcodeEncodeMode('B');
            handler.setQrcodeVersion(7);

            LogPay.info("图片内容" + content);
            byte[] contentBytes = content.getBytes("UTF-8");

            BufferedImage bufImg = new BufferedImage(140, 140, BufferedImage.TYPE_INT_RGB);

            Graphics2D gs = bufImg.createGraphics();

            gs.setBackground(Color.WHITE);
            gs.clearRect(0, 0, 140, 140);

            // 设定图像颜色：BLACK
            gs.setColor(Color.BLACK);

            // 设置偏移量 不设置肯能导致解析出错
            int pixoff = 2;
            // 输出内容：二维码
            if (contentBytes.length > 0 && contentBytes.length < 124) {
                boolean[][] codeOut = handler.calQrcode(contentBytes);
                for (int i = 0; i < codeOut.length; i++) {
                    for (int j = 0; j < codeOut.length; j++) {
                        if (codeOut[j][i]) {
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            } else {
                LogPay.info("QRCode content bytes length = " + contentBytes.length + " not in [ 0,120 ]. ");
            }

            gs.dispose();
            bufImg.flush();
            // 生成二维码QRCode图片
            ImageIO.write(bufImg, "png", out);
            data = out.toByteArray();
            return data;
        } catch (Exception e) {
            LogPay.error("sheng cheng er wei ma yi chang ");
            LogPay.error("生成二维码异常;" + e.getMessage(), e);
            return null;
        } finally {
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    LogPay.error("生成二维码异常;" + e.getMessage(), e);
                }
                out = null;
            }
        }
    }

    /**
     * 
     * 【方法名】 : (图片解码). <br/>
     * 【注意】: (图片解码).<br/>
     * 【作者】: qt .<br/>
     * 【时间】： 2016年8月30日 上午10:42:46 .<br/>
     * 【参数】： .<br/>
     * 
     * @param content
     *            文本
     * @param imgByte
     *            图片流
     * @return .<br/>
     *         <p>
     *         修改记录.<br/>
     *         修改人: qt 修改描述：创建新新件 .<br/>
     *         <p/>
     */
    public static byte[] encoderQRCoder(String content, byte[] imgByte) {
        byte[] data = null;
        BufferedImage bufImg = null;
        Qrcode qrcodeHandler = null;
        ByteArrayOutputStream out = null;
        Image img = null;
        InputStream sbs = null;
        try {
            qrcodeHandler = new Qrcode();
            out = new ByteArrayOutputStream();
            qrcodeHandler.setQrcodeErrorCorrect('M');
            qrcodeHandler.setQrcodeEncodeMode('B');
            qrcodeHandler.setQrcodeVersion(7);
            byte[] contentBytes = content.getBytes("UTF-8");
            bufImg = new BufferedImage(140, 140, BufferedImage.TYPE_INT_RGB);
            Graphics2D gs = bufImg.createGraphics();
            gs.setBackground(Color.WHITE);
            gs.clearRect(0, 0, 140, 140);
            // 设定图像颜色> BLACK
            gs.setColor(Color.BLACK);
            // 设置偏移量 不设置可能导致解析出错
            int pixoff = 2;
            // 输出内容> 二维码
            if (contentBytes.length > 0 && contentBytes.length < 120) {
                boolean[][] codeOut = qrcodeHandler.calQrcode(contentBytes);
                for (int i = 0; i < codeOut.length; i++) {
                    for (int j = 0; j < codeOut.length; j++) {
                        if (codeOut[j][i]) {
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            } else {
                System.err.println("QRCode content bytes length = " + contentBytes.length + " not in [ 0,120 ]. ");
            }
            sbs = new ByteArrayInputStream(imgByte);
            img = ImageIO.read(sbs);
            // 实例化一个Image对象。
            // gs.drawImage(img, 55, 55, null);
            gs.drawImage(img, 52, 52, 40, 40, null);
            gs.setColor(Color.WHITE);
            gs.drawRect(52, 52, 40 - 2, 40 - 2);
            gs.drawRect(53, 53, 40 - 2, 40 - 2);
            gs.drawRect(52, 52, 40 - 2, 40 - 2);
            gs.dispose();
            bufImg.flush();

            ImageIO.write(bufImg, "png", out);
            data = out.toByteArray();

            return data;
        } catch (Exception e) {
            LogPay.error("sheng cheng er wei ma yi chang ");
            LogPay.error("生成二维码异常;" + e.getMessage(), e);
            return data;
        } finally {
            bufImg = null;
            qrcodeHandler = null;
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    LogPay.error("sheng cheng er wei ma yi chang ");
                    LogPay.error("生成二维码异常;" + e.getMessage(), e);
                }
                out = null;
            }
            if (null != sbs) {
                try {
                    sbs.close();
                } catch (IOException e) {
                    LogPay.error("sheng cheng er wei ma yi chang ");
                    LogPay.error("生成二维码异常;" + e.getMessage(), e);
                }
                sbs = null;
            }
        }

    }

}
