package SS1_ngongulaptrinhjava.Baitap_Hienthicacsonguyeentonhohon100;

import java.util.Scanner;

public class hienthcacsonuyentonhohon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n=2;
        boolean isPrime=true;
        while(n<=100){
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime) {
                System.out.println(n);
            }
            n++;
            isPrime=true;
        }
    }
}
