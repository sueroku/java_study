package week3;

import java.util.Scanner;

public class Baekjoon11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int science=Integer.MAX_VALUE , liberal=Integer.MAX_VALUE;
        int sum =0, input=0;
        for(int i=0; i<6;i++){
            input=sc.nextInt();
            if(i<4 && input<science){
                science=input;
            }
            if(i>=4 && input<liberal){
                liberal=input;
            }
            sum +=input;
        }

        System.out.println(sum - science - liberal);
    }
}
