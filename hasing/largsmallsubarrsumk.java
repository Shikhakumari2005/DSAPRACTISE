import java.util.ArrayList;
import java.util.List;
public class largsmallsubarrsumk {

    //brute force apporach 
    //time complexcity =O(n2);
    public static void largestsamllestsunarr(List<Integer> arr,int k){
        int maxlength=0;
        int minlength=arr.size();
        for(int i=0;i<arr.size();i++){
            int sum=0;
            for(int j=i+1;j<arr.size();j++){
                sum +=arr.get(j);
                if(sum==k && j-i+1>maxlength){
                    maxlength=j-i+1;
                }
                else if(sum==k && j-i+1<minlength){
                    minlength=j-i+1;
                }
            }
            // if(sum==k && j-i+1>maxlength){
            //     maxlength=j-i+1;
            // }
        }
        System.out.println(maxlength);
        System.out.println(minlength);
        

    }
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(-4);
        largestsamllestsunarr(arr,8);

    }
}
