public class paypal5{
    public static void main(String[] args){
        String s="ababbacaabbbb";
        int k=1;
        int[] dp=new int[s.length()];
        dp[0]=1;
        for(int i=1;i<s.length();i++){
           if(Math.abs(s.charAt(i)-s.charAt(i-1))<=k){ 
                dp[i]=1+dp[i-1];
           }else{
            dp[i]=1;
           }
        }
        for(int largestlen:dp){
            System.out.println(largestlen);
        }

    }
}