package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] line = new String[N];
        for(int i=0;i<N;i++){
            line[i] = br.readLine();
        }
        for(int i=0;i<N;i++){
            System.out.printf("%d. " + line[i] + "%n", i+1);
        }

    }
}
