package assigment_test;

import java.util.*;
//clear
public class soal16 {

    static class Makanan {
        String namaMakanan;
        int hargaMakanan;

        public String getNamaMakanan() {
            return namaMakanan;
        }

        public void setNamaMakanan(String namaMakanan) {
            this.namaMakanan = namaMakanan;
        }

        public int getHargaMakanan() {
            return hargaMakanan;
        }

        public void setHargaMakanan(int hargaMakanan) {
            this.hargaMakanan = hargaMakanan;
        }

        public Makanan(String namaMakanan, int hargaMakanan) {
            this.namaMakanan = namaMakanan;
            this.hargaMakanan = hargaMakanan;
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Makanan makanan ;
        //bagian total pelanggan bisa dijadikan input Scanner juga
        int totalPelanggan = 4;
        double bayarPerOrang = 0;
        double habisDikurangiYangGaMakanIkan =0;
        double bayaranYgGaMakanIkan = 0;
        ArrayList<Makanan> data = new ArrayList<>();
        double totalbill = 0, pajak = 0.1, service = 0.05;
        System.out.println("Masukkan Total Makanan Yang Dipesan ");
        int totalMakanan = inp.nextInt();
        inp.nextLine();
        for (int i =0;i< totalMakanan;i++){
            System.out.println("Masukkan Makanan Ke -"+ (i+1));
            String nama = inp.nextLine();
            System.out.println("Masukkan harga Makanan ");
            int harga = inp.nextInt();
            inp.nextLine();
            makanan = new Makanan(nama,harga);
            data.add(makanan);
        }
        double hargaTotal = 0;
        for (int i = 0;i<data.size();i++){
            System.out.print(data.get(i).namaMakanan +" Dan Harganya : " + data.get(i).hargaMakanan);
            System.out.println();
            String dataMakananLoop = data.get(i).namaMakanan;
            int hargaMakanan = data.get(i).hargaMakanan;
            hargaTotal = hargaMakanan  + (hargaMakanan * pajak) + (hargaMakanan * service);
            if (dataMakananLoop.toLowerCase().matches(".*tuna.*") || dataMakananLoop.toLowerCase().matches(".*ikan*.")){
                totalbill += hargaTotal;

                bayaranYgGaMakanIkan -= hargaTotal / totalPelanggan;
                habisDikurangiYangGaMakanIkan += hargaTotal / 3;
                habisDikurangiYangGaMakanIkan = habisDikurangiYangGaMakanIkan - bayarPerOrang ;

            }else{

                totalbill += hargaTotal;
            }

            bayarPerOrang = totalbill / totalPelanggan;
        }
        bayaranYgGaMakanIkan = bayaranYgGaMakanIkan + bayarPerOrang;
        bayarPerOrang += habisDikurangiYangGaMakanIkan;

        System.out.println("hasil   "+ totalbill);
        System.out.println("Yang Dibayar Oleh Semuanya Kecuali Yang Makan Ikan Adalah : " + (int)bayarPerOrang);
        System.out.println("Bayaran Yang Ga Makan Ikan Adalah : " + (int)bayaranYgGaMakanIkan);






    }
}
