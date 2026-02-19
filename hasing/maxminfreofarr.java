import java.util.Arrays;

public class maxminfreofarr {
    public static int[] printmaxmin(int[] arr){
    //Brute force
          int maxelmt=0; 
          int minelmt=0;
          int maxfq=0;
          int minfrq=arr.length;

          for(int i=0;i<arr.length;i++){
                int c=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(maxfq<c){
                maxfq=c;
                maxelmt=arr[i];

            }
            if(minfrq>c){
                minfrq=c;
                minelmt=arr[i];

            }
          }
          return new int[] {maxelmt,minelmt, maxfq,minfrq};
    }
    public static void main(String[] args){
        int[] arr={2,3,3,2,4,3,5,2,6,3,3};
        int[] res=printmaxmin(arr);
        System.out.print(Arrays.toString(res));
    }
}
