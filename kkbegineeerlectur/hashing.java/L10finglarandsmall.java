import java.util.HashMap;
public class L10finglarandsmall{

    public static void main(String[] args) {
        int[] arr={2,2,3,2,4,5,3,2,2,1,3};
        int k=8;
        // int[] ans=new int[2];
        int pre=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,-1);
        int lonest=0;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            pre +=arr[i];
            int require=pre-k;
            if(m.containsKey(require)){
                int value=m.get(require);
                lonest=Math.max(i-value,lonest);
                small=Math.min(i-value,small);
            }
            m.put(pre,m.getOrDefault(pre,0)+i);
        }
        if (lonest == -1) {
            System.out.println("-1 -1");
        } else {
            System.out.println("Longest = " + lonest);
            System.out.println("Shortest = " + small);
        }
        
    }
}