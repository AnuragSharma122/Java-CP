import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Summer_sell {
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
        int f = sc.nextInt();
        Long[] l = new Long[n];
        Long[] k = new Long[n];
        long sum = 0;
        for(int i=0; i<n; i++){
           l[i] = sc.nextLong();
           k[i] = sc.nextLong();
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]!=b[0]?b[0]-a[0]: b[1]-a[1]);
        for(int i=0; i<n; i++){
            long a = Math.min(l[i],k[i]);
            long b = Math.min(2*l[i], k[i]);
            pq.add(new int[]{(int)(b-a),i});
        }
        
        for(int i=0; i<f; i++){
            int idx = pq.poll()[1];
            l[idx] = 2*l[idx];
        }
        for(int i=0; i<n; i++){
           sum += Math.min(l[i],k[i]);
        }
        System.out.println(sum);
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
