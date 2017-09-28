/**
 * Project Name:YahooFinanceServ
 * File Name:FxInfo.java
 * Package Name:com.sinopacsitc.yfs.fx
 * Date:2015年8月11日上午10:08:31
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package com.sinopacsitc.yfs.fx;

import java.io.IOException;
import java.util.Map;

import com.sinopacsitc.yfs.util.LogUtil;

import yahoofinance.YahooFinance;
import yahoofinance.quotes.fx.FxQuote;

/**
 * ClassName:FxInfo Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月11日 上午10:08:31
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class FxInfo {

	public FxInfo() {
	}

	/*
	 * "USDCNY=X" USD/RMB
	 */
	public FxQuote getSingleFxInfo(String fxSymbol) {
		FxQuote fq = null;
		try {
			fq = YahooFinance.getFx(fxSymbol);
			// YahooFinance.getFx(FxSymbols.USDEUR);
			// YahooFinance.getFx("USDTWD=X");
		} catch (IOException e) {
			LogUtil.logError(e, this.getClass());
			// doNothing
		}
		return fq;
	}

	public Map<String, FxQuote> getMultiFxInfo(String[] fxSymbols) {
		Map<String, FxQuote> fxs = null;
		try {
			fxs = YahooFinance.getFx(fxSymbols);
		} catch (IOException e) {
			LogUtil.logError(e, this.getClass());
			// doNothing
		}
		return fxs;
	}
}
