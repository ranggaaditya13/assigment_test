package assigment_test;

import static java.lang.Integer.parseInt;

public class soal13 {

    public static void main(String[] args) {
        //1-6 = menggunakan 30 derajat
        //7-12 = menggunakan pengurangan 360 - total angka dikali 30 dejarat
        String jam = "3:00";
        int derajat = 30;
        int maxMenit = 60;
        String[] temp = new String[]{};
        temp = jam.split(":");
        int satuanJam = Integer.parseInt(temp[0]);
        int satuanMenit = Integer.parseInt(temp[1]);
        int hasilDerajatMenit = satuanMenit * derajat / maxMenit;
        System.out.print((satuanJam * derajat )+ hasilDerajatMenit);


    }
}
