package week3;

import java.util.Scanner;

public class Baekjoon20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kda = sc.nextLine().split("/");
        if(Integer.parseInt(kda[0])+Integer.parseInt(kda[2]) < Integer.parseInt(kda[1]) || Integer.parseInt(kda[1])==0){
            System.out.println("hasu");
        }else {
            System.out.println("gosu");
        }
    }
}
