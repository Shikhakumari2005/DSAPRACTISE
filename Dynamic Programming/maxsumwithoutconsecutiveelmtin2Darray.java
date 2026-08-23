public class maxsumwithoutconsecutiveelmtin2Darray {

    public static int maxSum(int[] a, int[] b) {

        int n = a.length;

        int[] dp = new int[n];

        dp[0] = Math.max(a[0], b[0]);

        if (n > 1) {
            dp[1] = Math.max(
                dp[0],
                Math.max(a[1], b[1])
            );
        }

        for (int i = 2; i < n; i++) {

            dp[i] = Math.max(
                dp[i - 1],
                Math.max(
                    dp[i - 2] + a[i],
                    dp[i - 2] + b[i]
                )
            );
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 3, 21234};
        int[] b = {-4509, 200, 3, 40};

        System.out.println(maxSum(a, b));
    }
} 
