public class IBMoa{
    public static void ALexchris(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='0' ||s.charAt(i)=='u' ){
                c++;
            }
        }
        if(c >= 1){
            System.out.println("Alex Will Win");
        }
        else{
            System.out.println("Chris will Win");
        }
    }
    public static void main(String[] args) {
        String s="aabcdefaa";
        ALexchris(s);
    }
}