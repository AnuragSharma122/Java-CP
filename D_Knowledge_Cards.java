import java.util.*;
import java.lang.*;
import java.io.*;

public class D_Knowledge_Cards {
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
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0; i<k; i++){
           arr[i] = sc.nextInt();
        }
        boolean ans = true;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int target = k;
        long spcace = m * n - 3;
        for (int i = 0; i < k; i++) {
            pq.offer(arr[i]);
            if (pq.size() > spcace) {
                ans = false;
                break;
            }
            while (pq.size() != 0 && pq.peek() == target) {
                pq.poll();
                target--;
            }
        }
        if(ans == true){
            System.out.println("YA");
        }else{
            System.out.println("TIDAK");
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
