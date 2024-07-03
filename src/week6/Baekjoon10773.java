package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> money = new Stack<>();
        int sum = 0;
        for(int i=0;i<k;i++){
            int m = Integer.parseInt(br.readLine());
            if(m==0){
                sum -= money.pop();
            }else{
                money.push(m);
                sum+=m;
            }
        }

        System.out.println(sum);
    }
}
