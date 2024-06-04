package week2;

import java.util.Scanner;

public class Baekjoon2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.printf("*");
            }
            if(i == 1){break;}
            System.out.printf("\n");
        }
    }
}
