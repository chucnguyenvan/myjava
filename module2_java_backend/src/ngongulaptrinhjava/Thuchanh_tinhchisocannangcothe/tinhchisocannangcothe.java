package ngongulaptrinhjava.Thuchanh_tinhchisocannangcothe;

import java.util.Scanner;

public class tinhchisocannangcothe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao can nang(in kilogram) cua ban:");
        float weight= scanner.nextFloat();
        System.out.println("nhap vao chieu cao(in meter) cua ban:");
        float height= scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println( bmi+ " Underweight");
        else if (bmi < 25.0)
            System.out.println(bmi+ " Normal");
        else if (bmi < 30.0)
            System.out.println( bmi+ " Overweight");
        else
            System.out.println( bmi+ " Obese");
    }
}
