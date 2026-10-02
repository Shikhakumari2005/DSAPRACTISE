import java.util.*;

public class Main {

    static int n, m;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static void dfs(int row, int col, int[][] grid, boolean[][] visited) {

        // 1. Mark current cell visited
        visited[row][col] = true;

        System.out.println("Visited: (" + row + ", " + col + ")");

        // 2. Try all 4 neighbors
        for (int k = 0; k < 4; k++) {

            // Find neighbor
            int newRow = row + dr[k];
            int newCol = col + dc[k];

            // 3. Boundary check
            if (newRow < 0 || newRow >= n ||
                newCol < 0 || newCol >= m) {
                continue;
            }

            // 4. Already visited?
            if (visited[newRow][newCol]) {
                continue;
            }

            // 5. If it is an obstacle, don't move
            if (grid[newRow][newCol] == 0) {
                continue;
            }

            // 6. Move to neighbor
            dfs(newRow, newCol, grid, visited);
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 1, 1}
        };

        n = grid.length;
        m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        // Start DFS from (0,0)
        dfs(0, 0, grid, visited);
    }
}
