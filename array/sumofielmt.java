public class sumofielmt {

        // public static void main(String[] args) {
    
        //     int[] arr = {1, 2, 3, 4, 5};
        //     int n = arr.length;
    
        //     int[] dp = new int[n];
    
        //     dp[0] = arr[0];
    
        //     for (int i = 1; i < n; i++) {
        //         dp[i] = dp[i - 1] + arr[i];
        //     }
    
        //     System.out.print("DP Array: ");
        //     for (int num : dp) {
        //         System.out.print(num + " ");
        //     }
        // }
    





//BRTUE FORCE
            public static void main(String[] args) {
        
                int[] arr = {1, 2, 3, 4, 5};
                int n = arr.length;
        
                // dp[i] stores the sum of elements from index 0 to i
                int[] dp = new int[n];
        
                // Brute Force
                for (int i = 0; i < n; i++) {
        
                    int sum = 0;
        
                    for (int j = 0; j <= i; j++) {
                        sum += arr[j];
                    }
        
                    dp[i] = sum;
                }
        
                // Print original array
                System.out.print("Array: ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
        
                System.out.println();
        
                // Print DP array
                System.out.print("DP Array: ");
                for (int num : dp) {
                    System.out.print(num + " ");
                }
        
                System.out.println();
            }
        
}
