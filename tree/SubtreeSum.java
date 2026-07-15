// class Node{
//     int val;
//     Node left;
//     Node right;

//     Node  (int val){
//         this.val=val;
//     }
// }
// class somofnode{
//     public static  int sumNode(Node root){
//        if(root==null){
//          return 0;
//        }
//        int suml=sumNode(root.left);
//        int sumr=sumNode(root.right);

//        return root.val + suml +sumr;

//     }
//     public static void main(String[] args) {
//         Node root =new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         System.out.println(sumNode(root));
//     }
// }


import java.util.*;

public class SubtreeSum {

    static ArrayList<Integer>[] tree;
    static int[] value;
    static int[] sum;

    static void dfs(int node, int parent) {

        sum[node] = value[node];

        for (int child : tree[node]) {

            if (child != parent) {

                dfs(child, node);

                sum[node] += sum[child];
            }
        }
    }

    public static void main(String[] args) {

        int n = 5;

        tree = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        // Edges
        tree[1].add(2);
        tree[2].add(1);

        tree[1].add(3);
        tree[3].add(1);

        tree[2].add(4);
        tree[4].add(2);

        tree[2].add(5);
        tree[5].add(2);

        value = new int[n + 1];

        value[1] = 10;
        value[2] = 20;
        value[3] = 30;
        value[4] = 40;
        value[5] = 50;

        sum = new int[n + 1];

        dfs(1, -1);

        for (int i = 1; i <= n; i++) {
            System.out.println("Subtree Sum of Node " + i + " = " + sum[i]);
        }
    }
}