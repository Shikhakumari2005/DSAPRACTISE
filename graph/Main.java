import java.util.*;
 
public class Main {
    static int n, m, components = 0, u = 0;
    static int[][] mat, comp;
    static boolean[][] vis;
    static int[] dx = {-1, 1, 0, 0}; // up, down
    static int[] dy = {0, 0, -1, 1}; // left, right
 
    public static void dfs(int x, int y) {
        vis[x][y] = true;
        u++;
        comp[x][y] = components;
 
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir], ny = y + dy[dir];
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && !vis[nx][ny] && mat[nx][ny] > 0) {
                dfs(nx, ny);
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
 
        mat = new int[n + 1][m + 1];
        comp = new int[n + 1][m + 1];
        vis = new boolean[n + 1][m + 1];
 
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                mat[i][j] = sc.nextInt();
 
        long[] b = new long[n + 1];
        long total = 0, d = 0, p = 0;
 
        // Count -1s
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                if (mat[i][j] == -1) d++;
 
        components = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                if (mat[i][j] > 0 && !vis[i][j]) {
                    components++; u = 0;
                    dfs(i, j);
                    b[components] = u;
                    total += u;
                }
 
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                if (mat[i][j] > 0) {
                    int y = comp[i][j];
                    p += (total - b[y]);
                    System.out.println(p);
                }
 
        p -= d;
        System.out.println(p);
    }
}
