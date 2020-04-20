package com.fm.edusys.util;

import io.swagger.annotations.Api;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author ：liukun
 * @date ：Created in 2020-04-18 12:29
 * @description：响应工具类
 * @modified By：
 * @version: 1.0$
 */
public class ResponseUtils {

    public ResponseUtils() {
    }


    /**
     * create by: liukun
     * description: TODO
     * create time: 2020/4/18 12:32
     * @param request
     * @param response
     * @param filename
     * @param type
     * @param size
     * @return void
     */
    public static void setResponseFileHeader(HttpServletRequest request, HttpServletResponse response, String filename, String type, Long size) throws UnsupportedEncodingException {
        String userAgent = request.getHeader("User-Agent");
        if (!userAgent.contains("MSIE") && !userAgent.contains("Trident")) {
            filename = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
        } else {
            filename = URLEncoder.encode(filename, "UTF-8");
        }

        response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes(), "UTF-8"));
        response.addHeader("Content-Length", "" + size);
        response.setContentType("application/octet-stream");
    }


    /**
     * create by: liukun
     * description: TODO
     * create time: 2020/4/18 12:33
     * @param request
	 * @param response
	 * @param bufferedImage
     * @return void
     */
    public static void responseBufferedImage(HttpServletRequest request, HttpServletResponse response, BufferedImage bufferedImage) throws IOException {
        if (bufferedImage != null) {
            // 将bufferedImage写入HttpServletResponse OutputStream中
            ServletOutputStream out = null;
            try {
                response.setCharacterEncoding("utf-8");
                response.setHeader("Content-type","image/jpeg;charset=UTF-8");
                response.setDateHeader("Expires", 0);
                response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
                response.addHeader("Cache-Control", "post-check=0, pre-check=0");
                response.setHeader("Pragma", "no-cache");
                response.setContentType("image/jpeg");
                out = response.getOutputStream();
                ImageIO.write(bufferedImage, "jpg", out);
                out.flush();
            } finally {
                if (out != null) {
                    out.close();
                }
            }
        }

    }


}
