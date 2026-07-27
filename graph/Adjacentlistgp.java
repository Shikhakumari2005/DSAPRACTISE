import java.util.Scanner;
import java.util.ArrayList;

public class Adjacentlistgp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        ArrayList<Integer>[] g=new ArrayList[n];
        for (int i = 1; i <= m; i++){
            g[i]=new ArrayList<>();
        }

        int[][] b=new int[1000][1000];
        for (int i = 1; i <= m; i++) {
            // Taking input for an undirected graph.
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            b[x][y] = 1;
            b[y][x] = 1;
        }
        for (int i = 0; i < n; i++) {
            int c = g[i].size();
            System.out.println(i + " " + c);
        }
    }

}
