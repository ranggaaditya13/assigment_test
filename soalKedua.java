package assigment_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class soalKedua {

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate dt1 = LocalDate.parse(date1);
        LocalDate dt2= LocalDate.parse(date2);

        long diffDays = ChronoUnit.DAYS.between(dt1, dt2);

        return Math.abs((int)diffDays);
    }
    public static void main(String[] args) {

        //Buku A = 14 Hari , Buku B = 3 Hari , Buku C = 7, Buku D = 7
        int bukuA = 14, bukuB = 3, bukuC = 7, bukuD = 7,dendaA,dendaB,dendaC,dendaD, dendaPerHari = 100;
        //total tanggal
        //jika Ingin Inputan Bisa Menggunakan Scanner Seperti ini
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Pinjam Dengan Format : yyyy-MM-dd");
        String inputan1 = input.nextLine();
        System.out.println("Masukkan Tanggal Pengembalian Dengan Format : yyyy-MM-dd");
        String inputan2 = input.nextLine();
        System.out.println("Masukkan Tanggal Pinjam 2 Dengan Format : yyyy-MM-dd");
        String inputan3 = input.nextLine();
        System.out.println("Masukkan Tanggal Pengembalian 2 Dengan Format : yyyy-MM-dd");
        String inputan4 = input.nextLine();
        int input1 = daysBetweenDates(inputan1,inputan2);
        int input2 = daysBetweenDates(inputan3,inputan4);

//        int input1 = daysBetweenDates("2016-02-28","2016-04-29");
//        int input2 = daysBetweenDates("2018-04-29","2018-05-30");

        //bukuA
        dendaA = (input1 - bukuA) + (input2 - bukuA);
        dendaB = (input1 - bukuB) + (input2 - bukuB);
        dendaC = (input1 - bukuC) + (input2 - bukuC);
        dendaD = (input1 - bukuD) + (input2 - bukuD);

        System.out.println("Denda Dari Masing-Masing Buku Adalah Sebagai Berikut");
        System.out.println("Buku A = " + dendaA * dendaPerHari +" Rupiah");
        System.out.println("Buku B = " + dendaB * dendaPerHari +" Rupiah");
        System.out.println("Buku C = " + dendaC * dendaPerHari +" Rupiah");
        System.out.println("Buku D = " + dendaD * dendaPerHari +" Rupiah");




    }




}
