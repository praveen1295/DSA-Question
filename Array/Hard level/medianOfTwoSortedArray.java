
/**
 * medianOfTwoSortedArray
 */
import java.util.Scanner;

public class medianOfTwoSortedArray {

    static double merge(int arr1[], int arr2[], int n, int m) {
        int l = n + m;
        int i = 0, j = 0;
        double arr[] = new double[l];
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        double ans = 0;
        if (l % 2 == 0) {
            ans = ((arr[l / 2] + arr[l / 2 - 1]) / 2);
        } else {
            ans = arr[l / 2];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 6, 6, 7 };
        int n = arr1.length;
        int m = arr2.length;
        System.out.print(merge(arr1, arr2, n, m));
    }
}