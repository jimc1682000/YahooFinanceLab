/**
 * Project Name:YahooFinanceServ
 * File Name:StkInfo.java
 * Package Name:com.sinopacsitc.yfs.stk
 * Date:2015年8月11日上午10:08:46
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package com.sinopacsitc.yfs.stk;

import java.io.IOException;
import java.util.Map;

import com.sinopacsitc.yfs.util.LogUtil;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * ClassName:StkInfo Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月11日 上午10:08:46
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class StkInfo {

	public StkInfo() {
	}

	/*
	 * ---亞洲國家--- 台灣發行量加權股價指數(^TWII) 日經指數(^N225) 香港恆生(^HSI) 上海綜合(000001.SS) 上海 A
	 * 股(000002.SS) 上海 B 股(000003.SS) 深圳 A 股(^SZSA) 深圳 B 股(^SZSB) 南韓綜合(^KS11)
	 * 星股海峽(^STI) 馬來西亞(^KLSE) 澳洲(^AORD) 印度(^BSESN)
	 */
	/*
	 * ---美加--- 道瓊工業(INDU) 那斯達克(^IXIC) 史坦普指數(^SPX) 費城半導體指數(^SOX) 羅素 2000(^RUT)
	 * 加拿大綜合(^GSPTSE)
	 */
	/*
	 * ---歐洲--- 法國 CAC(^FCHI) 德國 DAX(^GDAXI) 英國金融時報(^FTSE)
	 */
	public Map<String, Stock> getMultiStkInfo(String[] stkSymbols) {
		Map<String, Stock> stocks = null;
		try {
			stocks = YahooFinance.get(stkSymbols);
		} catch (IOException e) {
			LogUtil.logError(e, this.getClass());
			// doNothing
		}
		return stocks;
	}

	public Stock getSingleStkInfo(String stkSymbol) {
		// YQL Command
		// select LastTradePriceOnly,Change,ChangeinPercent from
		// yahoo.finance.quotes where symbol in ("^TWII" )
		Stock stk = null;
		try {
			// Stock stk = YahooFinance.get("2330.TW");
			// stk.print();
			stk = YahooFinance.get(stkSymbol);
			;
		} catch (IOException e) {
			LogUtil.logError(e, this.getClass());
		}
		return stk;
	}
}
