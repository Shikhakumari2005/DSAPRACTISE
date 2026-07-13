public class max{
    public static void main(String[] args){
        int[] arr={2,-3,5,-8,7};
        int[] dp=new int[arr.length-1];
        dp[0]=arr[0];
       // dp[1]=
        for(int i=0;i<=arr.length-1;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2] +arr[i]);
        }
        System.out.println("Dp arr");
        for(int num: dp){
            System.out.println(dp);
        }
    }
}