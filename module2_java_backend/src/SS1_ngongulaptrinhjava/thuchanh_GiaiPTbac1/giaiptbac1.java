package SS1_ngongulaptrinhjava.thuchanh_GiaiPTbac1;

import java.util.Scanner;

public class giaiptbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Nhap vao he so a:");
        a=sc.nextDouble();
        System.out.println("Nhap vao he so b:");
        b=sc.nextDouble();
        if(a!=0){
            System.out.println("Pt co nghiem duy nhat "+-b/a);
        }else{
            if(b==0){
                System.out.println("Pt co vo so nghiem");
            }else{
                System.out.println("Pt co vo nghiem");
            }
        }
    }
}
