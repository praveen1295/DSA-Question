import java.util.*;

public class removeDuplicates {
    public static int RemoveDup(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;
        int j = 0;
        // int temp[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n - 1];
        j++;

        return j;
    }

    // static void printArray(int arr[], int n){
    // for(int i=0; i<j; i++)
    // arr[i] = temp[i];

    // return j;
    // System.out.print(arr[i]+" ");
    // }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 2, 3, 3, 4, 4 };
        int n = arr.length;

        n = RemoveDup(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
