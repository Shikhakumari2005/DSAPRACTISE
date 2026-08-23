
import java.util.Arrays;

class Amazonoa {
    public int rearrangeCharacters(String s, String t) {
        int[] frqs=new int[26];
        int[] frqt=new int[26];
        for(int i=0;i<s.length();i++){
            frqs[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            frqt[t.charAt(i)-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(frqt[i]>0){
                ans=Math.min(ans,frqs[i]/frqt[i]);
            }
        }
        return ans;
    }
    public static void main(String[] arg){
        String s="mononom";
        String t="mon";
        Amazonoa val=new Amazonoa();
        int result = val.rearrangeCharacters(s, t);

        System.out.println(result);
    }
}