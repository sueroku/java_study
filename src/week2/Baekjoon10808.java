package week2;

import java.util.Scanner;

public class Baekjoon10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] alphabet = new int[26];

        for(int i=0;i<s.length();i++) {
            alphabet[s.charAt(i)-97] +=1;
        }

        for(int i=0;i<26;i++){
            System.out.print(alphabet[i]+" ");
        }

    }
}
