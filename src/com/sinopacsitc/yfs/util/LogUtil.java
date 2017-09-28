/**
 * Project Name:YahooFinanceServ
 * File Name:LogUtil.java
 * Package Name:com.sinopacsitc.yfs.util
 * Date:2015年8月11日下午2:37:01
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package com.sinopacsitc.yfs.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * ClassName:LogUtil Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月11日 下午2:37:01
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class LogUtil {

	public LogUtil() {
	}

	public static void logError(Exception e, Class<?> c) {
		String stackMsg = getStackMsg(e);
		logError(stackMsg, c);
	}

	public static void logError(String msg, Class<?> c) {
		Date today = DateUtil.getGeneralTrimmedDateMethod(new Date());
		String todayStr = DateUtil.convertDateToFormateStr(today, "yyyyMMdd");
		String filePath = new StringBuilder().append("D:/YFS_Files/log/")
				.append(todayStr).append(".txt").toString();
		File file = new File(filePath);
		if (file.exists()) {
			try {
				FileUtil.appendStringToFile(filePath, c.getName() + ": " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				FileUtil.createFile(filePath, c.getName() + ": " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void logInfo(String msg, Class<?> c) {
		Date today = DateUtil.getGeneralTrimmedDateMethod(new Date());
		String todayStr = DateUtil.convertDateToFormateStr(today, "yyyyMMdd");
		String filePath = new StringBuilder().append("D:/YFS_Files/log/")
				.append(todayStr).append(".txt").toString();
		File file = new File(filePath);
		if (file.exists()) {
			try {
				FileUtil.appendStringToFile(filePath, c.getName() + ": " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				FileUtil.createFile(filePath, c.getName() + ": " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getStackMsg(Exception e) {
		StringBuffer sb = new StringBuffer();
		sb.append(e.getMessage() + "\n");
		for (StackTraceElement element : e.getStackTrace()) {
			sb.append(element.toString() + "\n");
		}
		return sb.toString();
	}
}
