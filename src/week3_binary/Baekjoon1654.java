package week3_binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] kLength = new int[K];
        long max = Integer.MIN_VALUE;
        long min = 0;
        long mid;

        for(int i=0;i<K;i++){
            kLength[i] = Integer.parseInt(br.readLine());
            max = Math.max(max,kLength[i]);
        }

        max = max +1;
        long num =0;

        while(min < max){
            mid = (min+max)/2;
            num=0;
            for(int i=0; i<K;i++){
                num += kLength[i]/mid;
            }
            if(num<N) max = mid;
            else min=mid+1;
        }
        System.out.println(min-1);

    }
}
