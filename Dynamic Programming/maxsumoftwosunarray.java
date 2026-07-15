public class maxsumoftwosunarray {
    public static void main(String[] args){
        int[] arr1={2,3,4,-8,2};
        int[] arr2={-5,8,3,1,-4};
        int n=arr1.length-1;
        int[] dp=new int[arr1.length];
        dp[0]=Math.max(arr1[0], arr2[0]);
        dp[1]=Math.max(dp[0] ,Math.max(arr1[1] ,arr2[1]))
        for(int i=2;i<arr1.length;i++){
            dp[i]=Math.max(dp[i-1] ,Math.max(arr1[i]+dp[i-2] ,arr2[i]+dp[i-2]));
        }
        System.out.println("DP Array:");
        for (int x : dp) {
            System.out.print(x + " ");
        }

        System.out.println("\nMaximum Sum = " + dp[n - 1]);
    }
}
