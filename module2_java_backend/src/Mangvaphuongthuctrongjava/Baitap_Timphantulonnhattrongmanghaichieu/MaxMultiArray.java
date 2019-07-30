package Mangvaphuongthuctrongjava.Baitap_Timphantulonnhattrongmanghaichieu;

public class MaxMultiArray {
    public static void main(String[] args) {
        int[][] array={
                {1,2,3,4,8},
                {2,39,4,5,100},
                {4,5,6,12,12}
        };
        int max=array[0][0];
        int iindex=0;
        int jindex=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>max){
                    max=array[i][j];
                     iindex=i;
                    jindex=j;
                }
            }
        }
        System.out.println("Gia tri max cua mang "+array[iindex][jindex]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
