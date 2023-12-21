package assigment_test;

import java.util.Scanner;

public class soal20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Karena saya kurang paham sama soalnya jadi saya berinisiatif membuat logic kemenangan berbeda
        // logicnya yaitu jika A Lebih besar sama Dengan B . A Akan Menang
        //Jika A Tertinggal Lebih jauh 2x dari Jarak Awal , Makan B Akan Menang
        // Input jarak awal
        System.out.print("Masukkan jarak awal: ");
        int jarakAwal = scanner.nextInt();

        // Inisialisasi posisi awal A dan B
        int posisiA = 0;
        int posisiB = jarakAwal;

        // Loop suit sampai jarak antara A dan B menjadi nol atau kurang
        while (posisiA != posisiB) {
            System.out.print("A suit (G/B/K): ");
            String suitA = scanner.next();

            System.out.print("B suit (G/B/K): ");
            String suitB = scanner.next();

            // Menentukan hasil suit
            if (suitA.equals("G")) {
                if (suitB.equals("G")) {
                    // Draw, tidak ada perubahan posisi
                } else if (suitB.equals("B")) {
                    posisiA -= 1;
                    posisiB += 2;
                } else if (suitB.equals("K")) {
                    posisiA += 2;
                    posisiB -= 1;
                }
            } else if (suitA.equals("B")) {
                if (suitB.equals("G")) {
                    posisiA += 2;
                    posisiB -= 1;
                } else if (suitB.equals("B")) {
                    // Draw, tidak ada perubahan posisi
                } else if (suitB.equals("K")) {
                    posisiA -= 1;
                    posisiB += 2;
                }
            } else if (suitA.equals("K")) {
                if (suitB.equals("G")) {
                    posisiA -= 1;
                    posisiB += 2;
                } else if (suitB.equals("B")) {
                    posisiA += 2;
                    posisiB -= 1;
                } else if (suitB.equals("K")) {
                    // Draw, tidak ada perubahan posisi
                }
            }

            // Output posisi setelah suit
            System.out.println("Posisi A: " + posisiA);
            System.out.println("Posisi B: " + posisiB);
            if (posisiA <= posisiB || posisiA > posisiB+jarakAwal){
                break;
            }
        }

        // Menentukan pemenang
        if (posisiA > posisiB) {
            System.out.println("Pemenang: A");
        } else if (posisiB > posisiA+jarakAwal) {
            System.out.println("Pemenang: B");
        }

        // Tutup scanner
        scanner.close();
    }
}
