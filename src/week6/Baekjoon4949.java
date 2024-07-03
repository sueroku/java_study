package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String st = br.readLine();
            if(st.equals(".")){
                break;
            }
            if(st.equals("")){
                System.out.println("no");
                continue;
            }
            if(vps(st)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }

    static boolean vps(String st){
        Stack<Character> smallbig = new Stack<>();
        for(int i=0;i<st.length();i++){
            char check = st.charAt(i);
            if(check=='(' || check=='['){
                smallbig.push(check);
            } else if (check==')') {
                if(smallbig.isEmpty()){
                    return false;
                }
                if(smallbig.peek()=='('){
                    smallbig.pop();
                }else {
                    smallbig.push(check);
                }
            } else if (check==']') {
                if(smallbig.isEmpty()){
                    return false;
                }
                if(smallbig.peek()=='['){
                    smallbig.pop();
                }else {
                    smallbig.push(check);
                }
            }
        }

        if(smallbig.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}



//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while (true) {
//            String st = br.readLine();
//            if (st.equals(".")) {
//                break;
//            }
//            if (vps(st)) {
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        }
//    }
//
//    static boolean vps(String st) {
//        Stack<Character> smallbig = new Stack<>();
//        for (int i = 0; i < st.length(); i++) {
//            char check = st.charAt(i);
//            if (check == '(' || check == '[') {
//                smallbig.push(check);
//            } else if (check == ')') {
//                if (smallbig.isEmpty() || smallbig.peek() != '(') {
//                    return false;
//                }
//                smallbig.pop();
//            } else if (check == ']') {
//                if (smallbig.isEmpty() || smallbig.peek() != '[') {
//                    return false;
//                }
//                smallbig.pop();
//            }
//        }
//        return smallbig.isEmpty();
//    }
//}
//
