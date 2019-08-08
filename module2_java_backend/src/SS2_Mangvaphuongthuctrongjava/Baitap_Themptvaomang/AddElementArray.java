package SS2_Mangvaphuongthuctrongjava.Baitap_Themptvaomang;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 7, 8};
        System.out.println("nhap vao chi so ban muon chen");
        int index = sc.nextInt();
        System.out.println("nhap vao so ban muon chen");
        int number = sc.nextInt();
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
