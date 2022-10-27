import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

public class Pythagorean_Pair {
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
        int n = sc.nextInt();
        for(int i=0; i*i<=n; i++){
           int s = n - (i*i);
           if((Math.sqrt(s) - Math.floor(Math.sqrt(s))) == 0){
            System.out.println(i+" "+ (int) Math.sqrt(n));
            return;
           }
        }
        if(Math.sqrt(n)*Math.sqrt(n) == n){
            System.out.println((int)Math.sqrt(n) + " " + 0);
        }else{
            System.out.println(-1);
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
