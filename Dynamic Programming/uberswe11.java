// public class uberswe11{
//     public static void main(String[] args){
//         int n=10;
//         int[] dp=new int[n+1];
//         dp[1]=0;
//         for(int i=2;i<=n;i++){
//             dp[i]=dp[i-1]+1;
//             if(i%2==0){
//                 dp[i]=Math.min(dp[i],dp[i/2]+1);
//             }
//             if(i%3==0){
//                 dp[i]=Math.min(dp[i],dp[i/3]+1);
//             }
//         }
//         for(int ans:dp){
//             System.out.print(ans);
//         }
//     }
// }


class uberswe11 {
    public int countMinStepsToOne(int n) {
        
        int[] dp = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            
            // Step 1: subtract 1
            dp[i] = dp[i - 1] + 1;

            // Step 2: divide by 2
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // Step 3: divide by 3
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[n];
    }
}