import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Complementary_XOR {
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
        long n = sc.nextLong();
        String a = sc.nextLine();
        String b = sc.nextLine();
        String xor = "";
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                xor = xor + "0";
            } else {
                xor = xor + "1";
            }
        }
        for (int i = 1; i < n; i++) {
            if (xor.charAt(i) != xor.charAt(i - 1)) {
                System.out.println("NO");
                return;
            }
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
