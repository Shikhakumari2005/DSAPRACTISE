public class DpVaction{
    public static void main(String[] args){
        int[] book={10 ,20, 30 ,40};
        int[] swim={30 ,20, 40 ,60};
        int[] run={100 ,10, 80 ,40};

        int[] dpa=new int[book.length];
        int[] dpb=new int[book.length];
        int[] dpc=new int[book.length];
        dpa[0]=book[0];
        dpb[0]=swim[0];
        dpc[0]=run[0];
        int n=book.length;
        for(int i=1;i<book.length;i++){
            dpa[i]=book[i]+ Math.max(dpb[i-1] ,dpc[i-1]);
            dpb[i]=swim[i]+ Math.max(dpa[i-1] ,dpc[i-1]);
            dpc[i]=run[i]+ Math.max(dpb[i-1] ,dpa[i-1]);
        }
         // Print DP Arrays
        System.out.print("Book DP : ");
        for (int num : dpa)
            System.out.print(num + " ");
        
        System.out.println();
        
        System.out.print("Swim DP : ");
        for (int num : dpb)
            System.out.print(num + " ");
        
        System.out.println();
        
        System.out.print("Run DP  : ");
        for (int num : dpc)
            System.out.print(num + " ");
        
        System.out.println();
        
        int total = Math.max(dpa[n - 1],
                Math.max(dpb[n - 1], dpc[n - 1]));
        
        System.out.println("Maximum Happiness = " + total);
        
    }
}