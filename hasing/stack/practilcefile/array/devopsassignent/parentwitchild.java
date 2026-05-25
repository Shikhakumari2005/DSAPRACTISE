import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class parentwithchild{
    public static void main(String[] args){
        Scanner scr=new  Scanner(System.in);
        int n=scr.nextInt();                 //Reads the number of nodes.
        ArrayList<Integer>[] k=new ArrayList[n+1]; 
               //create array of arraylist  and n+1 is used because nodes are numbered from 1


        //Creates an empty list for every node.
        for (int i = 0; i <=n; i++) {
            k[i]=new ArrayList<>();
        }
        int i=1;
        while(i<n){
            int x=scr.nextInt();
            int y=scr.nextInt();
            k[x].add(y);
            k[y].add(x);          //Add y to x's neighbor list.  Because the graph is undirected.
            i++;
        }

        //bfs intialization
        Queue<Integer>q=new LinkedList<>();
        int[] use=new int[n+1];
        use[1]=1;
        q.offer(1);

        while(!q.isEmpty()){
            int node =q.poll();
            int c=0;               //Counts unvisited children of current node.
            for(int u :k[node]){
                if(use[u]==0){
                    c++;
                    use[u]=1;
                    q.offer(u);
                }
            }
            System.out.println(node + " " + c);
        }        
    }
}