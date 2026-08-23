public class longestcommansubstringinall {
    public static  int Longestcomman(String a ,String b,String d){
        int[] f1=new int[26];
        int[] f2=new int[26];
        int[] f3=new int[26];
        for (char c : a.toCharArray()) {
            f1[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            f2[c - 'a']++;
        }
        for (char c : d.toCharArray()) {
            f3[c - 'a']++;
        }
        int c=0;
        for (int i=0; i<26;i++) {
            if(f1[i]>0 && f2[i]>0 && f3[i]>0){
                c++;
                System.out.print((char)(i+'a') + " ");
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String a="abcrfd";
        String b="abfrdcjk";
        String d="vdabmckl";
        System.out.print(Longestcomman(a,b,d));

    }
}
