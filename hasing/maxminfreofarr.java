import java.sql.Time;
import java.util.Arrays;
import java.util.HashMap;

public class maxminfreofarr {
    //public static int[] printmaxmin(int[] arr){
    //Brute force
        //   int maxelmt=0; 
        //   int minelmt=0;
        //   int maxfq=0;
        //   int minfrq=arr.length;

        //   for(int i=0;i<arr.length;i++){
        //         int c=1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             c++;
        //         }
        //     }
        //     if(maxfq<c){
        //         maxfq=c;
        //         maxelmt=arr[i];

        //     }
        //     if(minfrq>c){
        //         minfrq=c;
        //         minelmt=arr[i];

        //     }
        //   }
        //   return new int[] {maxelmt,minelmt, maxfq,minfrq};















        //optimizes way

    public static int[] printmaxmin(int[] arr){
         // Step 1: Count frequency
            HashMap<Integer,Integer>mp=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                int num=arr[i];
                if(mp.containsKey(num)){
                    mp.put(num,mp.get(num)+1);
                }else{
                    mp.put(num, 1);
                }
            }
        // Step 2: Find max and min frequency
        int maxFreq = 0;
        int minFreq = arr.length;
        int maxEle = -1;
        int minEle = -1;

        for (int key : mp.keySet()) {
            int freq = mp.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxEle = key;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minEle = key;
            }
        }

        // return: [maxElement, minElement]
        return new int[]{maxEle, minEle};
    }

  
    public static void main(String[] args){
        int[] arr={2,3,3,2,4,3,5,2,6,3,3};
        int[] res=printmaxmin(arr);
        System.out.print(Arrays.toString(res));
    }
}
