public class sumofelmtmaxwithoutconsecutive{
    public static void main(String[] args){
        int[] arr={2,4,6,7,8};
        int[] dp=new int[arr.length+1];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],dp[0]);
        for(int i=2;i<arr.length;i++){
            //dp[i-2] becoz it say no two consecutive elmt should selcted 
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        for(int ans:dp){
            System.out.println(ans);
        }

    }
}