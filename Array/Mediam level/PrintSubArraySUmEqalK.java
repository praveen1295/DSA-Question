public class PrintSubArraySUmEqalK {
    public static void main(String[] args) {
        int arr[] = { -1, -2, 5, 3, 6, -5, 5 };
        int k = 14;
        int n = arr.length;
        int curSum = 0;
        int count = 0;
        int s = 0;
        int e = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            curSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (curSum == k) {
                    // System.out.println("found between Index: " + i + " " + j);
                    count++;
                    s = i;
                    e = j;
                }
                if (curSum > k || j == n) {
                    break;
                }
                curSum += arr[j];
            }
        }
        if (count < 1) {
            System.out.println("Not fount!");
        }
        for (int i = s; i < e; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
