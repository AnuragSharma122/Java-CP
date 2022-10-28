import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Stripes {
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
    
    private static void solve() throws IOException {
        char[][] grid = new char[8][8];
        int[] blue = new int[8];
        int[] red = new int[8];
        for(int i=0; i<8; i++){
           for(int j=0; j<8; j++){
              grid[i][j] = sc.nextChar();
              if(grid[i][j] == 'B'){
                blue[j] = 1;
              }else if(grid[i][j] == 'R'){
                red[i] = 1;
              }
           }
           sc.nextLine();
        }
        int countBlue = 0;
        for(int i=0; i<8; i++){
           if(blue[i] == 0){
            continue;
           }
           int temp = 0;
           for(int j=0; j<8; j++){
            if(grid[j][i] == 'B'){
                temp++;
            }
           }
           countBlue = Math.max(temp, countBlue);
        }

        int countRed = 0;
        for (int i = 0; i < 8; i++) {
            if (red[i] == 0) {
                continue;
            }
            int temp = 0;
            for (int j = 0; j < 8; j++) {
                if (grid[i][j] == 'R') {
                    temp++;
                }
            }
            countRed = Math.max(temp, countRed);
        }
        if(countBlue > countRed){
            System.out.println("B");
        }else{
            System.out.println("R");
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

        public char nextChar() throws IOException{
            return (char) br.read();
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
