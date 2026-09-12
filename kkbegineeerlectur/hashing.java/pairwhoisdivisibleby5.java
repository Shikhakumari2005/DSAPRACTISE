import java.util.HashMap;
public class pairwhoisdivisibleby5{

    public static void main(String[] args) {
        int[] arr={3,6,8,2,9,7,12,64};
        int c=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int y=arr[i]%5;
            int r=5-y;
            r = r % 5;
            c += m.getOrDefault(r, 0);
 
            // Add current remainder for future indices
            int rem = arr[i] % 5;
            m.put(rem, m.getOrDefault(rem, 0) + 1);
            System.out.println(c);
        }
    }
}