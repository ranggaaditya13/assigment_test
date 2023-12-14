package assigment_test;

public class soal11 {


    public static void main(String[] args) {
        String nama = "jeruk";
        int z = nama.length() / 2;
        if ( nama.length() %2==0){
            z +=1;
        }
        System.out.println(z);
        for (int i=0;i<nama.length();i++){
            for (int j=0;j<nama.length();j++){
                if (j==z){
                    System.out.print(nama.charAt(i));
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}
