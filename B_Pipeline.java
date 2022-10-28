import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Pipeline {
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
        long n = sc.nextLong();
        long k = sc.nextLong();

        long i = 2;
        long j = k;
        if (k * (k - 1) / 2 < n-1) {
            System.out.println(-1);
            return;
        }
        long ans = 0;
        while(i<=j){
            long mid = i +(j-i)/2;
            long sum = k*(k+1)/2 -1 - (mid*(mid+1)/2 - 1) - (j-mid);
            if(sum >= n){
                ans = mid;
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        System.out.println(ans);
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
