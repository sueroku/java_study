package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] arrSum = new int[n+1];
        arrSum[1] = arr[1];
        for(int i=2;i<n+1;i++){
            arrSum[i] = arrSum[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arrSum));

        List<List<Integer>> section = new ArrayList<>();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            section.add(new ArrayList<>());
            section.get(i).add(Integer.parseInt(st.nextToken()));
            section.get(i).add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0 ;i<m;i++){
            int sum = arrSum[section.get(i).get(1)] - arrSum[section.get(i).get(0)-1];
            System.out.println(sum);
        }


//        int sum = 0;
//        for(int i=0;i<m;i++){
//            for(int j =section.get(i).get(0) ; j<=section.get(i).get(section.get(i).size()-1);j++){
//                sum+=arr[j];
//            }
//            System.out.println(sum);
//            sum=0;
//        }



    }
}
