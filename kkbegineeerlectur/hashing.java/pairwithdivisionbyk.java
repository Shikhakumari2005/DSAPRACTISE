import java.util.HashMap;
public class pairwithdivisionbyk{

    public static void main(String[] args) {
        int[] arr={3,6,8,2,9,7,12,64};
        int k=5;
        int c=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int y=arr[i]%k;
            int r=k-y;
            r = r % k;
            c += m.getOrDefault(r, 0);
 
            // Add current remainder for future indices
            // int rem = arr[i] % k;
            m.put(y, m.getOrDefault(y, 0) + 1);
        }
        System.out.println(c);
    }
}