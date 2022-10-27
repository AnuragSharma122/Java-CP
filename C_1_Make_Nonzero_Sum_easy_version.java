import java.util.*;
import java.lang.*;
import java.io.*;

public class C_1_Make_Nonzero_Sum_easy_version {
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
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(n%2 != 0){
            System.out.println(-1);
            return;
        }
        for(int i=0; i<n; i+=2){
            ArrayList<Integer> subList = new ArrayList<Integer>();
            ArrayList<Integer> subList2 = new ArrayList<Integer>();
            if(arr[i] == arr[i+1]){
                subList.add(i+1);
                subList.add(i+2);
                list.add(subList);
            }else{
                subList.add(i+1);
                subList.add(i+1);
                subList2.add(i+2);
                subList2.add(i+2);
                list.add(subList);
                list.add(subList2);
            }
        }
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
           System.out.println(list.get(i).get(0)+" "+list.get(i).get(1));
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
