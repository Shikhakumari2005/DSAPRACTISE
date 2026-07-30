import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class shortestdistfromsourcehackerearth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>[] g=new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i]=new ArrayList<>();
            
        }
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            g[x].add(y);
            g[y].add(x);
        }
        int w=0;
        Queue<Integer> q=new LinkedList<>();
        boolean[] vist=new boolean[n];
        q.offer(w);
        vist[w]=true;
        int[] dist = new int[n];
    
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr);
            for(int child:g[curr]){
                if(vist[child]==false){
                    vist[child]=true;
                    dist[child] = dist[curr] + 1; 
                    q.offer(child);
            }
            System.out.println("Shortest distance from source:");

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Node " + i + " -> " + dist[i]);
        }
        } 
    }
}
