public class Minumsubstringpartit { 
    public static int MinPartitionSubStr(String s){
        int n=s.length();
        int[] dp=new int[n+5];
        String g="." +s;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            int[] frq=new int[26];
            int min=Integer.MAX_VALUE;
            for(int j=i;j>=1;j--){
                char ch=g.charAt(j);
                int val=(int) ch -97;
                frq[val]++;
                if(check(frq)){
                    min=Math.min(min,1+dp[j-1]);
                }
            }
            dp[i]=min;
        }
        return dp[n];
    }
    public static boolean check(int[] frq){
        int count=0;
        for(int i=0;i<frq.length;i++){
            if(frq[i]>=1){
                if(count==0){
                    count=frq[i];
                }
                else if(frq[i]!=count){
                        return false;
                }

            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="fabccddg";
      //  int res=MinPartitionSubStr(String s);
        System.out.println(MinPartitionSubStr( s));

    }
}
