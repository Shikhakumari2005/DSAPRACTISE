import java.util.Stack;
public class removeadjduplicate {
    public static String removeadjdublicate(String s){
        Stack<Character> st=new Stack<>();
        String result = "";
        // push all characters
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            //st.pop();
            else{
               st.push(ch);
            // }else if(!st.isEmpty() && st.peek()!=ch){
            //    st.push(ch);
            }
        }while(!st.isEmpty()) {
            result = result + st.pop();
        }return result;
    }
    public static void main(String[] args){
         String s="abbaca";
         System.out.println(removeadjdublicate(s));
    }
}
