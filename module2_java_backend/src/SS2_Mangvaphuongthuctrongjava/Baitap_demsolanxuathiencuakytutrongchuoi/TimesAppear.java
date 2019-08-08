package SS2_Mangvaphuongthuctrongjava.Baitap_demsolanxuathiencuakytutrongchuoi;

import java.util.Scanner;

public class TimesAppear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao Chuoi:");
        String str=sc.nextLine();
        char c;
        System.out.println("nhap vao ky tu ban muon kiem tra");
        c=sc.next().charAt(0);
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu "+c+" trong chuoi: "+count);
    }
}
