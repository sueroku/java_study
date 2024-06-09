package week3;

import java.util.Scanner;

public class Baekjoon24263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(n);
        System.out.println(1);

    }

    public int MenOfPassion(int[] arr, int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}
