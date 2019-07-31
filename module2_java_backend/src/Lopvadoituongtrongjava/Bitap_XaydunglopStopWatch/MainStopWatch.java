package Lopvadoituongtrongjava.Bitap_XaydunglopStopWatch;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch watch=new StopWatch();
        int n=0;
        do {
            long count = 0;
            for (long i = 0; i < 1000000000; i++) {
                count++;
            }
            n++;
        }while(n<20);
        watch.stop();
        System.out.println("Tg da chay:"+watch.getElapsedTime());
    }
}
