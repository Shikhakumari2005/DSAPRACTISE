
import java.util.HashMap;

public class singlenum {
    public static int simglenumber(int[] nums){
         HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int frq=nums[i];
            if(mp.containsKey(nums[i])){
                mp.put(frq,mp.get(frq)+1);
            }else{
                mp.put(frq,1);
            }
        }
        for(int num:nums){
            if(mp.get(num)==1){
                return num;
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
       int[] nums={2,4,3,2,3};
       System.out.println(simglenumber(nums));         
    }
}