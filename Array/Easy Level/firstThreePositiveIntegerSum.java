public class firstThreePositiveIntegerSum {
    public static void main(String[] args) {
        int arr[] = { 12, 34, -20, 44, -10, 56, -2, 86, 12 };
        int n = arr.length;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && count < 3) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum);
    }
}
