package week5;
import java.io.*;
import java.util.*;
public class BOJ4673 {
    public static void main(String args[]){
        selfNumber(100);
    }
    public static void selfNumber(int num){
        int numbers[] = new int[num];
        int i;
        int noself;
        int tmp;

        for(i=0 ; i<num ; i++){
            numbers[i] = i+1;
        }

        for(i=1 ; i<=num ; i++){
            tmp = i;
            noself = i;
            while(tmp > 0){
                noself += tmp%10;
                tmp /= 10;
            }
            if(noself <= num){
                numbers[noself-1] = 0;
            }
        }

        for(i=0 ; i<num ; i++){
            if(numbers[i] != 0){
                System.out.println(numbers[i]);
            }
        }
    }
}

//
//package week5;
//
//public class BOJ4673 {
//    public static void main(String[] args) {
//        selfNumber(10000); // 문제에서 제시한 숫자 범위는 1~10000 입니다.
//    }
//
//    public static void selfNumber(int num) {
//        boolean[] isNotSelfNumber = new boolean[num + 1];
//
//        for (int i = 1; i <= num; i++) {
//            int noself = generate(i);
//            if (noself <= num) {
//                isNotSelfNumber[noself] = true;
//            }
//        }
//
//        for (int i = 1; i <= num; i++) {
//            if (!isNotSelfNumber[i]) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static int generate(int number) {
//        int sum = number;
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        return sum;
//    }
//}