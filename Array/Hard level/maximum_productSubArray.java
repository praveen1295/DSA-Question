
public class maximum_productSubArray {
    private static int Subarray(int[] arr, int n) {
        int max = arr[0];
        int lo = 0;
        int hi = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int prod = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                prod *= arr[j];
                max = Math.max(max, prod);
                int currPro = prod;
                if (currPro == max) {
                    lo = i;
                    hi = j;
                }
            }
            max = Math.max(max, prod);
        }
        System.out.println(lo + " " + hi);
        for (int i = lo; i <= hi; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -6, -2, 5, 0, -5, -6, -6, 6, 4 };
        int n = arr.length;
        System.out.println(Subarray(arr, n));
    }

}
