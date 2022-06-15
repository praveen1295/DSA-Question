public class firstNLastOccurrenceBinarySearch {
    public static void BinarySearch(int arr[], int n, int k) {
        int L = 0;
        int R = n - 1;
        int firstOcc = -1;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (k == arr[mid]) {
                firstOcc = mid;
                R = mid - 1;
            }

            else if (k < arr[mid]) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }

        }

        L = 0;
        R = n - 1;
        int LastOcc = -1;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (k == arr[mid]) {
                LastOcc = mid;
                L = mid + 1;
            }

            else if (k < arr[mid]) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }

        }
        System.out.println(firstOcc + " " + LastOcc+"\n"+ (LastOcc-firstOcc+1));
        for (int i = firstOcc; i < LastOcc+1; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 12, 15, 15, 15, 15, 15, 15, 19, 20, 25 };
        int n = arr.length;
        int k = 15;
        BinarySearch(arr, n, k);

    }

}
