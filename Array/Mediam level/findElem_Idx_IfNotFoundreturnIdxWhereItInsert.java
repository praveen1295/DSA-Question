public class findElem_Idx_IfNotFoundreturnIdxWhereItInsert {
    public static int find(int arr[], int s, int e, int k) {
        // Time complexity O(logn)
        while (s <= e) {
            int mid = (s + e) / 2;
            if (k == arr[mid]) {
                return mid;

            } else if (k < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return e + 1;
    }

    // ...................................OR................................................

    // Time complexity O(n)
    public class find_element_If_not_available_insert_right_place {
        private static void find_if_not_insert(int arr[], int n, int k) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k) {
                    System.out.println(i);
                } else if (arr[i] < k && arr[i + 1] > k) {
                    System.out.println(i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6 };
        int n = arr.length;
        int k = 4;
        System.out.println(find(arr, 0, n - 1, k));
    }
}
