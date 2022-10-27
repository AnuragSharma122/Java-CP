import java.util.*;
import java.lang.*;
import java.io.*;

public class D_Factorial_Divisibility {
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
        int x = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max,arr[i]);
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int c = 0;
        int i = 0;
        for(Map.Entry m : map.entrySet()){
            i++;
            int val = (int) m.getValue();
            int key = (int) m.getKey();
            if(c>0){
                if(c%key == 0){
                    val += c/key;
                }else{
                    System.out.println("No");
                    return;
                }
            }
           if(val>key){
            c = val;
           }else{
                System.out.println("No");
                return;
            }
            
           }
        }
        System.out.println("Yes");
        
    }
    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
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
