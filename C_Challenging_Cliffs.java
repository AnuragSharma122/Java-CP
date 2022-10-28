import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Challenging_Cliffs {
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
        // int[] arr = new int[n];
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(n==2){
            for(int i=0; i<n; i++){
               System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        int mk = 0;
        int min = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
           if(min>arr[i]-arr[i-1]){
            mk = i;
            min = arr[i]-arr[i-1];
           }
           if(min == 0){
            break;
           }
        }
        for(int i=mk; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<mk; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
