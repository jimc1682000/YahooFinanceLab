
package com.sinopacsitc.yfs.stk.bean;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class StkBean {

    @Expose
    private String symbol;
    @Expose
    private String name;
    @Expose
    private String currency;
    @Expose
    private String stockExchange;
    @Expose
    private Quote quote;

    /**
     * 
     * @return
     *     The symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * @param symbol
     *     The symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The stockExchange
     */
    public String getStockExchange() {
        return stockExchange;
    }

    /**
     * 
     * @param stockExchange
     *     The stockExchange
     */
    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    /**
     * 
     * @return
     *     The quote
     */
    public Quote getQuote() {
        return quote;
    }

    /**
     * 
     * @param quote
     *     The quote
     */
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

}
