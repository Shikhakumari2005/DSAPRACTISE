public class Main {

    public static int balancedString(String s) {

        int n = s.length();
        int target = n / 4;

        int[] count = new int[4];

        for (char c : s.toCharArray()) {
            if (c == 'Q') count[0]++;
            else if (c == 'W') count[1]++;
            else if (c == 'E') count[2]++;
            else if (c == 'R') count[3]++;
        }

        if (count[0] == target &&
            count[1] == target &&
            count[2] == target &&
            count[3] == target) {
            return 0;
        }

        int left = 0;
        int ans = n;

        for (int right = 0; right < n; right++) {

            char c = s.charAt(right);

            if (c == 'Q') count[0]--;
            else if (c == 'W') count[1]--;
            else if (c == 'E') count[2]--;
            else if (c == 'R') count[3]--;

            while (count[0] <= target &&
                   count[1] <= target &&
                   count[2] <= target &&
                   count[3] <= target) {

                ans = Math.min(ans, right - left + 1);

                char leftChar = s.charAt(left);

                if (leftChar == 'Q') count[0]++;
                else if (leftChar == 'W') count[1]++;
                else if (leftChar == 'E') count[2]++;
                else if (leftChar == 'R') count[3]++;

                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "QQWE";

        int result = balancedString(s);

        System.out.println(result);
    }
}