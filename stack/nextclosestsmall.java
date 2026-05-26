
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class nextclosestsmall{
    public static ArrayList<Integer> smallerclosest(ArrayList<Integer> arr){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.size()-1 ;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr.get(i)){
                st.pop();
            }
            if(!st.isEmpty()){
                  //ans.set(i,ans.get(i));
                ans.add(st.peek());
            }else{
                ans.add(-1);
            }
            st.push(arr.get(i));
        }
        Collections.reverse(ans);  // important

        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(8);
        arr.add(5);
        arr.add(2);
        arr.add(23);
        System.out.println(smallerclosest(arr));

    }
}