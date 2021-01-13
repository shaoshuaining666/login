package com.hotlel.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Create By LB on 2020/5/28.
 */
@Slf4j
public class TimeUtil {

    public TimeUtil() {
    }
    private static final Logger log = LoggerFactory.getLogger(TimeUtil.class);

    public static final String YY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YY_MM_DD = "yyyy-MM-dd";


    public static Date getExpiration(long outTime) {
        long strExpiration = System.currentTimeMillis() + outTime;
        return new Date(strExpiration);
    }

    public static Date now() {
        SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(YY_MM_DD_HH_MM_SS);
        String strNowTime = yyyyMMddHHmmss.format(Calendar.getInstance().getTime());
        try {
            return yyyyMMddHHmmss.parse(strNowTime);
        } catch (ParseException e) {
            log.error(" DateHelper getParseDate ", e);
        }
        return null;
    }

}
