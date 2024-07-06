package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> students = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ;i<n;i++){
            students.add(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> wait = new Stack<>();

        int order =1;
        String check = "";
        while(true){
            if(order==n+1){
                check="Nice";
                break;
            }
            if(!students.isEmpty() && order == students.peek()){
                students.poll();
                order++;
            }
            if(!wait.isEmpty() && order == wait.peek()){
                wait.pop();
                order++;
            }
            else if(!students.isEmpty() && students.peek()!=order){
                wait.add(students.poll());
            }
            if(!students.isEmpty() && !wait.isEmpty() && students.peek()>wait.peek() && students.peek()!=order && wait.peek()!=order){
                check = "Sad";
                break;
            }
//            System.out.println("student");
//            System.out.println(students);
//            System.out.println("wait");
//            System.out.println(wait);
        }

        System.out.println(check);
    }
}