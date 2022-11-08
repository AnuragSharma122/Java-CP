import java.util.*;
import java.lang.*;
import java.io.*;

public class B_T_primes {
    static PrintWriter out = new PrintWriter((System.out));
    static Reader sc;

    public static void main(String args[]) throws IOException {
        sc=new Reader();
        int t=1;
        sieve = new Boolean[1000001];
        while(t-->0)
        {
            solve();
        }

    }
    static Boolean[] sieve;
    static void func(){
        Arrays.fill(sieve, true);
        for(int i=2; i*i<=1000000; i++){
           if(sieve[i] == true){
            for(int j=i+i; j<= 1000000; j+=i){
               sieve[j] = false;
            }
           }
        }
    }
    private static void solve() {
        func();
        HashSet<Double> set = new HashSet<>();
        for(int i=2; i< sieve.length; i++){
           if(sieve[i] == true){
            set.add((double) i);
           }
        }
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
           Double temp = sc.nextDouble();

           if(set.contains(Math.sqrt(temp))){
            System.out.println("YES");
           }else{
            System.out.println("NO");
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
