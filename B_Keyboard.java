import java.util.*;

import javafx.util.Pair;

import java.lang.*;
import java.io.*;

public class B_Keyboard {
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
        int m = sc.nextInt();
        int x = sc.nextInt();
        int shiftCount = 0;
        HashMap<Character, List<Pair<Integer,Integer>>> map = new HashMap<>();
        ArrayList<Pair<Integer,Integer>> shiftList = new ArrayList<>();
        for(int i=0; i<n; i++){
           String s= sc.nextLine();
           for(int j=0; j<m; j++){
              char c = s.charAt(j);
              if(c == 'S'){
                  shiftList.add(new Pair<>(i,j));
              }else{
                map.putIfAbsent(c, new LinkedList<>());
                map.get(c).add(new Pair<Integer,Integer>(i, j));
              }
           }
        }
        int l = sc.nextInt();
        String s = sc.nextLine();
        for(int idx=0; idx<l; idx++){
           char c = s.charAt(idx);
           char c_lowercase = Character.toLowerCase(c);
           if(Character.isUpperCase(c)){
            if(shiftList.size() == 0){
                System.out.println(-1);
                return;
            }else if((map.containsKey(c_lowercase) == false)){
                continue;
            }else{
                //check if d < x
                
                int x1 = map.get(c_lowercase).get(0).getKey();
                int y1 = map.get(c_lowercase).get(0).getValue();
                int flag = 0;
                for(int i=0; i<shiftList.size(); i++){
                   int x2 = shiftList.get(i).getKey();
                   int y2 = shiftList.get(i).getValue();
                   if(x*x >= (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)){
                    flag = 1;
                    break;
                   }
                }
                if(flag == 0){
                    shiftCount++;
                }
            }
           }else{
            if(map.containsKey(c) == false){
                System.out.println(-1);
                return;
            }
           }
        }
        System.out.println(shiftCount);
    }

    static boolean checkPresent(char[][] grid, char c){
        for(int i=0; i<grid.length; i++){
           for(int j=0; j<grid[0].length; j++){
              if(grid[i][j] == c){
                return true;
              }
           }
        }
        return false;
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
