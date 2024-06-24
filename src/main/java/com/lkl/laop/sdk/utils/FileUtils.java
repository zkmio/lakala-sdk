package com.lkl.laop.sdk.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lkl.laop.sdk.exception.SDKException;
import com.lkl.laop.sdk.exception.SDKExceptionEnums;

/**
 * FileUtils
 *
 * @author zhangqiang
 * @version 1.0
 * 2021/10/11 18:02
 **/
public class FileUtils {
    private static final Logger log = LoggerFactory.getLogger(FileUtils.class);

    public FileUtils() {
    }

    public static Properties getProperties(String filePath) throws SDKException {
        InputStreamReader inputStreamReader = null;
        try {
            String charset = "utf-8";
            File file = new File(filePath);
            if (!file.isFile() || !file.exists()) {
                log.error("找不到指定的文件[" + file.getAbsolutePath() + "]");
                throw new SDKException(SDKExceptionEnums.INITIALIZE_KEYSTORE_ERROR);
            } else {
                inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
                Properties properties = new Properties();
                properties.load(inputStreamReader);
                return properties;
            }
        } catch (SDKException se) {
            throw se;
        } catch (Exception e) {
            log.error("读取文件内容出错", e);
            throw new SDKException(SDKExceptionEnums.FILE_READ_FAIL_EXCEPTION);
        } finally {
            if (null != inputStreamReader) {
                try {
                    inputStreamReader.close();
                } catch (Exception e) {
                    log.error("文件流关闭异常", e);
                }
            }
        }
    }

    public static String readFile(String filePath) throws SDKException {
        StringBuilder strBuff = new StringBuilder();
        InputStreamReader inputStreamReader= null;
        try {
            String charset = "utf-8";
            File file = new File(filePath);
            if (!file.isFile() || !file.exists()) {
                log.error("找不到指定的文件[" + file.getAbsolutePath() + "]");
                throw new SDKException(SDKExceptionEnums.INITIALIZE_KEYSTORE_ERROR);
            } else {
                inputStreamReader  = new InputStreamReader(new FileInputStream(file), charset);
                int len;
                char[] chs = new char[1024];
                while ((len = inputStreamReader.read(chs)) != -1) {
                    strBuff.append(new String(chs, 0, len));
                }
                return strBuff.toString();
            }
        } catch (SDKException se) {
            throw se;
        } catch (Exception e) {
            log.error("读取文件内容出错", e);
            throw new SDKException(SDKExceptionEnums.FILE_READ_FAIL_EXCEPTION);
        }finally {
            if (null != inputStreamReader) {
                try {
                    inputStreamReader.close();
                } catch (Exception e) {
                    log.error("文件流关闭异常", e);
                }
            }
        }
    }
}
