import java.util.Scanner;

public class smallestproductofdigit{
    public static int smallestNumber(int n, int t) {

        while (true) {
            int product = digitProduct(n);

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }

    // Function to calculate product of digits
    public static int digitProduct(int num) {
        int product = 1;

        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int t = sc.nextInt();

        // Output
        System.out.println(smallestNumber(n, t));

        sc.close();
    }
}