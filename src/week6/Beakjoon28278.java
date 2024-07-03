package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Beakjoon28278 {
    static List<Integer> stackList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        stackList = new ArrayList<>();

        for(int i=0;i<n;i++){
            String orderSt = br.readLine();
            StringTokenizer orderList = new StringTokenizer(orderSt);
            int order = 0;
            int num =0;
            if(orderSt.length()>1){
                order = Integer.parseInt(orderList.nextToken());
                num = Integer.parseInt(orderList.nextToken());
            }else {
                order = Integer.parseInt(orderList.nextToken());
            }
            if(order==1){
                stack_add(num);
            } else if (order==2) {
                stack_pop();
            }else if(order==3){
                stack_size();
            } else if (order==4) {
                stack_isEmpty();
            } else if (order==5) {
                stack_peek();
            }
        }
    }

    static void stack_add(int n){
        stackList.add(n);
    }
    static void stack_pop(){
        if(!stackList.isEmpty()){
            System.out.println(stackList.get(stackList.size()-1));
            stackList.remove(stackList.size()-1);
        }else {
            System.out.println(-1);
        }
    }
    static void stack_size(){
        System.out.println(stackList.size());
    }
    static void stack_isEmpty(){
        if(stackList.isEmpty()){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
    static void stack_peek(){
        if(stackList.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(stackList.get(stackList.size()-1));
        }
    }
}
