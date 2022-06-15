public class RortateAnArrayByRecursion {
    private static void Reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static int[] RotateRight(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
        // System.out.println(arr);
        return arr;
    }

    private static int[] RotateLeft(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, n - 1 - k);
        Reverse(arr, n - 1, n - 1);
        // System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 4;
        for (int i : RotateRight(arr, k)) {
            System.out.print(i + " ");
        }
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5 };
        for (int i : RotateLeft(arr1, k)) {
            System.out.print(i + " ");
        }

    }
}
