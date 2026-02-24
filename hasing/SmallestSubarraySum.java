
import java.util.Scanner;

public class SmallestSubarraySum {
    
    // Function to find the length of the smallest subarray
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right]; // Expand window

            // Shrink window while sum >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input target
            System.out.print("Enter target sum: ");
            int target = sc.nextInt();

            // Input array size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }

            // Input array elements
            int[] nums = new int[n];
            System.out.println("Enter " + n + " positive integers:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if (nums[i] <= 0) {
                    System.out.println("Only positive integers are allowed.");
                    return;
                }
            }

            // Find and display result
            int result = minSubArrayLen(target, nums);
            if (result == 0) {
                System.out.println("No subarray meets the target sum.");
            } else {
                System.out.println("Smallest subarray length: " + result);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}