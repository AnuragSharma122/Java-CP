import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Sort_the_Array {
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
        int flag = 0;
        for(int i=0; i<n; i++){
           arr[i] = sc.nextLong();
           if(i!=0 && arr[i] < arr[i-1]){
            flag = 1;
           }
        }
        if(flag == 0){
            System.out.println("yes");
            System.out.println(1+" "+1);
            return;
        }
        int left = 0;
        int right = n-1;
        for(int i=1; i<n-1; i++){
           if(arr[i] > arr[i-1] && arr[i]> arr[i+1]){
            left = i;
           }else if(arr[i] < arr[i-1] && arr[i]<arr[i+1]){
            right = i;
           }
        }
        // System.out.println("left "+left+" right "+ right);
        Long[] arr2 = new Long[right-left+1];
        for(int i=0; i< right - left + 1; i++){
           arr2[i] = arr[left+i];
        }
        Arrays.sort(arr2);
        for (int i = 0; i < right - left + 1; i++) {
            arr[left + i] = arr2[i];
        }
        for(int i=1; i<n; i++){
            // System.out.print(arr[i]+" ");
           if(arr[i]<arr[i-1]){
            System.out.println("no");
            return;
           }
        }
        System.out.println("yes");
        System.out.println((left+1) +" "+(right+1));

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
