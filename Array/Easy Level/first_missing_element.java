import java.util.HashSet;
import java.util.*;

public class first_missing_element {
    public static void main(String[] args) {
        int arr[] = { -1 - 5, 1, 2, 8, 6, 5, 5 };
        int n = arr.length;
        int i = 0;
        // HashSet<Integer> set = new HashSet<>();
        while (i < n) {
            if (arr[i] > 0 && arr[i] < n) {
                int p = arr[i] - 1;
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;

                if (i == arr[i]) {
                    i++;
                }
            }
        }
        for (int j : arr) {
            System.out.print(arr[j] + " ");
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i);
            }
            // break;
        }
        if (i == n) {
            System.out.println(n + 1);
        }

    }
}
