
package com.sinopacsitc.yfs.stk.bean;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class LastTradeTime {

    @Expose
    private String year;
    @Expose
    private String month;
    @Expose
    private String dayOfMonth;
    @Expose
    private String hourOfDay;
    @Expose
    private String minute;
    @Expose
    private String second;

    /**
     * 
     * @return
     *     The year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The month
     */
    public String getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 
     * @return
     *     The dayOfMonth
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * 
     * @param dayOfMonth
     *     The dayOfMonth
     */
    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * 
     * @return
     *     The hourOfDay
     */
    public String getHourOfDay() {
        return hourOfDay;
    }

    /**
     * 
     * @param hourOfDay
     *     The hourOfDay
     */
    public void setHourOfDay(String hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    /**
     * 
     * @return
     *     The minute
     */
    public String getMinute() {
        return minute;
    }

    /**
     * 
     * @param minute
     *     The minute
     */
    public void setMinute(String minute) {
        this.minute = minute;
    }

    /**
     * 
     * @return
     *     The second
     */
    public String getSecond() {
        return second;
    }

    /**
     * 
     * @param second
     *     The second
     */
    public void setSecond(String second) {
        this.second = second;
    }

}
