import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class childrennode {
   public static void main(String[] args) {
    //take input
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

    //create array of arralist  
        ArrayList<Integer>[] k=new ArrayList[n+1];
        for (int i = 0; i <=n; i++){
            k[i]=new  ArrayList<>();
        }
       
    //for undirction graph to get its adjacent list
        int i=1;
        while(i<n){
            int x=sc.nextInt();
            int y=sc.nextInt();
            k[x].add(y);
            k[y].add(x);
            i++;
        }
 
        Queue<Integer> q = new LinkedList<>();
        int[] used = new int[n + 1];
        used[1] = 1;
        q.offer(1);
 
        while (!q.isEmpty()) {
            int node = q.poll();
            int c = 0;
            for (int u : k[node]) {
                if (used[u] == 0) {
                    c++;
                    used[u] = 1;
                    q.offer(u);
                }
            }
 
            System.out.println(node + " " + c);
        }
    }
} 

