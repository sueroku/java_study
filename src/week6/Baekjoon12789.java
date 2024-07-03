package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] students = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ;i<n;i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> space = new Stack<>();
    }
}