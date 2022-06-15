public class Separate_all_negative_and_positive_elements {
    private static void SeparatePositiveAndNegative(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4, 1, -2, -1, -3, -7, 5, 8 };
        int n = arr.length;
        SeparatePositiveAndNegative(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
