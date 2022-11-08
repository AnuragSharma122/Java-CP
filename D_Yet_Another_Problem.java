import java.util.*;
import java.lang.*;
import java.io.*;

public class D_Yet_Another_Problem {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc = new Reader();
        int t = 1;
        while (t-- > 0) {
            solve();

        }

    }

    private static void solve() {
        int n = sc.nextInt();
        int q = sc.nextInt();
        Long[] arr = new Long[n];
        Long[] prefixXor = new Long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (i != 0) {
                prefixXor[i] = prefixXor[i - 1] ^ arr[i];
            } else {
                prefixXor[0] = arr[i];
            }
        }
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int size = r[i] - l[i] + 1;
            long prefixSubarray = 0;
            if (l[i] == 1) {
                prefixSubarray = prefixXor[r[i] - 1];
            } else {
                prefixSubarray = prefixXor[r[i] - 1] ^ prefixXor[l[i] - 2];
            }
            if (prefixSubarray != 0) {
                System.out.println(-1);
            } else {
                if (size % 2 != 0 || arr[r[i]-1] == 0 || arr[l[i]-1] == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
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
