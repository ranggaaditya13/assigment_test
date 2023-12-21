package assigment_test;

public class soal21 {

    public static void main(String[] args) {
        //cek (Clear
        int stamina =0, distance=0;
        char walk = 'w';
        char jump = 'j';
        char hole = 'h';
        char[] jalan = {'w','w','w','w','j','j'};
        String route ="hwwwwhwwww";
        for(int i=0;i<jalan.length;i++){
            if (jalan[i] == walk && route.charAt(i) == walk) {
                stamina += 1;
                distance += 1;
                if (distance >= route.length()){
                    System.out.println("Anda Menang");
                }
            }else if(jalan[i] == walk && route.charAt(i) == hole){
                System.out.println("Failed");
                System.out.println("Anda Tidak meloncat");
                break;
            }else if(jalan[i] == jump && route.charAt(i) == walk){
                stamina -= 2;
                distance +=3;
                if (distance >= route.length()){
                    System.out.println("Anda Menang");
                }
            }else if(jalan[i] == jump && route.charAt(i) == hole){
                if (stamina >= 2 ){
                    stamina -= 2;
                    distance +=3;
                    if (distance >= route.length()){
                        System.out.println("Anda Menang");
                    }
                }else{
                    System.out.println("Failed");
                    System.out.println("Stamina Anda Tidak Cukup");
                    break;
                }
            }


        }
        System.out.println("Stamina :  " + stamina +" Dan Distance "+ distance);
    }
}
