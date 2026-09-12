import java.util.HashMap;
public class countsubarraywithsumequltok{

    public static void main(String[] args) {
        int[] arr={2,2,3,2,4,5,3,2,2,1,3};
        int k=8;
        int[] pre=new int[arr.length];
        pre[0]=arr[0];
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            int r=pre[i]-k;
            c +=m.getOrDefault(r,0);
            m.put(pre[i],m.getOrDefault(pre[i],0)+1);
        }
        System.out.print(c);
    }
}