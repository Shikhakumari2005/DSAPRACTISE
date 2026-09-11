import java.util.HashMap;

class AbsoluteSumEqualToTarget {
    public static void main(String[] args) {

        int[] arr = {10, 5, 1, 3, 1};
        int k = 2;

        int c = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int y = k - arr[i];      // arr[j] needed for sum = +k
            int x = -k - arr[i];     // arr[j] needed for sum = -k

            c += m.getOrDefault(y, 0);
            c += m.getOrDefault(x, 0);

            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(c);
    }
}