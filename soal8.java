package assigment_test;

import java.util.Arrays;

public class soal8 {
    //clear tapi belum cek kembali
    public static void main(String[] args) {
        int[] deret = {1, 2, 4, 7, 8, 6, 9};
        Arrays.sort(deret);
        int panjangDeret = deret.length;
        int jumlahKomponen = 4;

        int minimalSum = findMinimalSum(deret, panjangDeret, jumlahKomponen);
        int maksimalSum = findMaximalSum(deret, panjangDeret, jumlahKomponen);

        System.out.println("Nilai Minimal: " + minimalSum);
        System.out.println("Nilai Maksimal: " + maksimalSum);
    }

    private static int findMinimalSum(int[] deret, int panjangDeret, int jumlahKomponen) {
        int minimalSum = Integer.MAX_VALUE;

        for (int i = 0; i <= panjangDeret - jumlahKomponen; i++) {
            int currentSum = 0;
            for (int j = i; j < i + jumlahKomponen; j++) {
                currentSum += deret[j];
            }
            minimalSum = Math.min(minimalSum, currentSum);
        }

        return minimalSum;
    }

    private static int findMaximalSum(int[] deret, int panjangDeret, int jumlahKomponen) {
        int maximalSum = Integer.MIN_VALUE;

        for (int i = 0; i <= panjangDeret - jumlahKomponen; i++) {
            int currentSum = 0;
            for (int j = i; j < i + jumlahKomponen; j++) {
                currentSum += deret[j];
            }
            maximalSum = Math.max(maximalSum, currentSum);
        }

        return maximalSum;
    }
}
