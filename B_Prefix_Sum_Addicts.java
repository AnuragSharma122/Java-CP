import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Prefix_Sum_Addicts {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc = new Reader();
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();

        }

    }

    private static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] s = new int[k];
        for(int i=0; i<k; i++){
           s[i] = sc.nextInt();
        }
        if(k == 1){
            System.out.println("Yes");
        }
        int[] a = new int[k];
        for(int i=k-1; i>0; i--){
            a[i] = s[i]-s[i-1];
        }
        if(n == k){
            a[0] = s[0];
        }else{
            a[0] = Integer.MIN_VALUE;
        }
        for(int i=1; i<k;i++ ){
            if(a[i] < a[i-1]){
                System.out.println("No");
                return;
            }
        }
        if (s[n - k + 1] > a[n - k + 2] * (n - k + 1))
        {
            return;
        }
        System.out.println("Yes");

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
