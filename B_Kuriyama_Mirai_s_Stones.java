import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Kuriyama_Mirai_s_Stones {
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
        Long[] arr = new Long[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextLong();
        }
        int m = sc.nextInt();
        int[] type = new int[m];
        int[] l = new int[m];
        int[] r = new int[m];
        for(int i=0; i<m; i++){
           type[i] = sc.nextInt();
           l[i] = sc.nextInt();
           r[i] = sc.nextInt();
        }
        Long[] prefixSum = new Long[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++){
           prefixSum[i] = arr[i] + prefixSum[i-1];
        } 
        Arrays.sort(arr);
        Long[] prefixSum2 = new Long[n];
        prefixSum2[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum2[i] = arr[i] + prefixSum2[i - 1];
        }
        for(int i=0; i<m; i++){
           if(type[i] == 1){
            if(l[i] == 1){
                System.out.println((prefixSum[r[i] - 1]));
            }else{
                System.out.println((prefixSum[r[i] - 1] - prefixSum[l[i] - 2]));
            }
           }else{
               if (l[i] == 1) {
                   System.out.println((prefixSum2[r[i] - 1]));
               } else {
                   System.out.println((prefixSum2[r[i] - 1] - prefixSum2[l[i] - 2]));
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
