import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Array_Recovery {
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
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1; i<n; i++){
            int a = ans[i-1]+arr[i];
            int b = ans[i-1] - arr[i];
            if(b>=0 && a != b){
                System.out.println(-1);
                return;
            }
            a = Math.max(a, b);
            ans[i] = a;
        }
        for(int i=0; i<n; i++){
           System.out.print(ans[i]+" ");
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
