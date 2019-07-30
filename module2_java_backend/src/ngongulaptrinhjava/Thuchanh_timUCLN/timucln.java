package ngongulaptrinhjava.Thuchanh_timUCLN;

import java.util.Scanner;

public class timucln {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap vao so thu 1:");
        int a = sc.nextInt();
        System.out.println("Nhap vao so thu 2:");
        int b= sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("No greatest common factor");
            }else System.out.println(b+" is greatest common factor");
        }else if(b==0){
            System.out.println(a +" is greatest common factor");
        }else {
            int ucln=0;
            for(int i=1;i<=a;i++){
                if(a%i==0&&b%i==0){
                    ucln=i;
                }
            }
            System.out.println(ucln +" is greatest common factor");
        }
    }
}
