public class BinarySearch {
    public static int binarySearch(int arr[], int n, int Data) {
        int L = 0, R = n - 1;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            if (Data == arr[mid]) {
                return mid;
            } else if (arr[mid] > Data) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 9, 10, 15 }; // Array sould be sorted; If array is not sorted we can't apply
                                            // binary search;
        int n = arr.length;
        int Data = 15;

        int ans = binarySearch(arr, n, Data);
        System.out.println(ans);

    }
}
