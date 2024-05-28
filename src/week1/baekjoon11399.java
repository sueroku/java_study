package week1;

//  그리디, 정렬

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon11399 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int timeP [] = new int[n];
        for(int i=0;i<n;i++){
            timeP[i] = sc.nextInt();
        }
        
        int total = 0;
        int totalTime = 0;

        Arrays.sort(timeP);

        for(int i=0;i<n;i++){
            totalTime += total + timeP[i];
            total += timeP[i];
        }

        System.out.println(totalTime);

        sc.close();
    }
}