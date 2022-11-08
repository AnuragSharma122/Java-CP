import java.util.*;
import java.io.*;

public class C_King_s_Path {
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
        Long x0 = sc.nextLong();
        Long y0 = sc.nextLong();
        Long x1 = sc.nextLong();
        Long y1 = sc.nextLong();

        int n = sc.nextInt();
        Long[] r = new Long[n];
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for(int i=0; i<n; i++){
           r[i] = sc.nextLong();
           a[i] = sc.nextLong();
           b[i] = sc.nextLong();
        }
        Long size =(long) 10e9;
        
        int[][] grid = new int[][]

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
