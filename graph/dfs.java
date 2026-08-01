import java.util.*;
public class dfs {

//RECURSIVE WAY
    
        static ArrayList<Integer>[] graph;
        static boolean[] visited;
    
        static void dfs(int node) {
    
            visited[node] = true;
            System.out.print(node + " ");
    
            for (int child : graph[node]) {
                if (!visited[child]) {
                    dfs(child);
                }
            }
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            int n = sc.nextInt();
            int m = sc.nextInt();
    
            graph = new ArrayList[n];
    
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }
    
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
    
                graph[u].add(v);
                graph[v].add(u); // Remove for directed graph
            }
    
            visited = new boolean[n];

            dfs(1);
        }
    
}




// import java.util.*;

// public class DFSStack {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         ArrayList<Integer>[] graph = new ArrayList[n];

//         for (int i = 0; i < n; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         for (int i = 0; i < m; i++) {

//             int u = sc.nextInt();
//             int v = sc.nextInt();

//             graph[u].add(v);
//             graph[v].add(u);
//         }

//         boolean[] visited = new boolean[n];

//         Stack<Integer> stack = new Stack<>();

//         stack.push(0);

//         while (!stack.isEmpty()) {

//             int node = stack.pop();

//             if (visited[node])
//                 continue;

//             visited[node] = true;
//             System.out.print(node + " ");

//             for (int child : graph[node]) {

//                 if (!visited[child]) {
//                     stack.push(child);
//                 }
//             }
//         }
//     }
// // }