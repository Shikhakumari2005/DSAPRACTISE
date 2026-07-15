public class frog2 {
    public static void main(String[] args){
        int[] arr1={10,500,20,80};
        int n=arr1.length-1;
        int[] dp=new int[arr1.length];
        dp[0]=arr1[0];
        dp[1]=Math.abs(arr1[0]-arr1[1]);
        for(int i=2;i<arr1.length;i++){
            int j=0;
            int ans=Integer.MAX_VALUE;
            while(j<=n && i-j>=1){
                int option=dp[i-j] +Math.abs(arr1[i]- arr1[i-j]);
                ans=Math.min(option ,ans);
                j++;
            }
            dp[i]=ans;
        }
        System.out.println("DP Array:");
        for (int x : dp) {
            System.out.print(x + " ");
        }

        System.out.println("\nMininum cost = " + dp[n - 1]);
    }
}
