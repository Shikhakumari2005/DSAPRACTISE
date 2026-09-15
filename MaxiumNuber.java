public class Main {

    public static int maxPalindromes(String s, int k) {
        int n = s.length();

        // palindrome[i][j] = true if s[i...j] is a palindrome
        boolean[][] palindrome = new boolean[n][n];

        // Build palindrome table
        for (int len = 1; len <= n; len++) {

            for (int i = 0; i + len - 1 < n; i++) {

                int j = i + len - 1;

                if (len == 1) {
                    palindrome[i][j] = true;
                }
                else if (len == 2) {
                    palindrome[i][j] = s.charAt(i) == s.charAt(j);
                }
                else {
                    palindrome[i][j] =
                            s.charAt(i) == s.charAt(j)
                            && palindrome[i + 1][j - 1];
                }
            }
        }

        // dp[i] = maximum number of palindromes
        // using first i characters
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            // Don't select any palindrome ending at i-1
            dp[i] = dp[i - 1];

            // Try substring s[j...i-1]
            for (int j = 0; j < i; j++) {

                int length = i - j;

                if (length >= k && palindrome[j][i - 1]) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        String s = "abaccdbbd";
        int k = 3;

        int answer = maxPalindromes(s, k);

        System.out.println("Maximum number of palindromes = " + answer);
    }
}
