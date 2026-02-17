// import java.util.HashMap;

// class longsmallsubarr{
//     public static int subarr(int[] arr ,int targ){
//         HashMap<Integer,Integer>mp=new longsmallsubarr()<>;
//         int max=0;
//         int min=0;
//         for (int i = 0; i < arr.length; i++) {
//             int sum=0;
//             for(int j=i+1;j<arr.length;i++){
//                 sum +=arr[j];

//             }
//             if(sum==targ){
//                 if(max<sum){
//                     max=sum;
//                 }else{
//                     min=max;
//                 }

//             }
            
//         }
//         for(int i=0;i<arr.length;i++){
//                 if(mp.containsKey(sum)){
//                     mp.put(arr[i].1);
//                 }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={1,3,4,2,5,6,7,8};
//         int targ=6;
//         subarr(arr, targ)
        
//     }
// }
import java.util.*;

public class MaxMinSubarrayHashMap {

    // Result holder
    static class Result {
        int sum;
        int start;
        int end;

        Result(int sum, int start, int end) {
            this.sum = sum;
            this.start = start;
            this.end = end;
        }
    }

    // MAX subarray using prefix sum + hashmap
    public static Result maxSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefixSum = 0;
        int minPrefix = 0;
        int minIndex = -1;

        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int currSum = prefixSum - minPrefix;

            if (currSum > maxSum) {
                maxSum = currSum;
                start = minIndex + 1;
                end = i;
            }

            if (prefixSum < minPrefix) {
                minPrefix = prefixSum;
                minIndex = i;
            }
        }

        return new Result(maxSum, start, end);
    }

    // MIN subarray
    public static Result minSubarray(int[] arr) {
        int prefixSum = 0;
        int maxPrefix = 0;
        int maxIndex = -1;

        int minSum = Integer.MAX_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int currSum = prefixSum - maxPrefix;

            if (currSum < minSum) {
                minSum = currSum;
                start = maxIndex + 1;
                end = i;
            }

            if (prefixSum > maxPrefix) {
                maxPrefix = prefixSum;
                maxIndex = i;
            }
        }

        return new Result(minSum, start, end);
    }

    // helper to print subarray
    public static int[] getSubarray(int[] arr, int start, int end) {
        return Arrays.copyOfRange(arr, start, end + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};

        Result maxRes = maxSubarray(arr);
        Result minRes = minSubarray(arr);

        System.out.println("Max Sum = " + maxRes.sum);
        System.out.println("Max Subarray = " +
                Arrays.toString(getSubarray(arr, maxRes.start, maxRes.end)));

        System.out.println("Min Sum = " + minRes.sum);
        System.out.println("Min Subarray = " +
                Arrays.toString(getSubarray(arr, minRes.start, minRes.end)));
    }
}
