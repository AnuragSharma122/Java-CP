import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Minimum_Notation {
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
        String s = sc.nextLine();
        int n = s.length();
        char[] c = s.toCharArray();
        if (n == 1) {
            System.out.println(s);
        } else {
            char min = c[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (c[i] > min && c[i] < '9') {
                    c[i]++;
                }
                min = (char) Math.min(min, c[i]);
            }
            Arrays.sort(c);
            for (int i = 0; i < n; i++) {
                System.out.print(c[i]);
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
