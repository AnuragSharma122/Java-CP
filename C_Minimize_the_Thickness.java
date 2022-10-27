import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Minimize_the_Thickness {
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
        long sum = 0;
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
           sum += arr[i];
           max = Math.max(max, arr[i]);
        }
        int ans = n;
        int sum = 0;
        for(int i=1; i<=n; i++){
           sum += arr[i-1];
           int maxLength = i;
           int CurrSum = 0;
           for(int j=i+1; j<n;){
            CurrSum += arr[j-1];
            if(CurrSum == sum){
                maxLength = Math.max(maxLength, j-i);
                j++;
                CurrSum = 0;
            }else if(CurrSum<sum){
                j++;
            }else{
                break;
            }
           }
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
