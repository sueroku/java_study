package week2;

import java.util.Scanner;

public class Baekjoon5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int burger = 2000;
        int beverage = 2000;
        int temp = 0;

        for(int i=0;i<3;i++){
            temp = sc.nextInt();
            if(temp<burger){
                burger = temp;
            }
        }

        for(int i=0;i<2;i++){
            temp = sc.nextInt();
            if(temp<beverage){
                beverage=temp;
            }
        }
        System.out.println((burger+beverage)-50);
    }
}
