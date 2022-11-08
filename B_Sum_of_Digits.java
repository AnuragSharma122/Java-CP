import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Sum_of_Digits {
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
        int A = 0, B = 0, C = 0;
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            if (s.charAt(1) == '>') {
                if (s.charAt(0) == 'A')
                    A++;
                if (s.charAt(0) == 'B')
                    B++;
                if (s.charAt(0) == 'C')
                    C++;
            } else {
                if (s.charAt(2) == 'A')
                    A++;
                if (s.charAt(2) == 'B')
                    B++;
                if (s.charAt(2) == 'C')
                    C++;
            }
        }
        if (A == 2 || B == 2 || C == 2) {
            if (A == 0)
                System.out.print("A");
            if (B == 0)
                System.out.print("B");
            if (C == 0)
                System.out.print("C");
            if (A == 1)
                System.out.print("A");
            if (B == 1)
                System.out.print("B");
            if (C == 1)
                System.out.print("C");
            if (A == 2)
                System.out.print("A");
            if (B == 2)
                System.out.print("B");
            if (C == 2)
                System.out.print("C");
        } else
            System.out.println("Impossible");
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
