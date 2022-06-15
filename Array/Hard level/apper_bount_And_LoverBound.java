/**
 * apper_bount_And_LoverBound
 */
public class apper_bount_And_LoverBound {
    static int upperAndLoverBound(int arr[], int n, int k) {
        int ans = 0;
        int s = 0, e = n-1;
        int m =0;
        while (s <= e) {
             m = s + e / 2;
            if (k == arr[m]) {
                ans = arr[m];
                s = m+1;
            }else if (k > arr[m]) {
                s = m + 1;
            } else {
                e = m-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 8, 9, 12, 15 };
        int k = 9;
        int n = arr.length;
        int ans = upperAndLoverBound(arr, n, k);
        System.out.println(ans);
    }
}