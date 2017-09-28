/**
 * Project Name:YahooFinanceServ
 * File Name:StkInfo.java
 * Package Name:com.sinopacsitc.yfs.stk
 * Date:2015�~8��11��W��10:08:46
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
 * 2015�~8��11�� �W��10:08:46
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
	 * ---�Ȭw��a--- �x�W�o��q�[�v�ѻ�����(^TWII) ��g����(^N225) ������(^HSI) �W����X(000001.SS) �W�� A
	 * ��(000002.SS) �W�� B ��(000003.SS) �`�` A ��(^SZSA) �`�` B ��(^SZSB) �n����X(^KS11)
	 * �P�Ѯ��l(^STI) ���Ӧ��(^KLSE) �D�w(^AORD) �L��(^BSESN)
	 */
	/*
	 * ---���[--- �Dã�u�~(INDU) �����F�J(^IXIC) �v�Z������(^SPX) �O���b�������(^SOX) ù�� 2000(^RUT)
	 * �[���j��X(^GSPTSE)
	 */
	/*
	 * ---�ڬw--- �k�� CAC(^FCHI) �w�� DAX(^GDAXI) �^����Įɳ�(^FTSE)
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
