import java.util.*;
import java.lang.*;
import java.io.*;

public class Maximum_Size {
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
    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0; i<n; i++){
            String s1 = sc.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s1.charAt(j);
            }
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
            int val = 0;
              if(arr[i][j] == '1'){
                val = dfs(arr,i,j,n,m);
              }
              if(val > 0){
                  p.add(val);
              }
           }
        }
        int k = 0;
        int alice = 0;
        int bob = 0;
        while(p.size() != 0){
            if (k == 0) {
                alice += p.poll();
                k = 1;
            } else {
                bob += p.poll();
                k = 0;
            }
        }
        System.out.println(bob);
    }

    public static int dfs(char[][] arr, int i, int j, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m || arr[i][j] == '0'){
            return 0;
        }
        arr[i][j] = '0';
        int a = dfs(arr, i+1, j, n,m);
        int b = dfs(arr,i-1, j,n,m);
        int c = dfs(arr,i,j-1,n,m);
        int d = dfs(arr, i, j + 1, n, m);
        return a+b+c+d+1;
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
