import java.util.ArrayList;
import java.util.List;
class dfsgp{
    public static void main(String[] args){
        ArrayList<Integer>[] gp=new ArrayList[7];
        for(int i=0;i<7;i++){
            gp[i]=new ArrayList<>();
        }
        gp[1].add(2);
        gp[1].add(1);

        gp[1].add(3);
        gp[3].add(1);

        gp[1].add(4);
        gp[4].add(1);

        gp[3].add(5);
        gp[5].add(3);

        gp[2].add(6);
        gp[6].add(2);
        List<Integer> used = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            used.add(0);
            parent.add(0);
        }
        
        dfs(used,parent, gp, 1);
         
    }
    public static void dfs(List<Integer> used,List<Integer> parent, ArrayList<Integer>[] gp ,int node){
        System.out.println(node);
        used.set(1,node);
        for(int u :gp[node]){
            if(used.get(u)==0){
                used.set(u,1);
                dfs(used,parent, gp,u);
            }
        }
    }
}