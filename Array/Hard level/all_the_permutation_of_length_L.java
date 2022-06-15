/**
 * all_the_permutation_of_length_L
 */
public class all_the_permutation_of_length_L {
    static void Permutation(Object arr[], int n, int k, int idx) {
        for (int i = 0; i < k; i++) {
            System.out.print(arr[idx % n]);
            idx /= n;
        }
        System.out.println();
    }

    static void Print(Object arr[], int k, int n) {
        for (int i = 0; i < (int) Math.pow(arr.length, k); i++) {
            Permutation(arr, n, k, i);
        }
    }

    public static void main(String[] args) {
        Object str[] = { "a", "b", "c" };
        int n = str.length;
        int k = 3;
        Print(str, k, n);
    }
}