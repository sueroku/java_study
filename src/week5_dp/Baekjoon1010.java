package week5_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] bridge = new int[t][2];
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            bridge[i][0] = Integer.parseInt(st.nextToken()); // r
            bridge[i][1] = Integer.parseInt(st.nextToken()); // n
        }

        int[][] bridge_case = new int[30][30]; // nCr // i=n j=r
        for(int i=1; i<30;i++){
            for(int j=0;j<30;j++){
                if(j==0 || i==j){
                    bridge_case[i][j] = 1;
                }
            }
        }

        for(int i=1; i<30;i++){
            for(int j=1;j<30;j++){
                if(i>j){
                    bridge_case[i][j] =bridge_case[i-1][j-1] + bridge_case[i-1][j];
                }
            }
        }

        for(int[] b : bridge){
            System.out.println(bridge_case[b[1]][b[0]]);
        }

    }
}



//
//import java.util.Scanner;
//
//public class BOJ1010 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt(); // 테스트 케이스 수
//
//        // 결과를 저장할 배열
//        int[][] dp = new int[30][30];
//
//        // dp[n][m]을 미리 계산해놓기
//        for (int i = 0; i < 30; i++) {
//            dp[i][i] = 1; // nCn = 1
//            dp[i][0] = 1; // nC0 = 1
//        }
//
//        for (int i = 1; i < 30; i++) {
//            for (int j = 1; j <= i; j++) {
//                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
//            }
//        }
//
//        // 각 테스트 케이스에 대해 계산된 값 출력
//        for (int t = 0; t < T; t++) {
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            System.out.println(dp[m][n]);
//        }
//
//        sc.close();
//    }
//}
//
//
//

// 시간초과
//package week5_dp;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Baekjoon1010 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        for(int i=0;i<t;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int n = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            System.out.println(combi(m,n));
//        }
//    }
//
//    static int combi(int n, int r){
//        if(n==r || r==0){
//            return 1;
//        }else {
//            return combi(n-1, r-1) + combi(n-1, r);
//        }
//    }
//}