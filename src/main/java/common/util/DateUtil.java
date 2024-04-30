package common.util;

import java.util.Date;

/**
 * @author xiaodun
 */
public class DateUtil {
    /**
     * 将指定时间转换为指定格式字符串
     * @param date
     * @param format
     * @return dateString
     */
    public static String formatDate(Date date, String format) {
        if (date == null) {
            return null;
        }
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format);
        return sdf.format(date);
    }
}
