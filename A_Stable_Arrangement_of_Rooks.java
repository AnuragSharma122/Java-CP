import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Stable_Arrangement_of_Rooks {
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
        int k = sc.nextInt();
        if(n%2 == 0){
            if(k>n/2){
                System.out.println(-1);
                return;
            }
        }else{
            if(k>(n+1)/2){
                System.out.println(-1);
                return;
            }
        }
        int count =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
               if((i+1)%2 == 0 && i==j && count<k){
                System.out.print("R");
                count++;
               }else{
                System.out.print(".");
               }
            }
            System.out.println();
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
