import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Maximum_Substring {
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
        String s = sc.nextLine();
        long ones = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        long countOne = 0;
        long resultOne = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
                countOne = 0;
            else {
                countOne++;// increase count
                resultOne = Math.max(resultOne, countOne);
            }
        }

        long countZero = 0;
        long resultZero = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                countZero = 0;
            else {
                countZero++;
                resultZero = Math.max(resultZero, countZero);
            }
        }
        long max  = Math.max(resultOne, resultZero);
        long ans = Math.max(ones * (n - ones), max * max);
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
