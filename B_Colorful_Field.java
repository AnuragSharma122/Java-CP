import java.util.*;

import javafx.util.Pair;

import java.lang.*;
import java.io.*;

public class B_Colorful_Field {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc=new Reader();
        int t=1;
        while(t-->0)
        {
            solve();
            
        }

    }
    
    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        Long[] arr = new Long[k];
        for(int i=0; i<k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] =(long) m*(x-1) +(y-1);
        }
        Arrays.sort(arr);
        for(int i=0; i<t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            long idx = (long) m * (x - 1) + (y - 1);
            int j = 0;
            for(j=0; j<k; j++){
               if(arr[j]<idx){
                continue;
               }
               else{
                break;
               }
            }
            if (j < k && arr[j] == idx) {
                System.out.println("Waste");
            }else{
                long crop = idx - j;
                if(crop%3 == 0){
                    System.out.println("Carrots");
                }else if(crop % 3 == 1){
                    System.out.println("Kiwis");
                }else{
                    System.out.println("Grapes");
                }
            }
        }
    }

    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = br.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            st = new StringTokenizer(next);
            return true;
        }
    }
}
