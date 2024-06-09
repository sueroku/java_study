package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuffer temp = new StringBuffer();
        String reverse;

        while(true){
            input = bf.readLine();
            if(input.equals("END")){
                break;
            }
            temp.append(input);
            reverse = temp.reverse().toString();
            temp.delete(0,temp.length());
            System.out.println(reverse);

        }
    }
}
