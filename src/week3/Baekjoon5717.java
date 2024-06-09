package week3;

import java.util.Scanner;

public class Baekjoon5717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, F = 0;

        while (true){
            M = sc.nextInt();
            F = sc.nextInt();
            if(M==0 && F==0){
                break;
            }
            System.out.println(M+F);
        }
    }
}
