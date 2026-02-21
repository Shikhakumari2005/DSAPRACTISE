import java.util.HashMap;

public class countsubarrsumk {
    public static int count(int[] arr,int tar){
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>mp=new HashMap();
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            if(mp.containsKey(sum-tar)){
                count +=mp.get(sum-tar);
            }
            mp.put(sum,mp.getOrDefault(sum, 0) + 1);
        }
        return count;
       
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,4,4,1};
        System.out.println(count(arr,8 ));

    }
}
