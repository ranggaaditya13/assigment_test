package assigment_test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class soal15 {

    private String modifyDateLayout(String inputDate) throws ParseException{
        Date date = new SimpleDateFormat("hh:mm:ss a").parse(inputDate);
        return new SimpleDateFormat("k:mm:ss").format(date);
    }

    public static void main(String[] args) throws ParseException {

        String inputDate = "03:40:44 PM";
        String newDate = new soal15().modifyDateLayout(inputDate);
        System.out.println(newDate);

    }
}
