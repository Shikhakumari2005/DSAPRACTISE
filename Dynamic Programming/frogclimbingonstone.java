public class frogclimbingonstone {
    public static void main(String[] args){
        int[] arr1={10,500,20,80};
        int n=arr1.length-1;
        int[] dp=new int[arr1.length];
        dp[0]=arr1[0];
        dp[1]=Math.abs(arr1[0]-arr1[1]);
        for(int i=2;i<arr1.length;i++){
            dp[i]=Math.min(Math.abs(arr1[i]-arr1[i-1]) +dp[i-1] , Math.abs(arr1[i-2]-arr1[i]) +dp[i-2]);
        }
        System.out.println("DP Array:");
        for (int x : dp) {
            System.out.print(x + " ");
        }

        System.out.println("\nMininum cost = " + dp[n - 1]);
    }
}
