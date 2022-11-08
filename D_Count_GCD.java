import java.util.*;
import java.lang.*;
import java.io.*;

public class D_Count_GCD {
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
        Long m = sc.nextLong();
        Long[] arr = new Long[n];
        int flag =0;
        for(int i=0; i<n; i++){
           arr[i] = sc.nextLong();
           if(i != 0){
            if(arr[i] > arr[i-1] && flag == 0){
                System.out.println(0);
                flag = 1;
            }
           }
        }
        if(flag == 1){
            return;
        }
        long min = arr[0];
        long count = 0;
        for(int i=1; i<n; i++){
           if(min%arr[i] != 0){
            System.out.println("NO");
            return;
           }else{
            if(arr[i] == 1){
                int k = 1;
                while(k<m){
                    if(k != min){
                        count++;
                        k = 
                    }
                }
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
