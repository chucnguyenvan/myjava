package ngongulaptrinhjava.Baitap_Hienthicacloaihinh;

import java.util.Scanner;

public class Draw {
    public void drawrectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void squareTriangle() {
        System.out.println("The corner is square at top-left");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("The corner is square at botton-left");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("The corner is square at top-Right");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("The corner is square at botton-right");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void isoscelesTriangle() {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 5; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Draw draw = new Draw();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("MENU");
        System.out.println("1 : Print the rectangle");
        System.out.println("2 : Print the square triangle ");
        System.out.println("3 : Print isosceles triangle");
        System.out.println("0 Exit");
        choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    draw.drawrectangle();
                    break;
                case 2:
                    draw.squareTriangle();
                    break;
                case 3:
                    draw.isoscelesTriangle();
                    break;
                case 0:
//                    System.exit();
                    System.exit(0);
                    break;
            }
            System.out.println("MENU");
            System.out.println("1 : Print the rectangle");
            System.out.println("2 : Print the square triangle ");
            System.out.println("3 : Print isosceles triangle");
            System.out.println("0 Exit");
            choice = sc.nextInt();
        }
    }
}
