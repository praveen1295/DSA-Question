public class Find3rdLargestAnaSmallElement {
    public static void print3LargeEle(int arr[], int n) {
        int large = arr[0];
        int secLarege = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;
        int Small = arr[0];
        int SecSmall = Integer.MAX_VALUE;
        int ThirdSmall = Integer.MAX_VALUE;

        n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                thirdLarge = secLarege;
                secLarege = large;
                large = arr[i];
            } else if (arr[i] > secLarege) {// && arr[i] != large) {
                thirdLarge = secLarege;
                secLarege = arr[i];
            } else if (arr[i] > thirdLarge) {// && arr[i] != large && arr[i] != secLarege) {
                thirdLarge = arr[i];
            }

            if (arr[i] < Small) {
                ThirdSmall = SecSmall;
                SecSmall = Small;
                Small = arr[i];
            } else if (arr[i] < SecSmall) {
                ThirdSmall = SecSmall;
                SecSmall = arr[i];
            } else if (arr[i] < ThirdSmall) {
                ThirdSmall = arr[i];
            }
        }
        System.out.println(large + " " + secLarege + " " + thirdLarge);
        System.out.println(Small + " " + SecSmall + " " + ThirdSmall);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 4, 6, 8, 9, 1 };
        int n = arr.length;
        print3LargeEle(arr, n);
    }
}