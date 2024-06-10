package week3_binary;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] kLength = new int[K];
        for(int i=0;i<K;i++){
            kLength[i] = sc.nextInt();
        }
        Arrays.sort(kLength);
        int min = 0;
        int max = kLength[K-1]+1;
        int mid;
        int num =0;
        while(min <max){
            mid = (min+max)/2;
            num=0;
            for(int i=0; i<K;i++){
                num += kLength[i]/mid;
            }
            if(num<N)max = mid;
            else min=mid+1;
        }
        System.out.println(min-1);

    }
}
