import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Poisoned_Dagger {
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
        int n = sc.nextInt();
        long h = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for(int i=0; i<n; i++){
           list.add(sc.nextLong());
        }
        
        long i = 1;
        long j =(long) 1e18;
        while(i<=j){
            long mid = (i+j)/2;
            long sum = mid;
            for(int idx=0; idx<n-1; idx++){
               sum += Math.min(mid,list.get(idx+1)-list.get(idx));
            }
            if(sum<h){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        System.out.println(j+1);
        
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
