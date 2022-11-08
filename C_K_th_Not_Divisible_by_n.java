import java.util.*;
import java.lang.*;
import java.io.*;

public class C_K_th_Not_Divisible_by_n {
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
        Long n = sc.nextLong();
        Long k = sc.nextLong();

        long low = 1;
        long high = Long.MAX_VALUE;
        while (low <= high) {
            long mid = (high + low) / 2;
            if ((mid - mid / n) == k) {
                System.out.println(mid);
                return;
            } else if (mid - mid / n < k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println(high);
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
