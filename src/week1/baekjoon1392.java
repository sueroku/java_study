package week1;

// 배열

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon1392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] music = new int[n];
        int[] q_time = new int[q];

        for(int i=0;i<n;i++){
            music[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            q_time[i]=sc.nextInt();
        }

        sc.close();
    }
}
