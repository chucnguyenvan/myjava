package SS2_Mangvaphuongthuctrongjava.Thuchanh_chuyendoinhietdo;

import java.util.Scanner;

public class ChangeTemprature {
    static Scanner sc = new Scanner(System.in);
    public static void fahrenheitToCelsius(){
        System.out.println("Nhap vao do f");
        double f=sc.nextDouble();;
        double celsius=(5.0 / 9) * (f - 32);
        System.out.println("chuyen qua do c la: "+celsius);
    }
    public static void celsiusTofahrenheit(){
        System.out.println("Nhap vao do c");
        double c=sc.nextDouble();;
        double f=(9.0 / 5) * c + 32;;
        System.out.println("chuyen qua do c la: "+f);
    }
    public static void main(String[] args) {
        System.out.println("MENU:");
        System.out.println("1 : Fahrenheit to Celsius");
        System.out.println("2 : Celsius to Fahrenheit");
        System.out.println("0 : Exit");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:fahrenheitToCelsius();
                    break;
                case 2:celsiusTofahrenheit();
                    break;
                case 0:System.exit(0);
                    break;
                default:System.out.println("No choice!");
                    break;
            }
            System.out.println("MENU:");
            System.out.println("1 : Fahrenheit to Celsius");
            System.out.println("2 : Celsius to Fahrenheit");
            System.out.println("0 : Exit");
            choice = sc.nextInt();
        }
    }
}
