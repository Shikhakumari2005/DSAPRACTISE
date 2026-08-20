import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Walmart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        Map<Character, Integer> finalAns = new HashMap<>();
 
        char c = 'a';
        while (c <= 'z') {
            finalAns.put(c, Integer.MAX_VALUE);
            c++;
        }
 
        for (int i = 1; i <= n; i++) {
            String s = scanner.next();
            Map<Character, Integer> k = new HashMap<>();
 
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                k.put(ch, k.getOrDefault(ch, 0) + 1);
            }
 
            c = 'a';
            while (c <= 'z') {
                finalAns.put(c, Math.min(finalAns.get(c), k.getOrDefault(c, 0)));
                c++;
            }
        }
 
        c = 'a';
        int l = 0;
        while (c <= 'z') {
            l += finalAns.get(c);
            c++;
        }
 
        System.out.println(l);
    }
}