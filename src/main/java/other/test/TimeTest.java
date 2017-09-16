package other.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by linrufeng on 2017/5/22.
 */
public class TimeTest {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Long time = new Long(1493568022);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(time * 1000 + 24 * 60 * 60 * 1000));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Integer daysLater = (int)(calendar.getTime().getTime()/1000);
        Integer tenDaysLater = daysLater + 24 * 60 * 60 * 10;
        System.out.println(daysLater);
        System.out.println(tenDaysLater);
    }

    public static int getTodayZeroTimeByInt() {
        long zero = new Date().getTime()/(1000*3600*24)*(1000*3600*24)- TimeZone.getDefault().getRawOffset();
        return (int) (zero/1000);
    }

    public static int getCurrentTimeByInt(){
        return (int) ((new Date().getTime())/1000);
    }
}
