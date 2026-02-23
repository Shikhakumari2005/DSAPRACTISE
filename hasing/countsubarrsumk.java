import java.util.HashMap;

public class countsubarrsumk {
    public static int count(int[] arr,int tar){
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>mp=new HashMap();
        
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            if(mp.containsKey(sum-tar)){

              //  This fetches how many times that required prefix sum has appeared before.
                count +=mp.get(sum-tar);
            }
             // update frequency of current prefix sum
            mp.put(sum,mp.getOrDefault(sum, 0) + 1);
            // mp.put(sum,1);

// ❗ This overwrites frequency every time.

// We must increase frequency, not reset to 1.
        }
        return count;
       
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,4,4,1};
        System.out.println(count(arr,8 ));

    }
}
