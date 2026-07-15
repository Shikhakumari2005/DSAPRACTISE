
// import java.util.Scanner;
// import java.util.ArrayList;

// class Node {
//     int data;
//     //CREAT ARRAY FOR SPACE OF # 3 CHILDREN REFERNCE
//     Node[] child;

//     Node(int data) {
//         this.data = data;
//         child = new Node[3]; // max 3 children
//     }
// }
// class TreeNode {
//     int data;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int data) {
//         this.data = data;
//     }
// }
// public class slectleaftomakebinarytre {
//     public static void makebinaytree(Node root){
//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer>[] adjlist=new ArrayList[9];
//         for(int i=1;i<9;i++){
//             adjlist[i]=new ArrayList<>();
//         }
//         int i=1;
//         while(i<9){
//             int x=sc.nextInt();
//             int y=sc.nextInt();
//             adjlist[x].add(y);
//             adjlist[y].add(x);
//             i++;
//         }
//         for(int i=2;i<=8;i++){
//             if(adjlist[i].size()==1){
//                 System.out.println(i);
//             }
//         }

//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.child[0] = new TreeNode(2);
//         root.child[1]= new TreeNode(3);
//         root.child[2]= new TreeNode(4);        
//         root.child[1].left== = new TreeNode(5);
//         root.child[1].right = new TreeNode(6);        
//         root.child[2].left = new TreeNode(7);
//         root.child[2].right = new TreeNode(8);  
//     }
// }

