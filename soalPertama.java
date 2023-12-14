package assigment_test;

import java.util.ArrayList;

public class soalPertama {

    public static void main(String[] args) {

        int uang = 2000, count = 0;
        int kacamata = 500, baju = 200,sepatu = 200, buku = 100;
        ArrayList<String> total = new ArrayList<>();
        int barangTermurah = buku;
        while (uang >= barangTermurah){
          if (uang >= kacamata){
              total.add("Kacamata");
              uang -= kacamata;
              count++;
          }

            if (uang >= baju){
                total.add("Baju");
                uang -= baju;
                count++;
            }
            if (uang >= sepatu){
                total.add("Sepatu");
                uang -= sepatu;
                count++;
            }
            if (uang >= buku){
                total.add("Buku");
                uang -= buku;
                count++;
            }

        }
        System.out.println("Jumlah Item Yang Dibeli Adalah : "+ count);
        for (int i=0;i<total.size();i++){
            System.out.print(total.get(i)+", ");
        }

    }
}
