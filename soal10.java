package assigment_test;

public class soal10 {

    public static String sensorNama(String nama){
        String[] temp = nama.split(" ");
        String sensorNama = "";
        for (int i =0; i < temp.length; i++){
            String tempLoop = temp[i];
            for (int j = 0; j<tempLoop.length();j++){
                if (j==0 || j == tempLoop.length()-1){
                    sensorNama += tempLoop.charAt(j);
                }else {
                    sensorNama += "*";
                }
            }
            sensorNama += " ";
        }
        return sensorNama;
    }

    public static void main(String[] args) {
        String nama = "Rani Tiara";
        System.out.println(sensorNama(nama));
    }
}
