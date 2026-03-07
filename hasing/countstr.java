import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCounter {

    // Count total characters (excluding spaces if needed)
    public static int countCharacters(String str, boolean excludeSpaces) {
        if (excludeSpaces) {
            str = str.replace(" ", "");
        }
        return str.length();
    }

    // Count total words
    public static int countWords(String str) {
        if (str.trim().isEmpty()) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }

    // Count occurrences of each character
    public static Map<Character, Integer> countCharOccurrences(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    // Count occurrences of a specific substring
    public static int countSubstring(String str, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Character count
        System.out.println("Total characters (with spaces): " + countCharacters(input, false));
        System.out.println("Total characters (without spaces): " + countCharacters(input, true));

        // Word count
        System.out.println("Total words: " + countWords(input));

        // Character occurrences
        System.out.println("Character occurrences: " + countCharOccurrences(input));

        // Substring count
        System.out.print("Enter substring to count: ");
        String sub = sc.nextLine();
        System.out.println("Occurrences of \"" + sub + "\": " + countSubstring(input, sub));

        sc.close();
    }
}
