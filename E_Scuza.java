import java.util.*;
import java.lang.*;
import java.io.*;
import  javafx.util.Pair;

public class E_Scuza {
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
        int q = sc.nextInt();
        int[] arr = new int[n];
        int[] k = new int[q];
        
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
        for(int i=0; i<q; i++){
            k[i] = sc.nextInt();
            list.add(new Pair<>(k[i],i));
        }
        Collections.sort(list,new Comparator<Pair<Integer,Integer>>(){
            @Override
            public int compare(Pair<Integer,Integer> p1 , Pair<Integer,Integer> p2) {
                return p1.getKey().compareTo(p2.getKey());
            }
        });
        long[] ans = new long[q];
        int j =0;
        long s =0;
        for(int i=0; i<q; i++){
            while(j<n){
                if(arr[j] <= list.get(i).getKey()){
                    s += arr[j];
                    j++;
                }else{
                    break;
                }
            }
            ans[list.get(i).getValue()] = s;
        }
        for(int i=0; i<q; i++){
           System.out.print(ans[i]+" ");
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
