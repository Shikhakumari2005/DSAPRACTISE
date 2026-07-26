public class ReverseInteger {

    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check for overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;

            // Check for underflow
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));         // 321
        System.out.println(reverse(-123));        // -321
        System.out.println(reverse(120));         // 21
        System.out.println(reverse(1534236469));  // 0
    }
}