import java.util.HashMap;

class SumModuloDiviby5 {
    public static void main(String[] args) {

        int[] arr = {10, 5, 1, 3, 1};

        int c = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int ans=arr[i]%5;
            c += m.getOrDefault(ans, 0);
           // c += m.getOrDefault(x, 0);

            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(c);
    }
}