import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Planets {
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
        int c = sc.nextInt();
        int[] arr = new int[n];
        int[] planets = new int[101];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
           planets[arr[i]]++;
        }
        int ans = 0;
        for(int i=0; i<101; i++){
           if(planets[i] == 0){
            continue;
           }
           if(planets[i] == 1){
            ans++;
           }else{
            if(planets[i] < c){
                ans += planets[i];
            }else{
                ans+=c;
            }
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
