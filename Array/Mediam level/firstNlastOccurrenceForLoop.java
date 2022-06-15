public class firstNlastOccurrenceForLoop {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 12, 15, 15, 15, 15, 15, 15, 19, 20, 25 };
        int n = arr.length;
        int k = 15;
        int idx2 = -1;
        int idx1 = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k && idx1 == -1) {
                idx1 = i;
                idx2 = i;
            } else if (arr[i] == k && idx1 != -1) {
                idx2 = i;
            }
        }
        System.out.print(idx1 + " " + idx2);

    }

}
