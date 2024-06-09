package week3;

import java.util.Scanner;

public class Baekjoon13752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k =0;
        for(int i=0; i<n; i++){
            k = sc.nextInt();
            for(int j=0;j<k;j++){
                System.out.print("=");
            }
            System.out.println("");
        }
    }
}
