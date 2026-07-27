public class goldensachforwardback {
    public static void main(String[] args){
        int[] arr1={12,-8,5,-3,2};
        int n=arr1.length-1;
        int[] dp=new int[arr1.length];
        dp[0]=arr1[0];
        dp[1]=dp[0];
        for(int i=2;i<arr1.length;i++){
            dp[i]=Math.min(dp[i-2]+ dp[i-3] ,dp[i-2]);
        }
        System.out.println("DP Array:");
        for (int x : dp) {
            System.out.print(x + " ");
        }

        System.out.println("\nMinimun cost = " + dp[n - 1]);
    }
}
