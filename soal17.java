package assigment_test;

public class soal17 {
//cek
    public static void main(String[] args) {
        String perjalananHattori = "NNTNNNTTTTTNTTTNTN";

        int jumlahGunung = hitungGunung(perjalananHattori);
        int jumlahLembah = hitungLembah(perjalananHattori);

        System.out.println("Jumlah Gunung: " + jumlahGunung);
        System.out.println("Jumlah Lembah: " + jumlahLembah);
    }

    // Fungsi untuk menghitung jumlah gunung
    private static int hitungGunung(String perjalanan) {
        int jumlahGunung = 0;
        int ketinggian = 0;

        for (char langkah : perjalanan.toCharArray()) {
            if (langkah == 'N') {
                ketinggian++;
            } else if (langkah == 'T') {
                ketinggian--;
            }

            // Cek apakah berada di puncak gunung (ketinggian kembali ke 0 setelah naik)
            if (ketinggian == 0 && langkah == 'N') {
                jumlahGunung++;
            }
        }

        return jumlahGunung;
    }

    // Fungsi untuk menghitung jumlah lembah
    private static int hitungLembah(String perjalanan) {
        int jumlahLembah = 0;
        int ketinggian = 0;

        for (char langkah : perjalanan.toCharArray()) {
            if (langkah == 'N') {
                ketinggian++;
            } else if (langkah == 'T') {
                ketinggian--;
            }

            // Cek apakah berada di lembah (ketinggian kembali ke 0 setelah turun)
            if (ketinggian == 0 && langkah == 'T') {
                jumlahLembah++;
            }
        }

        return jumlahLembah;
    }
}
