import javax.management.ValueExp;

public class MAxFrequency {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 1, 2, 3, 9, 9, 9, 9, 8, 7, 1, 1, 0 };
        int i, j;
        int count = 1;
        int value = Integer.MIN_VALUE;
        int n = arr.length;
        int maxFrec = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > maxFrec) {
                    maxFrec = count;
                    value = arr[i];
                }
            }
            count = 1;
        }
        System.out.println(value +" --> "+ maxFrec);
    }
}
