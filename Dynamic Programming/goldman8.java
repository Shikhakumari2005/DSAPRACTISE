import java.util.*;

public class goldman8 {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 8, 10};
        int n = arr.length;

        int[] even = new int[n];
        int[] odd = new int[n];

        // Base case for index 0
        if (arr[0] % 2 == 0) {
            even[0] = 1;
            odd[0] = 0;
        } else {
            even[0] = 0;
            odd[0] = 1;
        }

        // Base case for index 1
        if (arr[1] % 2 == 0) {
            even[1] = even[0];
            odd[1] = odd[0];
        } else {
            even[1] = odd[0];
            odd[1] = even[0];
        }

        // DP
        for (int i = 2; i < n; i++) {

            if (arr[i] % 2 == 0) {

                // Even value: parity remains same
                even[i] = even[i - 1] + even[i - 2];
                odd[i] = odd[i - 1] + odd[i - 2];

            } else {

                // Odd value: parity flips
                even[i] = odd[i - 1] + odd[i - 2];
                odd[i] = even[i - 1] + even[i - 2];
            }
        }

        System.out.println("Even DP:");
        System.out.println(Arrays.toString(even));

        System.out.println("Odd DP:");
        System.out.println(Arrays.toString(odd));

        System.out.println("Even journeys = " + even[n - 1]);
        System.out.println("Odd journeys = " + odd[n - 1]);
    }
} 