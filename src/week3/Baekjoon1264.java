package week3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baekjoon1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input;
        char check;
        List<Character> checkList = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int count=0;

        while(true){
            input = bf.readLine();
            if(input.equals("#")){
                break;
            }
            for(int i=0;i<input.length();i++){
                check = input.charAt(i);
                if(checkList.contains(check)){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }

    }
}
