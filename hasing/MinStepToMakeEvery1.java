import java.util.TreeMap;
class Solution {
    public  static int reductionOperations(int[] nums) {
        TreeMap<Integer, Integer> m = new TreeMap<>();

        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int step=0;
        while(m.size()>1){
            int largest=m.lastKey();
            int largfrq=m.get(largest);
            int secondlar=m.lowerKey(largest);
            step +=largfrq;
            m.remove(largest);
            m.put(secondlar,m.get(secondlar)+largfrq);
        }
        return step;
    }
    public static void main(String[] args){
    	int[] nums={5,2,2,2,1,6};
    	System.out.print(reductionOperations(nums));
    }
}
