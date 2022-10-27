import java.util.*;
import java.lang.*;
import java.io.*;

public class D_Coprime {
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
        int max = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int[] index = new int[1001];
        Arrays.fill(index,-1);
        for(int i=0; i<n; i++){
            index[arr[i]] = i;
        }
        long ans = 0;
        for(int i=0; i<1001; i++){
           for(int j=0; j<1001; j++){
              if(index[i]>=0 && index[j]>=0){
                if(__gcd(i, j) == 1){
                    ans = Math.max(ans, index[i]+index[j]+2);
                }
              }
           }
        }
        if(ans == 0){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
    
    static int __gcd(int a, int b) {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return __gcd(a - b, b);

        return __gcd(a, b - a);
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
