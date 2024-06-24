package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int start = 0;
        int currentSum = 0;

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =i+1;
        }

        for(int end = 0; end<n;end++){
            currentSum += arr[end];
            while (currentSum>n && start<=end){
                currentSum -= arr[start];
                start++;
            }
            if(currentSum==n){
                count++;
            }
        }

        System.out.println(count);


    }
}
