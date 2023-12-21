package assigment_test;

import java.util.Scanner;

public class soal6 {


    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Bilangan !! ");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Palindrome.");
        else
            System.out.println("Bukan Palindrome.");
    }
}

