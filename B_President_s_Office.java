import java.util.*;
import java.lang.*;
import java.io.*;

public class B_President_s_Office {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc=new Reader();
        int t=1;
        while(t-->0)
        {
            solve();
            
        }

    }
    
    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        char c = sc.next().charAt(0);
        
        char[][] arr = new char[n][m];
        String s;
        for(int i=0; i<n; i++){
            s= sc.nextLine();
           for(int j=0; j<m; j++){
              arr[i][j] = s.charAt(j);
           }
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
            if(arr[i][j] == c){
                if (i > 0) {
                    set.add(arr[i - 1][j]);
                }
                if (i < n - 1) {
                    set.add(arr[i + 1][j]);
                }
                if (j > 0) {
                    set.add(arr[i][j - 1]);
                }
                if (j < m - 1) {
                    set.add(arr[i][j + 1]);
                }
            }
              
           }
        }
        set.remove(c);
        set.remove('.');
        System.out.println(set.size());
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
