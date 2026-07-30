import java.util.*;

public class BFSGraph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of vertices and edges
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create adjacency list
        ArrayList<Integer>[] gp = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            gp[i] = new ArrayList<>();
        }

        // Input edges
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            gp[x].add(y);
            gp[y].add(x);     // Remove this line for directed graph
        }

        int root = 0;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(root);
        visited[root] = true;

        while (!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for (int child : gp[node]) {

                if (!visited[child]) {
                    visited[child] = true;
                    q.offer(child);
                }
            }
        }
    }
}