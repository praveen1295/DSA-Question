public class LargePairSum {
    public static void main(String[] args) {
        int arr[] = { -15, 2, 8, 5, 6, 4 };
        int n = arr.length;

        int large = arr[0];
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>large){
                secLarge = large;
                large = arr[i];
            }
            else if(arr[i]>secLarge  && arr[i]!=large){
            secLarge = arr[i];
            }
        }
        System.out.println(large+secLarge);
    }
}
