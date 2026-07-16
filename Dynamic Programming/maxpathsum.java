public class maxpathsum {
    public static void main(String[] args){
        int[] arr1={2,3,4,-8,2,6,-8,-9,100,-8};
        int n=arr1.length-1;
        int[] dp=new int[arr1.length];
        dp[0]=arr1[0];
        dp[1]=dp[0] +arr1[1];
        dp[1]=dp[1] +arr1[2];
        for(int i=2;i<arr1.length;i++){
            dp[i]=Math.max(dp[i-1] + arr1[i],arr1[i]+dp[i-3] );
            // dp[i]=Math.max(dp[i-1] + arr1[i],Math.max(arr1[i]+dp[i-3] ,arr1[i]+dp[i-5]));
        }
        System.out.println("DP Array:");
        for (int x : dp) {
            System.out.print(x + " ");
        }

        System.out.println("\nMaximum Sum = " + dp[n - 1]);
    }
}
