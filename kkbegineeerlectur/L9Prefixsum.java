public class L9Prefixsum{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int[] pre=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int a:pre){
            System.out.println(a);
        }
    }
}