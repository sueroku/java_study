package week3;

import java.util.Scanner;

public class Baekjoon4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int gap = sc.nextInt();

        int team1 = (int)(sum+gap)/2;
        int team2 = sum - team1;

        if(gap>sum || (sum+gap)%2!=0){
            System.out.println(-1);
        }else {
            System.out.println(team1+" "+team2);
        }
    }
}
