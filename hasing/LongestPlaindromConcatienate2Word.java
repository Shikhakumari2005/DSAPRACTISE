import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> mp = new HashMap<>();

        // Update map with frequency
        for (String word : words) {
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }

        boolean centerUsed = false; // For odd-frequency symmetric strings placed in the middle
        int result = 0;

        // Start iterating on words one by one
        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();

            if (!rev.equals(word)) { // E.g., "ab" and "ba"
                if (mp.getOrDefault(word, 0) > 0 && mp.getOrDefault(rev, 0) > 0) {
                    mp.put(word, mp.get(word) - 1);
                    mp.put(rev, mp.get(rev) - 1);
                    result += 4;
                }
            } else { // E.g., "cc"
                if (mp.getOrDefault(word, 0) >= 2) {
                    mp.put(word, mp.get(word) - 2);
                    result += 4;
                } else if (mp.getOrDefault(word, 0) == 1 && !centerUsed) {
                    mp.put(word, mp.get(word) - 1);
                    result += 2;
                    centerUsed = true; // Center word has been used
                }
            }
        }

        return result;
    }
}
