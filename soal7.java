package assigment_test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class soal7 {

    public static void main(String[] args) {
        int[] data = new int[]{8,7,0,2,7,1,7,6,3,0,7,1,3,4,6,1,6,4,3};
        System.out.println(findMedian(data,data.length));
        System.out.println(mean(data));
        System.out.print(mode(data));


    }

    public static double mean(int[] data){
        double jumlah = 0;
        for (int i = 0; i< data.length;i++){
            jumlah += data[i];
        }
        jumlah = jumlah / data.length;
        return jumlah;
    }

    public static double findMedian(int a[], int n)
    {
        Arrays.sort(a);

        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    public static int mode(int []array)
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int max  = 1;
        int temp = 0;

        for(int i = 0; i < array.length; i++) {

            if (hm.get(array[i]) != null) {

                int count = hm.get(array[i]);
                count++;
                hm.put(array[i], count);

                if(count > max) {
                    max  = count;
                    temp = array[i];
                }
            }

            else
                hm.put(array[i],1);
        }
        return temp;
    }



}
