package com.hunter.common;import java.text.SimpleDateFormat;import java.util.Calendar;import java.util.Date;/** * Created by zhangchaolong on 16/6/10. */public final class DateUtil {    /**     * 获得某个日期所在月的第一天     *     * @param sDate     * @return     * @throws Exception     */    public static Date getFirstDayOfMonth(String sDate) throws Exception {        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");        Date date = sdf.parse(sDate);        return DateUtil.getFirstDayOfMonth(date);    }    /**     * 获得某个日期所在月的第一天     *     * @param date     * @return     * @throws Exception     */    public static Date getFirstDayOfMonth(Date date) throws Exception {        if (date == null) {            throw new Exception("param is not be null");        }        if (!(date instanceof Date)) {            throw new Exception("para is not a Date Type");        }        Calendar calendar = Calendar.getInstance();        calendar.setTime(date);        calendar.set(Calendar.DAY_OF_MONTH, 1);        return calendar.getTime();    }    /**     * 获得某个日期所在月的最后一天     *     * @param sDate     * @return     * @throws Exception     */    public static Date getLastDayOfMonth(String sDate) throws Exception {        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");        Date date = sdf.parse(sDate);        return DateUtil.getLastDayOfMonth(date);    }    /**     * 获得某个日期所在月的最后一天     *     * @param date     * @return     * @throws Exception     */    public static Date getLastDayOfMonth(Date date) throws Exception {        if (date == null) {            throw new Exception("param is not be null");        }        if (!(date instanceof Date)) {            throw new Exception("para is not a Date Type");        }        Calendar calendar = Calendar.getInstance();        calendar.setTime(date);        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));        return calendar.getTime();    }    /**     * 获得两个日期之间相差的天数     * @param startDate     * @param endDate     * @return     * @throws Exception     */    public static int getDaysBetweenDate(Date startDate, Date endDate) throws Exception {        if (!(startDate instanceof Date)) {            throw new Exception("para1 is not a Date Type");        }        if (!(endDate instanceof Date)) {            throw new Exception("para2 is not a Date Type");        }        int days = (int) ((endDate.getTime() - startDate.getTime()) / 1000 / 60 / 60 / 24);        return days;    }    /**     * 获得两个日期之前相差的小时数     * @param startDate     * @param endDate     * @return     * @throws Exception     */    public static int getHoursBetweenDate(Date startDate, Date endDate) throws Exception {        if (!(startDate instanceof Date)) {            throw new Exception("para1 is not a Date Type");        }        if (!(endDate instanceof Date)) {            throw new Exception("para2 is not a Date Type");        }        int days = (int) ((endDate.getTime() - startDate.getTime()) / 1000 / 60 / 60);        return days;    }    /**     * main 方法     *     * @param args     */    public static void main(String args[]) {//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//        Date aDate = null;//        try {//            aDate = sdf.parse("2014-05-23");//        } catch (ParseException e) {//            e.printStackTrace();//        }//        try {////            aDate = DateUtil.getFirstDayOfMonth(aDate);//            aDate = DateUtil.getLastDayOfMonth(aDate);//        } catch (Exception e) {//            e.printStackTrace();//        }////        String stringDate = sdf.format(aDate);//        System.out.println(stringDate);//        DateUtil.testGetDaysBetweenDate();        DateUtil.testGetHoursBetweenDate();    }    public static void testGetDaysBetweenDate() {        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        Date startDate=null;        Date endDate=null;        try {            startDate=sdf.parse("2016-06-10 03:33:00");            endDate=sdf.parse("2016-06-11 03:31:00" );            int days=DateUtil.getDaysBetweenDate(startDate,endDate);            System.out.println(days);        } catch (Exception e) {            e.printStackTrace();        }    }    public static void testGetHoursBetweenDate() {        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        Date startDate=null;        Date endDate=null;        try {            startDate=sdf.parse("2016-06-10 03:33:00");            endDate=sdf.parse("2016-06-11 03:31:00" );            int days=DateUtil.getHoursBetweenDate(startDate,endDate);            System.out.println(days);        } catch (Exception e) {            e.printStackTrace();        }    }}