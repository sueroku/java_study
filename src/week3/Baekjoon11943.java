package week3;

import java.util.Scanner;

public class Baekjoon11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a+d >= b+c){
            System.out.println(b+c);
        }else{
            System.out.println(a+d);
        }
    }
}
