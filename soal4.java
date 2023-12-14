package assigment_test;

import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        //membuat n untuk bilangan prima
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;

        System.out.println("Bilangan Prima");
        System.out.print("Mulai dari : ");
        awal=input.nextInt();
        System.out.print("Sampai : ");
        akhir=input.nextInt();
        System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            //akan tereset setiap saat karena perulangan
            bil=0;
            for (int j=1;j<=i;j++) {
                if (i % j == 0) {
                    bil = bil + 1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
}
