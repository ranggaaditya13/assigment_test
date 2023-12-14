package assigment_test;

public class soal14 {

    public static String testStart(int n){
        int[] data = new int[]{3,9,0,7,1,2,4};
        StringBuilder hasil = new StringBuilder();
        for (int i= 0; i < data.length;i++){
            if (n >= data.length) {
                n=0;
            }
            hasil.append(data[n]).append(" ");
            n++;
        }
        return hasil.toString();
    }

    public static void main(String[] args) {
        System.out.print(testStart(1));
    }
}
