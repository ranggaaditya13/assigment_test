package assigment_test;

import java.util.Scanner;

public class soal9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int input = in.nextInt();
        for (int i = 1 ; i <= input; i++){
            System.out.print(input * i +" ");
        }
    }
}
