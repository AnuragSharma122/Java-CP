import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Save_the_Magazines {
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
        String s = sc.nextLine();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i= n-1; i>=0;){
            if(s.charAt(i) == '1'){
                int min = arr[i];
                while(i>=0 ){
                    if(s.charAt(i) == '1'){
                        ans += arr[i];
                        min = Math.min(arr[i], min);
                        i--;
                    }else{
                        ans+=arr[i];
                        min = Math.min(arr[i],min);
                        i--;
                        ans = ans - min;
                        break;
                    }
                }
            }else{
                i--;
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
