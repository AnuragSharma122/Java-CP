import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Linear_Keyboard {
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
    
    private static void solve() {
        String l = sc.nextLine();
        String s = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<l.length(); i++){
            map.put(l.charAt(i),i+1);
        }
        int ans =0;
        int pos = map.get(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            int currPos = map.get(s.charAt(i));
            ans += Math.abs(pos-currPos);
            pos = currPos;
        }
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
