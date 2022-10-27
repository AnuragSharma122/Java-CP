import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Arrival_of_the_General {
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
        int t = sc.nextInt();
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for(int i=0; i<t;i++){
           for(int j=0; j<n-1;){
              if(c[j] =='B' && c[j+1] == 'G'){
                char temp = c[j];
                c[j] = c[j+1];
                c[j+1] = temp;
                j +=2;
              }else{
                j++;
              }
           }
        }
        s ="";
        for(int i=0; i<n; i++){
           s += c[i];
        }
        System.out.println(s);
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
