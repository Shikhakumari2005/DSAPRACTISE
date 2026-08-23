public class google13{
    public static int MaxEarning(int[]a ,int[] b){
        int[] dpa=new int[a.length];
        int[] dpb=new int[b.length];
        dpa[0]=a[0];
        dpb[0]=b[0];
        dpa[1]=Math.max(a[1]+dpa[0],a[1]);
        dpb[1]=Math.max(b[1]+dpb[0],b[1]);
        int maxear=Integer.MAX_VALUE;
        for(int i=2;i<a.length;i++){
            dpa[i]=Math.max(a[i]+dpa[i-1],a[i]+dpb[i-2]);
            dpb[i]=Math.max(b[i]+dpb[i-1],b[i]+dpa[i-2]);
            maxear=Math.max(dpa[i],dpb[i]);
        }
        return maxear;
    }
    public static void main(String[] args){
        int[] a={23,4,5,101};
        int[] b={21,1,10,100};
        System.out.print(MaxEarning(a, b));
    }
}