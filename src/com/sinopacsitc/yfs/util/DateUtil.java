/**
 * Project Name:SinopacSRS
 * File Name:DateUtil.java
 * Package Name:com.sinopacsitc.srs.util
 * Date:2015年7月14日下午3:49:02
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package com.sinopacsitc.yfs.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:DateUtil Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2015年7月14日 下午3:49:02
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
// LocalDateTime ldt = LocalDateTime.of(2015, 7, 15, 5, 33, 24);
// Instant instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
// @SuppressWarnings("deprecation")
// Date nd = new Date(ldt.getYear()-1900, ldt.getMonthValue(),
// ldt.getDayOfMonth());
// Period period = Period.between(LocalDate.parse("1988-11-19"),
// LocalDate.now());
public class DateUtil {
	public static Date getGeneralUnTrimmedDateMethod(Date srcDate) {
		if (srcDate == null) {
			srcDate = new Date();
		}
		return srcDate;
	}

	public static Date getGeneralTrimmedDateMethod(Date srcDate) {
		if (srcDate == null) {
			srcDate = convertSrcDateToTrimmedDate(new Date());
		} else {
			srcDate = convertSrcDateToTrimmedDate(srcDate);
		}
		return srcDate;
	}

	// 得到只有年月日的date
	public static Date convertSrcDateToTrimmedDate(Date date) {
		Date rtnDate = null;
		if (date != null) {
			try {
				rtnDate = convertStrToDate(convertDateToFormateStr(date,
						"yyyyMMdd"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return rtnDate;
	}

	public static String convertDateToFormateStr(Date date, String format) {
		if (format == null || format.isEmpty()) {
			format = "yyyyMMddHHmmss";
		}
		// 準備輸出的格式
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String formatedDate = sdf.format(date);
		return formatedDate;
	}

	public static String convertDateToFormateStr(Date date) {
		return convertDateToFormateStr(date, null);
	}

	public static Date convertStrToDate(String strDate, String format)
			throws ParseException {
		if (format == null || format.isEmpty()) {
			format = "yyyyMMdd";
		}
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = dateFormat.parse(strDate);
		// DateFormat chtDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		// System.out.println(chtDateFormat.format(date));
		return date;
	}

	public static Date convertStrToDate(String strDate) throws ParseException {
		return convertStrToDate(strDate, null);
	}
}
