
import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!m.containsKey(ch)) {
                m.put(ch, 1);
            } else {
                m.put(ch, m.get(ch) + 1);
            }
        }

        boolean equal = true;
        int first = -1;

        for (int val : m.values()) {
            if (first == -1) {
                first = val;
            } else if (val != first) {
                equal = false;
                break;
            }
        }

        return equal;
    }
}
