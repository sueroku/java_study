package week5;

import java.util.*;

public class Baekjoon1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        while(n>0){
            nums.add(n%10);
            n = n/10;
        }
        nums.sort(Comparator.reverseOrder());
        for(int a : nums){
            System.out.print(a);
        }
    }
}
