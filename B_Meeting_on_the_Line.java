import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Meeting_on_the_Line {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc = new Reader();
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();

        }

    }

    private static void solve() {
        int n = sc.nextInt();
        double[] position = new double[n];
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextDouble();
        }
        double[] time = new double[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextDouble();
        }
        // find min by shifting left
        double minLeft = Double.MAX_VALUE;
        double maxRight = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            minLeft = Math.min(minLeft, position[i]-time[i]);
            maxRight = Math.max(maxRight,position[i]+time[i]);
        }
        double optPos = (minLeft+ maxRight)/2.0;
        System.out.println(optPos);
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
