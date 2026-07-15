public class amazonmloa {
    public static void main(String[] args){
        int[] arr1={12,13,14,18,2};
        int n=arr1.length-1;
        int[] dp=new int[arr1.length];
        dp[0]=arr1[0];
        dp[1]=Math.abs(arr1[0]-arr1[1]);
        for(int i=2;i<arr1.length;i++){
            dp[i]=Math.abs(arr1[i]-arr1[i-1]) +dp[i-1];
        }
        System.out.println("DP Array:");
        for (int x : dp) {
            System.out.print(x + " ");
        }

        System.out.println("\nMaximum Sum = " + dp[n - 1]);
    }
}
