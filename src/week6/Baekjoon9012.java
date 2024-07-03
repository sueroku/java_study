package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String st = br.readLine();
            if(vps(st)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }


    }
    static boolean vps(String st){
        Stack<Character> valid = new Stack<>();
        if(st.charAt(0) == ')'){
            return false;
        }
        for(int i=0 ;i<st.length();i++){
            if(valid.isEmpty()){
                valid.push(st.charAt(i));
            }else{
                if(st.charAt(i)==')' && valid.peek()=='('){
                    valid.pop();
                }else {
                    valid.push(st.charAt(i));
                }
            }
        }
        if(valid.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
