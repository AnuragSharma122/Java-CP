import java.util.*;
import java.lang.*;
import java.io.*;

public class D_Divisibility_by_2_n {
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
        int[] arr = new int[n];
        int twosCount = 0;
        for(int i=0; i<n; i++){
           arr[i]  = sc.nextInt();
           while (arr[i] % 2 == 0) {
               twosCount++;
               arr[i] = arr[i] / 2;
           }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            int j = i;
            int z = 0;
            while(j%2 == 0){
                z++;
                j = j/2;
            }
            if(z>0){
                list.add(z);
            }
        }
        Collections.sort(list);
        int twoRequired = n-twosCount;
        int ans = 0;
        for(int i=list.size()-1; i>=0; i--){
           if(twoRequired <=0){
            break;
           }
           twoRequired -= list.get(i);
           ans++;
        }
        if(twoRequired <= 0){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
        
        
        
    }
    static int NumberOf2s(int n){
        int ans = 0;
        while(n%2 == 0){
            ans++;
            n = n/2;
        }
        return ans;
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
