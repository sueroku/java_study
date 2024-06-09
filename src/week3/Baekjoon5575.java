package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String working = br.readLine();
        String a[] = working.split(" ");
        working = br.readLine();
        String b[] = working.split(" ");
        working = br.readLine();
        String c[] = working.split(" ");

        int aS = 0, aM=0, aH=0;
        int bS = 0, bM=0, bH=0;
        int cS = 0, cM=0, cH=0;

        if(Integer.parseInt(a[5]) < Integer.parseInt(a[2])){
            aS = Integer.parseInt(a[5])+60 - Integer.parseInt(a[2]);
            a[4] = Integer.toString(Integer.parseInt(a[4])-1);
        }else{
            aS = Integer.parseInt(a[5]) - Integer.parseInt(a[2]);
        }
        if(Integer.parseInt(a[4]) < Integer.parseInt(a[1])){
            aM = Integer.parseInt(a[4])+60 - Integer.parseInt(a[1]);
            a[3] = Integer.toString(Integer.parseInt(a[3])-1);
        }else{
            aM = Integer.parseInt(a[4]) - Integer.parseInt(a[1]);
        }
        aH = Integer.parseInt(a[3]) - Integer.parseInt(a[0]);

        if(Integer.parseInt(b[5]) < Integer.parseInt(b[2])){
            bS = Integer.parseInt(b[5])+60 - Integer.parseInt(b[2]);
            b[4] = Integer.toString(Integer.parseInt(b[4])-1);
        }else{
            bS = Integer.parseInt(b[5]) - Integer.parseInt(b[2]);
        }
        if(Integer.parseInt(b[4]) < Integer.parseInt(b[1])){
            bM = Integer.parseInt(b[4])+60 - Integer.parseInt(b[1]);
            b[3] = Integer.toString(Integer.parseInt(b[3])-1);
        }else{
            bM = Integer.parseInt(b[4]) - Integer.parseInt(b[1]);
        }
        bH = Integer.parseInt(b[3]) - Integer.parseInt(b[0]);


        if(Integer.parseInt(c[5]) < Integer.parseInt(c[2])){
            cS = Integer.parseInt(c[5])+60 - Integer.parseInt(c[2]);
            c[4] = Integer.toString(Integer.parseInt(c[4])-1);
        }else{
            cS = Integer.parseInt(c[5]) - Integer.parseInt(c[2]);
        }
        if(Integer.parseInt(c[4]) < Integer.parseInt(c[1])){
            cM = Integer.parseInt(c[4])+60 - Integer.parseInt(c[1]);
            c[3] = Integer.toString(Integer.parseInt(c[3])-1);
        }else{
            cM = Integer.parseInt(c[4]) - Integer.parseInt(c[1]);
        }
        cH = Integer.parseInt(c[3]) - Integer.parseInt(c[0]);

        System.out.println(aH + " " + aM + " " + aS);
        System.out.println(bH + " " + bM + " " + bS);
        System.out.println(cH + " " + cM + " " + cS);
    }
}
