public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] prefixSum = new int[n];

        // The first element of the prefix sum array is the same as the first element of the original array.
        prefixSum[0] = arr[0];

        // Iterate through the rest of the array to compute the cumulative sum.
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Print the prefix sum array
        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        // Output: Prefix Sum Array: 1 3 6 10 15 
    }
}
