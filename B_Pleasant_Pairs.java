import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Pleasant_Pairs {
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
        Long[] arr = new Long[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextLong();
        }
        int count = 0;
        for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
              if(arr[i]*arr[j] == (i+1)+(j+1)){
                count++;
              }
           }
        }
        System.out.println(count);
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
