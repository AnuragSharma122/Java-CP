import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Jumbo_Extra_Cheese_2 {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc=new Reader();
        int t=sc.nextInt();
        while(t-->0)
        {
            solve();
            
        }

    }
    
    private static void solve() {
        long n = sc.nextLong();
        long mini =0;
        long maxi = Integer.MIN_VALUE;
        while(n-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            mini += Math.min(a, b);
            maxi = Math.max(maxi, Math.max(a, b));
        }
        if(maxi == Integer.MIN_VALUE ){
            System.out.println(0);
        }else{
            long ans = 2*(mini+maxi);
            System.out.println(ans);
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
