package SS1_ngongulaptrinhjava.Baitap_Hienthi20songuyentodautien;

import java.util.Scanner;

public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n=2;
        boolean isPrime=true;
        while(count<20){
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime) {
                count++;
                System.out.println(n);
            }
            n++;
            isPrime=true;
        }
    }
}
