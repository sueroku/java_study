package week3;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon11945 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0;i<N;i++){
            while(sc.hasNext()){
                StringBuffer sb = new StringBuffer(sc.nextLine()); // stringbuilder 비교
                System.out.println(sb.reverse());
            }
        }
    }
}
