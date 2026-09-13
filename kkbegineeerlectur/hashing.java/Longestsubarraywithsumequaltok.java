//gfg
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int prefix=0;
        int largest=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefix +=arr[i];
            int req=prefix-k;
            if(m.containsKey(req)){
                int first=m.get(req);
                int len=i-first;
                largest=Math.max(largest,len);
            }
            // Store FIRST occurrence only
            if (!m.containsKey(prefix)) {
                m.put(prefix, i);
            }
        }
        return largest;
        
    }
  public static void main(String[] args){
    int[] arr={2,3,5,1,7,9,-23,-43,80);
    int k=10;
    System.out.print(longestSubarray(arr,k));
  }
}
