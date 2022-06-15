public class QuickSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int arr[], int left, int right) {
        int pivot = arr[left];
        int i = left, j = right;

        while (i < j) {
            while (i < right && arr[i] <= pivot) {
                i++;
            }
            while (j >= left && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, left, j);
        return j;
    }

    static int[] quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotIndex = Partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 7, 3, 2, 5, 4, 1 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        printArr(arr, n);
    }
}
