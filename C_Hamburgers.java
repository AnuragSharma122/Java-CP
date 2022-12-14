import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Hamburgers {
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
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
           a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
           b[i] = sc.nextInt();
        }
        long ans = 0;
        while(true){
            for(int i=0; i<n; i++){
               if(b[i]>=a[i]){
                b[i] -= a[i];
               }else{
                k = k - (a[i]-b[i]);
                b[i] = 0;
               }
            }
            if (k >= 0) {
                ans++;  
            }else{
                break;
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
