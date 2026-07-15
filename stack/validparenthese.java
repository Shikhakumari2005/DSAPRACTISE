

import java.util.Stack;

public class validparenthese {
    public static Stack<Character> validpara(String str){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
            else{
                if (st.isEmpty()) {
                    return st; // or false
                }
                st.peek();
                if(st.peek()=='(' && ch==')' || st.peek()=='[' && ch==']' || st.peek()=='{' && ch=='}'){
                    st.pop();
                }
                else{
                   System.out.println("invalid" + ch);
                }
            }
            
        }
        return st;
    }
    public static void main(String[] args) {
        String str="{[({[})]}";
        System.out.println(validpara(str));
    }
}
