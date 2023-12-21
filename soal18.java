package assigment_test;

public class soal18 {
        //check
    public static void main(String[] args) {
        int[] jamMakan = {9, 13, 15, 17};
        int[] kaloriKue = {30, 20, 50, 80};

        int jamOlahragaDimulai = 18;

        double totalWaktuOlahraga = hitungTotalWaktuOlahraga(jamMakan, kaloriKue, jamOlahragaDimulai);

        double totalAirMinum = hitungTotalAirMinum(totalWaktuOlahraga);

        // Output hasil
        System.out.println("Total cc air yang akan diminum Donna selama berolahraga: " + totalAirMinum + " cc");
    }

    private static double hitungTotalWaktuOlahraga(int[] jamMakan, int[] kaloriKue, int jamOlahragaDimulai) {
        double totalWaktuOlahraga = 0;

        for (int i = 0; i < jamMakan.length; i++) {
            int waktuMakan = jamMakan[i];
            int kalori = kaloriKue[i];

            int selisihWaktu = jamOlahragaDimulai - waktuMakan;

            double selisihWaktuJam = selisihWaktu / 60.0;

            totalWaktuOlahraga += selisihWaktuJam + (0.1 * kalori);
        }

        return totalWaktuOlahraga;
    }

    private static double hitungTotalAirMinum(double totalWaktuOlahraga) {
        double intervalMinumAir = 30.0;
        double airPerInterval = 100.0;

        double airDiAkhirOlahraga = 500.0;

        double jumlahInterval = totalWaktuOlahraga / intervalMinumAir;

        double totalAirMinum = (jumlahInterval * airPerInterval) + airDiAkhirOlahraga;

        return totalAirMinum;
    }
}
