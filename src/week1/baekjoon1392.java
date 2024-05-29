package week1;

// 리스트

import java.util.ArrayList;
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

        int totalTime = Arrays.stream(music).sum();

        ArrayList<Integer> time = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<music[i];j++){
                time.add(i+1);
            }
        }

        for(int i=0;i<q;i++){
            System.out.println(time.get(q_time[i]));
        }

        sc.close();
    }
}
