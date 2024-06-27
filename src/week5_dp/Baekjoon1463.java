package week5_dp;

import java.util.Scanner;


public class Baekjoon1463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(minOperations(n));
        System.out.println(solution(n));
    }

    public static int minOperations(int n) {
        int[] dp = new int[n + 1]; // DP 배열 초기화

        // 1은 연산이 필요 없으므로 초기값 0
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            // 기본 연산: 1을 빼는 경우
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n]; // n을 1로 만드는 최소 연산 횟수 반환
    }

    static int solution(int n){
        int[] dp = new int[n+3];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        if(n<=3){
            return dp[n];
        }
        for(int i=4;i<n+1 ;i++){
            if(i%2 == 0) {
                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
            }else if(i%3 == 0) {
                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
            }else{
                dp[i] = dp[i-1] +1;
            }
        }
        return dp[n];
    }
}






//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Main{
//    static Set<Integer> threePowerPlusOne;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        threePowerPlusOne = new HashSet<>();
//        for (int k = 0; k <= 10; k++) {  // 필요에 따라 범위를 조정
//            threePowerPlusOne.add((int) Math.pow(3, k) + 1);
//        }
//
//        System.out.println(dp(n));
//    }
//
//    private static boolean isPowerOfTwoMinusOne(int i) {
//        return ((i - 1) & (i - 2)) == 0;
//    }
//
//    private static boolean isThree(int i){
//        return threePowerPlusOne.contains(i);
//    }
//
//    static int dp(int n){
//        if(n==1){
//            return 0;
//        }else {
//            if(((n%3)!=0 && (n%2)!=0) || isPowerOfTwoMinusOne(n-1) || isThree(n-1)){
//                return dp(n-1) +1;
//            } else if ((n%3)==0) {
//                return dp(n/3) +1;
//            } else if ((n%2)==0) {
//                return dp(n/2) +1;
//            }
//        }
//        return 0;
//    }
//
//}
//




//package week5_dp;
//
//import java.util.Scanner;


//public class Baekjoon1463 {
//    static int[] dp;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//
//        dp = new int[n+3];
//        dp[1] = 0;
//        dp[2] = 1;
//        dp[3] = 1;
//
//        System.out.println(solution(n));
//    }
//
//    static int solution(int n){
//        if(n<=3){
//            return dp[n];
//        }
//        for(int i=4;i<n+1 ;i++){
//            if(i%2 == 0) {
//                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
//            }else if(i%3 == 0) {
//                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
//            }else{
//                dp[i] = dp[i-1] +1;
//            }
//        }
//        return dp[n];
//    }
//}