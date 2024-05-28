package week1;

// 그리디

import java.util.Scanner;

public class baekjoon11047 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int coin [] = new int[n];
        for(int i=0;i<n;i++){
            coin[i] = sc.nextInt();
        }
        int result = 0;
        int rest = k;

        for(int i=n-1; i>=0 ; i--){
            if(rest > 0){
                result += (int)rest/coin[i];
                rest = (int)k%coin[i];
            }
            else{
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}