package assigment_test;


import java.sql.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        String dat1 = "2016-02-28";
        String dat2 = "2016-02-29";
        java.sql.Date da1 = Date.valueOf(dat1);
        Date da2 = Date.valueOf(dat2);
        System.out.println(getDifferenceDays(da1,da2));
    }

    public static long getDifferenceDays(java.sql.Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
