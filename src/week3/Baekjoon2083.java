package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] players;
        while (true){
            players = br.readLine().split(" ");
            if(players[0].equals("#")){break;}
            if(Integer.parseInt(players[1])>17 || Integer.parseInt(players[2])>=80){
                System.out.println(players[0] + " Senior");
            }else{
                System.out.println(players[0] + " Junior");
            }
        }
    }
}
