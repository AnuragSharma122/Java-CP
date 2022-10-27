import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Kevin_and_Permutation {
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
        long n = sc.nextInt();
        if(n%2 == 0){
            for(int i=1; i<=n/2; i++){
               System.out.print((i+(n+1)/2+" "+i+" "));
            }
        }else{
            for(int i=1; i<=n/2; i++){
               System.out.print(i+" "+(i+(n+2)/2)+" ");
            }
            if (n % 2 != 0) {
                System.out.print((n + 1) / 2);
            }
        }
        System.out.println();
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