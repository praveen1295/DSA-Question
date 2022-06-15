import java.util.HashMap;

class PairsSumEqualsK {
    static void pairsSumEqualsK_all(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int frequ = 0;
        System.out.println("Pairs Are: ");
        for (int i = 0; i < n; i++) {
            int rem = k - arr[i];
            if (map.containsKey(rem)) {
                frequ = map.get(rem);
                for (int j = 0; j < frequ; j++) {
                    System.out.print("[" + rem + ", " + arr[i] + "]  ");
                    count++;
                }
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }

        }
        System.out.println("\n");
        System.out.println("No. of pair is: " + count);
    }

    static void pairsSumEqualsK(int arr[], int n, int k) {
        int i;
        int j = 0;
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("found " + arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }
        if (count < 1)
            System.out.println("not found");
    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, -2, 3, 4, 5, 6, -7, 8, -9, 10, 2, 2, 3, 3, 3 };
        int k = 6;
        int n = arr.length;
        pairsSumEqualsK_all(arr, n, k);
    }
}
