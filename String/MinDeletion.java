
import java.util.HashMap;

public class MinDeletion{
    public static int mindeltion(String s,String t){
        if(s.length()!=t.length()){
            return -1;
        }
        //count the  frq of both string it must be same  and chartcer also must same
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            
            m.put(ch1, m.getOrDefault(ch1, 0) + 1);
            m.put(ch2, m.getOrDefault(ch2, 0) - 1);
        }
        for (int count : m.values()) {
            if (count != 0){
                return -1;
            }
        }

        // Count operations
        int i = s.length() - 1;
        int j = t.length() - 1;
        int ans = 0;

        while (i >= 0) {
            if (t.charAt(i) == s.charAt(j)) {
                i--;
                j--;
            } else {
                ans++;
                i--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s1 = "GeeksForGeeks";
        String s2 = "ForGeeksGeeks";

        System.out.println(mindeltion(s, t));
    }
}