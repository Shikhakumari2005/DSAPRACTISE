import java.util.Scanner;

class climbingstairs{

    public int climbStairs(int n) {

        if (n <= 2)
            return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        System.out.println("Number of ways = " + obj.climbStairs(n));

        sc.close();
    }
}