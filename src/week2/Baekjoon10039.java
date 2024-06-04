package week2;

import java.util.Scanner;

public class Baekjoon10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int score=0;
        int total=0;

        for(int i=0;i<5;i++){
            score = sc.nextInt();
            if(score < 40){
                score = 40;
            }
            total += score;
        }
        System.out.println(total/5);
    }
}
