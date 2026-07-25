public class integersubdiv123 {
    public static int[] MinumstepNto1(int N){
        
        int[] dp=new int[N +1];
        dp[1]=0;
        for(int i=2; i<=N;i++){
            dp[i]=dp[i-1] +1;
            if(i%2==0){
                dp[i]=Math.min(dp[i], dp[i/2] +1);
            }
            if(i%3==0){
                dp[i]=Math.min(dp[i], dp[i/3] +1);
            }
        }return dp;
    }
    public static void main(String[] args){
        int N=10;
        int[] ans=MinumstepNto1(N);
        for(int val:ans){
            System.out.print(val);
        }
        System.out.println("\nMinimum steps for " + N + " = " + ans[N]);
    
    }
}
