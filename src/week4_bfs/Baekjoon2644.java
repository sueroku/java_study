package week4_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int person1 = Integer.parseInt(st.nextToken());
        int person2 = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        List<List<Integer>> grah = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            grah.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            grah.get(x).add(y);
            grah.get(y).add(x);
        }

        int kinship = bfs(n, person1, person2, grah);
        System.out.println(kinship);


    }

    public static int bfs(int n, int person1, int person2, List<List<Integer>> graph){
        boolean[] visited = new boolean[n+1];
        int[] relationship = new int[n+1];

        Queue<Integer> que = new LinkedList<>();
        que.add(person1);
        visited[person1] = true;

        while (!que.isEmpty()){
            int current = que.poll();
            if(current == person2){
                return relationship[current];
            }
            for(int a : graph.get(current)){
                if(!visited[a]){
                    visited[a] = true;
                    relationship[a] = relationship[current] +1;
                    que.add(a);
                }
            }
        }
        return -1;
    }
}
