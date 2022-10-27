import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Sum_of_Digits {
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
        int[] speed = new int[n];
        int[] ram = new int[n];
        int[] hdd = new int[n];
        int[] price = new int[n];
        for(int i=0; i<n; i++){
           speed[i] = sc.nextInt();
           ram[i] = sc.nextInt();
           hdd[i] = sc.nextInt();
           price[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               if (speed[i] < speed[j] && ram[i] < ram[j] && hdd[i] < hdd[j]) {
                price[i] = 1002;
               }
           }
        }
        int min = 1001;
        int index = 0;
        for(int i=0; i<n; i++){
            if (price[i] < min) {
                min = i;
                min = price[i];
                index = i+1;
            }
        }
        System.out.println(index);
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
