package assigment_test;

public class soal22 {
    // note Belum Dicek
    public static void main(String[] args) {
        int[] panjangLilin = {3, 3, 9, 6, 7, 8, 23};
        int[] lajuMeleleh = hitungLajuMeleleh(panjangLilin.length);

        int LilinPertama = temukanLilinPertamaHabisMeleleh(panjangLilin, lajuMeleleh);

        if (LilinPertama != -1) {
            System.out.println("Lilin pertama yang habis meleleh adalah lilin ke-" + (LilinPertama + 1));
        } else {
            System.out.println("Semua lilin habis meleleh pada saat yang bersamaan.");
        }
    }

    private static int[] hitungLajuMeleleh(int n) {
        int[] lajuMeleleh = new int[n];
        lajuMeleleh[0] = 1;
        lajuMeleleh[1] = 1;

        for (int i = 2; i < n; i++) {
            lajuMeleleh[i] = lajuMeleleh[i - 1] + lajuMeleleh[i - 2];
        }

        return lajuMeleleh;
    }

    private static int temukanLilinPertamaHabisMeleleh(int[] pjLilin, int[] lajuMeleleh) {
        int n = pjLilin.length;
        int waktuMelelehTerakhir = Integer.MAX_VALUE;
        int lilinPertamaHabisMeleleh = -1;

        for (int i = 0; i < n; i++) {
            int waktuMeleleh = pjLilin[i] / lajuMeleleh[i];

            if (waktuMeleleh < waktuMelelehTerakhir) {
                waktuMelelehTerakhir = waktuMeleleh;
                lilinPertamaHabisMeleleh = i;
            }
        }

        return lilinPertamaHabisMeleleh;
    }
}
