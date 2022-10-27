import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Sale {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc=new Reader();
        // int t=sc.nextInt();
        int t =1;
        while(t-->0)
        {
            solve();
            
        }

    }
    
    private static void solve() {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
           arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        int j =0;
        for(int i=0; i<m; i++){
            if(j==n){
                break;
            }
            if(arr[i] < 0){
                sum += arr[i];
                j++;
            }
        }
        System.out.println(Math.abs(sum));
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
