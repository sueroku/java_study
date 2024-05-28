package week1;

import java.util.Scanner;
import java.util.Arrays;

public class baekjoon1392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int music[] = new int[n];
        int q_time[] = new int[q];

        for(int i=0;i<n;i++){
            music[i]=sc.nextInt();
        }

        int total_time = Arrays.stream(music).sum();
        
        for(int i=0;i<q;i++){
            q_time[i]=sc.nextInt();
        }

        int time[]
    }
}
