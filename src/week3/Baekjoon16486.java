package week3;

import java.util.Scanner;

public class Baekjoon16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        double result = (d1*2) + d2*2*3.141592;
        System.out.println(result);
    }
}
