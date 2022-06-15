public class find_element_in_sorted_rotated_array {

    private static int search(int[] arr, int k) {
        int n = arr.length;
        int pivotIndex = pivot(arr, 0, n - 1);
        if (pivotIndex == -1) {
            if (n == 2) {
                if (arr[0] > arr[1])
                    pivotIndex = 0;
                else
                    pivotIndex = 1;
            } else if (n > 2 && arr[0] > arr[1])
                pivotIndex = 0;
            else
                return binarySearch(arr, 0, n - 1, k);
        }
        if (arr[0] <= k) {
            return binarySearch(arr, 0, pivotIndex, k);
        } else {
            return binarySearch(arr, pivotIndex + 1, n - 1, k);
        }
    }

    private static int binarySearch(int[] arr, int left, int right, int k) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (k < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private static int pivot(int[] arr, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid != 0 && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[0] >= arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int minimumElement(int arr[], int n) {
        int pivotIndex = pivot(arr, 0, n - 1);
        if (pivotIndex == n - 1) {
            return arr[0];
        }
        return arr[pivotIndex + 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 4;
        int n = arr.length;
        System.out.println(search(arr, k));
        // System.out.println(minimumElement(arr, n));
    }

}
