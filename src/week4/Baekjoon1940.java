package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int start = 0;
        int end = arr.length-1;

        Arrays.sort(arr);

        while (true){
            if(start>=end){break;}
            if(arr[start]+arr[end]==m){
                count++;
                end--;
                start++;
            }else if(arr[start]+arr[end]>m){
                end--;
            }else if(arr[start]+arr[end]<m){
                start++;
            }
        }
        System.out.println(count);


    }
}
