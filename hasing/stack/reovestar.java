import java.util.Stack;
class reovestar {
    public  static String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch=='*'){
                st.pop();
            }else if(ch!='*'){
                st.push(ch);
            }
        }String res=""; 
        while(!st.isEmpty()){
            //res=res + st.pop();
             res = st.pop() + res; // reverse order
        }
    return res;
    }
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removeStars(s));
    }
}
