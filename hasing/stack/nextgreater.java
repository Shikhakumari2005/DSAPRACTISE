
import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;

public class nextgreater {
    public static Vector<Integer> gratercloser(ArrayList<Integer> arr){
        Stack<Integer> s=new Stack<>();
       Vector<Integer> ans=new Vector<>();
        for(int i=arr.size()-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr.get(i)){
                s.pop();
            }
            if(s.isEmpty()){
                ans.add(arr.get(i));
            }else{
                ans.add(s.peek());
            }
            // if(s.peek()>arr.get(i)){
            //     s.push(arr.get(i));
            //     ans.add(s.peek());
            // }

            s.push(arr.get(i));
        }
        reverseVector(ans);
        return ans;
    }
    public static void reverseVector(Vector<Integer> ans){
        int left = 0;
        int right = ans.size() - 1;

        while(left < right){
            int temp = ans.get(left);
            ans.set(left, ans.get(right));
            ans.set(right, temp);

            left++;
            right--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(21);
        arr.add(7);
        arr.add(18);
        arr.add(3);
        arr.add(10);
        arr.add(20);
        System.out.println(gratercloser(arr));
        




    }
}
