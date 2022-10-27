import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Traffic_Light {
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
        String c3 = sc.nextChar();
        String s = sc.nextLine();
        char c = c3.charAt(0);
        int ans = 0;
        int[] arr = new int[n];
        if(s.charAt(n-1) == 'g'){
            arr[n-1] = n-1;
        }else{
            arr[n-1] = -1;
        }
        for(int i=n-2; i>=0; i--){
           if(s.charAt(i) == 'g'){
            arr[i] = i;
           }else{
            arr[i] = arr[i+1];
           }
        }
        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                if(arr[i] != -1){
                    ans = Math.max(ans, arr[i] - i);
                }else{
                    ans = Math.max(ans, n-1-i+1+arr[0]);
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
        public String nextChar(){
            return next();
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
