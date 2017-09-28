/**
 * Project Name:YahooFinanceServ
 * File Name:StringUtil.java
 * Package Name:com.sinopacsitc.yfs.util
 * Date:2015年8月11日下午2:15:21
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package com.sinopacsitc.yfs.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName:StringUtil Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年8月11日 下午2:15:21
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class StringUtil {

	public StringUtil() {
		// TODO Auto-generated constructor stub
	}

	public static String StringFilter(String str) {
		// 只允許字母和數字
		String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		// String regEx =
		// "[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}
}
