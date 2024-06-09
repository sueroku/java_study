package week3;

import java.util.Scanner;

public class Baekjoon17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] university = new int[3];
        for(int i=0;i<3;i++){
            university[i] = sc.nextInt();
        }
        int sum=0, min =university[0], index = 0;
        for(int i=0;i<3;i++){
            sum +=university[i];
            if(min>university[i]){
                min = university[i];
                index =i;
            }
        }

        if(sum>=100){
            System.out.println("OK");
        }else {
            switch (index){
                case 0:
                    System.out.println("Soongsil");
                    break;
                case 1:
                    System.out.println("Korea");
                    break;
                case 2:
                    System.out.println("Hanyang");
                    break;
                default:
                    break;
            }
        }

    }
}
