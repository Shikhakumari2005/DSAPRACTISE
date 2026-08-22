import java.util.*;

public class Solution {

    static class Edge {
        int to;
        int cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static int maxCost(int n, ArrayList<ArrayList<Edge>> graph, int src, int dest) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);

        dp[src] = 0;

        // Assuming graph is a DAG
        for (int u = 0; u < n; u++) {

            if (dp[u] == Integer.MIN_VALUE)
                continue;

            for (Edge e : graph.get(u)) {
                dp[e.to] = Math.max(dp[e.to],
                                    dp[u] + e.cost);
            }
        }

        return dp[dest];
    }

    public static void main(String[] args) {

        int n = 4;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 5));
        graph.get(0).add(new Edge(2, 8));

        graph.get(1).add(new Edge(2, 3));
        graph.get(1).add(new Edge(3, 10));

        graph.get(2).add(new Edge(3, 7));

        int src = 0;
        int dest = 3;

        System.out.println(maxCost(n, graph, src, dest));
    }
}