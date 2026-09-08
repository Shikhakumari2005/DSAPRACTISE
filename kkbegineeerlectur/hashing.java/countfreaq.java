import java.util.HashMap;
import java.util.Map;

public class countfreaq {
    public static void main(String[] args){
        int[] arr={2,3,5,2,6,3,7,8,5,8,6,9,7,7,7};
        HashMap<Integer,Integer> fre=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            fre.put(arr[i],fre.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ans:fre.entrySet()){
            System.out.println(ans.getKey()+" key"+ans.getValue()+" values");
        }
    }
}
