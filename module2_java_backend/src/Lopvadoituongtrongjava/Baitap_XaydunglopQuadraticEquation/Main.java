package Lopvadoituongtrongjava.Baitap_XaydunglopQuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation ptb2 = new QuadraticEquation();
        System.out.print("Enter the a:");
        ptb2.setA(scanner.nextDouble());
        System.out.print("Enter the b:");
        ptb2.setB(scanner.nextDouble());
        System.out.print("Enter the c:");
        ptb2.setC(scanner.nextDouble());

        if(ptb2.getDiscriminant()>0){
            System.out.println("The equation has 2 roots");
            System.out.println("x1="+ptb2.getRoot1());
            System.out.println("x2="+ptb2.getRoot2());
        }else if(ptb2.getDiscriminant()==0){
            System.out.println("The equation has 1 roots");
            System.out.println("x1=x2="+ptb2.getRoot1());
        }else System.out.println("The equation has no roots");
    }
}
