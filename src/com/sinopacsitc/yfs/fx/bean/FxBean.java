
package com.sinopacsitc.yfs.fx.bean;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class FxBean {

    @Expose
    private String symbol;
    @Expose
    private String price;

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
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
