
public class MergeSort {
    public static int[] Devide(int[] arr, int s, int e) {
        if (s < e) {
            int m = s + (e - s) / 2;

            Devide(arr, s, m);
            Devide(arr, m + 1, e);
            merge_Sort(arr, s, m, e);
        }
        return arr;
    }

    public static void merge_Sort(int arr[], int s, int m, int e) {
        int n1 = m - s + 1;
        int n2 = e - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[s + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = s;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 7, 3, 2, 5, 4, 1 };
        int n = arr.length;
        Devide(arr, 0, n - 1);
        printArr(arr, n);
    }
}