import java.util.*;

public class Main {

    static int n, m;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static void bfs(int startRow, int startCol,
                    int[][] grid, boolean[][] visited) {

        Queue<int[]> queue = new LinkedList<>();

        // 1. Put starting cell into queue
        queue.offer(new int[]{startRow, startCol});

        // 2. Mark visited immediately
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {

            // 3. Remove current cell
            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];

            System.out.println(
                "Visited: (" + row + ", " + col + ")"
            );

            // 4. Check all 4 neighbors
            for (int k = 0; k < 4; k++) {

                int newRow = row + dr[k];
                int newCol = col + dc[k];

                // 5. Boundary check
                if (newRow < 0 || newRow >= n ||
                    newCol < 0 || newCol >= m) {
                    continue;
                }

                // 6. Already visited?
                if (visited[newRow][newCol]) {
                    continue;
                }

                // 7. Obstacle?
                if (grid[newRow][newCol] == 0) {
                    continue;
                }

                // 8. Mark visited
                visited[newRow][newCol] = true;

                // 9. Add neighbor to queue
                queue.offer(new int[]{newRow, newCol});
            }
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

        bfs(0, 0, grid, visited);
    }
}
