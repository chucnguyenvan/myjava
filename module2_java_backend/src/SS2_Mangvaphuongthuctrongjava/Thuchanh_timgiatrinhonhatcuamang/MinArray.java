package SS2_Mangvaphuongthuctrongjava.Thuchanh_timgiatrinhonhatcuamang;

import java.util.Scanner;

public class MinArray {

    public static void main(String[] args) {
        int []arr ;
        int size;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so pt cua mang");
        size=sc.nextInt();
        arr =new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao Pt thu "+i);
            arr[i]=sc.nextInt();
        }
        int minArr = minValue(arr);
        System.out.println("The smallest element in the array is: " + minArr);
    }
    public static int minValue(int []array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min= array[i];
            }
        }
        return min;
    }
}
