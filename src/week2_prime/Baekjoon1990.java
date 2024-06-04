package week2_prime;

import java.util.Scanner;

public class Baekjoon1990 {
    public static boolean[] prime;	// 소수 체크
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        make_prime(b);
        String x;
        for(int i = a; i < prime.length; i++) {
            if(prime[i] == false) {	// 소수(false) 출력
                x = Integer.toString(i);
                if(x.length() == 1){
                    System.out.println(i);
                }else{
                    for(int j=0;j<=x.length()/2;j++){
                        if(x.charAt(j)!=x.charAt(x.length()-1-j)){
                            break;
                        }
                        if(j==x.length()/2){
                            System.out.println(i);
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }

    // n 이하 소수 생성
    public static void make_prime(int n) {

        prime = new boolean[n + 1];	// 0 ~ n

        //소수가 아닌 index = true
        //소수인 index = false

        // 2 미만의 n 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
        if(n < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {

            if(prime[i] == true) {
                continue;
            }

            // i 의 배수들을 걸러주기 위한 반복문
            // * 2 를 하지 않는 이유 : 이미 2의 배수는 다 빠진 상태
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
    }
}