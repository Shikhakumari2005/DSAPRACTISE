import java.util.*;
 
public class alls {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        List<Integer>[] G = new ArrayList[n + 5];
        for (int i = 0; i <= n; i++) {
            G[i] = new ArrayList<>();
        }
 
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            G[u].add(v);
            G[v].add(u);
        }
 
        Queue<Integer> q = new LinkedList<>();
        int source = sc.nextInt();
        q.offer(source);
 
        int[] used = new int[n + 5];
        Arrays.fill(used, 0);
        used[source] = 1;
 
        int[] lvl = new int[n + 5];
        Arrays.fill(lvl, 0);
        lvl[source] = 0;
 
        while (!q.isEmpty()) {
            int v = q.poll();
 
            for (int u : G[v]) {
                if (used[u] == 0) {
                    q.offer(u);
                    used[u] = 1;
                    lvl[u] = lvl[v] + 1;
                }
            }
        }
 
        for (int i = 1; i <= n; i++) {
            if (used[i] == 0) {
                System.out.println("You cannot visit the node " + i + " from the source node = " + source);
            } else {
                System.out.println("You can visit the node " + i + " from the source node = " + source);
            }
        }
    }
}