package week3;

import java.util.Scanner;

public class Baekjoon17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[]{1,2,3,4,5,4,3,2};
        int result=0;
        int index=0;
        for(int i=0;i<N; i++){
            if(index==nums.length){
                index =0;
            }
            result = nums[index];
            index++;
        }
        System.out.println(result);
    }
}
