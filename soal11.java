package assigment_test;

public class soal11 {


    public static void main(String[] args) {
        String nama = "afrika";
        int z = middle(nama);
        int up = 0;
        if (nama.length() %2==0){
            up +=1;
        }

        for (int i=0;i<nama.length();i++){
            for (int j=0;j<nama.length()+up;j++){
                if (j==z+up){
                    System.out.print(nama.charAt(i));
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }


    public static int middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return position;
    }

}
