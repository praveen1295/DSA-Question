import java.util.Arrays;

public class Triplets_with_giver_sum {
    private static void TripletsIs(int[] arr, int target, int n) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    // Another Approach...............
    private static void Triplets(int[] arr, int target, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r) {
                if (x + arr[l] + arr[r] == target) {
                    System.out.println(x + " " + arr[l] + " " + arr[r]);
                    l++;
                    r--;
                } else if (x + arr[l] + arr[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -5, -6, 5, 3, 8, 9 };
        int k = -4;
        int n = arr.length;
        TripletsIs(arr, k, n);
        Triplets(arr, k, n);
    }

}
