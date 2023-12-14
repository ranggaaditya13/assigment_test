package assigment_test;

public class soal5 {

    public static void main(String[] args) {
        int n = 10; // total jumlah yang ingin dikeluarkan
        int first = 0;
        int second = 1;

        System.out.println( n + " Pertama Fibonacci numbers adalah :");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
