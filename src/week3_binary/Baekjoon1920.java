package week3_binary;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for(int i=0;i<N;i++){
            numbers[i] = sc.nextInt();}
        int M = sc.nextInt();
        int[] targets = new int[M];
        for(int i=0;i<M;i++){
            targets[i] = sc.nextInt();}
        Arrays.sort(numbers);
        for(int i=0;i<M;i++){
            if(binarySearch(numbers,targets[i])){
                System.out.println(1);
            }else {
                System.out.println(0);}
        }
    }

    public static boolean binarySearch(int[] arr, int n){
        int left =0;
        int right = arr.length-1;
        int mid;

        while (left<=right){
            mid = (left+right)/2;
            if(arr[mid]<n) left = mid+1;
            else if (arr[mid]>n) right = mid-1;
            else return true;
        }

        return false;
    }
}
