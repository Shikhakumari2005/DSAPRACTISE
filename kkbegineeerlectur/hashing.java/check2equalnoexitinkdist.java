
import java.util.HashMap;

public class check2equalnoexitinkdist {
    public static void main(String[] args) {
        int[] arr={3,4,2,6,7,6};
        int k=3;
        System.out.println(checkExistequalElmt(arr, k));
        
    }
    public static boolean checkExistequalElmt(int[] arr ,int k){
        HashMap<Integer,Integer> m=new  HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (m.containsKey(arr[i])) {

                int previousIndex = m.get(arr[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Store/update the latest index
            m.put(arr[i], i);
        }
        return false;
    }
}
