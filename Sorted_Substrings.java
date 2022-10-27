import java.util.*;
import java.lang.*;
import java.io.*;

public class Sorted_Substrings {
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
        int j = n-1;
        if(s.charAt(j) == '1'){
            while(j>=0){
                if(s.charAt(j) == '1'){
                    j--;
                }else{
                    break;
                }
            }
            while(j>=0){
                if(s.charAt(j) == '0') {
                    j--;
                } else {
                    break;
                }
            }
        }else{
            while (j >= 0) {
                if (s.charAt(j) == '0') {
                    j--;
                } else {
                    break;
                }
            }
        }
        int ans = 0;

        for(int i=0; i<=j;){
            ans++;
            if (s.charAt(i) == '1') {
                while (i<=j) {
                    if (s.charAt(i) == '1') {
                        i++;
                    } else {
                        break;
                    }
                }
            }else{
                while (i <= j) {
                    if (s.charAt(i) == '0') {
                        i++;
                    } else {
                        break;
                    }
                }
                while (i <= j) {
                    if (s.charAt(i) == '1') {
                        i++;
                    } else {
                        break;
                    }
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
