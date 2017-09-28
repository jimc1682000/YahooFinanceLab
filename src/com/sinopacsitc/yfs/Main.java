/**
 * Project Name:YahooFinanceServ
 * File Name:Main.java
 * Package Name:com.sinopacsitc.yfs
 * Date:2015年8月11日上午11:06:20
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package com.sinopacsitc.yfs;

import java.io.IOException;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.quotes.fx.FxQuote;

import com.google.gson.Gson;
import com.sinopacsitc.yfs.fx.FxInfo;
import com.sinopacsitc.yfs.fx.bean.FxBean;
import com.sinopacsitc.yfs.stk.StkInfo;
import com.sinopacsitc.yfs.stk.bean.StkBean;
import com.sinopacsitc.yfs.util.FileUtil;
import com.sinopacsitc.yfs.util.LogUtil;
import com.sinopacsitc.yfs.util.StringUtil;

/**
 * ClassName:Main Function: TODO ADD FUNCTION. Reason: TODO ADD REASON. Date:
 * 2015年8月11日 上午11:06:20
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		String[] stkSymbols = new String[] { "^TWII", "^N225", "^HSI", "^KS11",
				"^STI", "^KLSE", "^AORD", "^IXIC", "^SPX", "^SOX", "^GSPTSE",
				"^FCHI", "^GDAXI", "^FTSE" };
		Map<String, Stock> stocks = new StkInfo().getMultiStkInfo(stkSymbols);
		for (String sym : stkSymbols) {
			// BigDecimal price = stocks.get(sym).getQuote().getPrice();
			// BigDecimal chg = stocks.get(sym).getQuote().getChange();
			// BigDecimal chgInPercent =
			// stocks.get(sym).getQuote().getChangeInPercent();
			Gson gson = new Gson();
			if (stocks != null) {
				Stock stk = stocks.get(sym);
				String filePath = "D:/YFS_Files/stk/"
						+ StringUtil.StringFilter(stk.getSymbol()) + ".txt";
				try {
					StkBean sb = gson.fromJson(gson.toJson(stocks.get(sym))
							.toString(), StkBean.class);
					FileUtil.createFile(filePath, gson.toJson(sb).toString());
				} catch (IOException e) {
					LogUtil.logError(e, Main.class);
				}
			}
		}

		String[] fxSymbols = new String[] { "USDTWD=X", "USDCNY=X", "USDHKD=X",
				"USDKRW=X", "USDJPY=X", "EURUSD=X", "AUDUSD=X", "GBPUSD=X" };
		Map<String, FxQuote> fxs = new FxInfo().getMultiFxInfo(fxSymbols);
		for (String sym : fxSymbols) {
			Gson gson = new Gson();
			if (fxs != null) {
				FxQuote fq = fxs.get(sym);
				String filePath = "D:/YFS_Files/fx/"
						+ StringUtil.StringFilter(fq.getSymbol()) + ".txt";
				try {
					FxBean fb = gson.fromJson(gson.toJson(fxs.get(sym))
							.toString(), FxBean.class);
					FileUtil.createFile(filePath, gson.toJson(fb).toString());
				} catch (IOException e) {
					LogUtil.logError(e, Main.class);
				}
			}
		}
	}

}
