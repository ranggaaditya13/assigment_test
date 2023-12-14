package assigment_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class soalKetiga {

    public static void main(String[] args) {
        String masuk = "27 Januari 2019 | 11:14:23";
        String keluar = "27 Januari 2019 | 13:20:00";
        String[] arrayMasuk = masuk.split(" ");
        String[] arrayKeluar = keluar.split(" ");
        String[] Bulan = new String[]{"Januari","Februari","Maret","April",
                "Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        String formatBulan = "";

        for (int i = 0; i<Bulan.length;i++){
            if (Bulan[i].equals(arrayMasuk[1])){
                formatBulan = "0"+(i+1);
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String startDateString = arrayMasuk[2] +"-"+formatBulan+"-"+arrayMasuk[0]+" "+arrayMasuk[4];
        String endDateString = arrayKeluar[2] +"-"+formatBulan+"-"+arrayKeluar[0]+" "+arrayKeluar[4];


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Instant startInstant = LocalDateTime.parse(startDateString, formatter).atZone(ZoneId.systemDefault()).toInstant();
        Instant endInstant = LocalDateTime.parse(endDateString, formatter).atZone(ZoneId.systemDefault()).toInstant();
        long diffHours = ChronoUnit.HOURS.between(startInstant, endInstant);
        long diffSec = ChronoUnit.SECONDS.between(startInstant,endInstant);
        long sisaSec = diffSec % 60 ;

//        System.out.println("Total hours between " + startDateString + " and " + endDateString + ": " + diffHours);
        if (diffHours >= 24 && sisaSec > 0){
            System.out.println(15000 + (diffHours - 24) * 1000);
        }else if(diffHours >=8 && sisaSec > 0){
            System.out.println(8000);
        }else if(diffHours<=8 && diffHours > 0){
            System.out.println(diffHours * 1000);
        }



    }
}
