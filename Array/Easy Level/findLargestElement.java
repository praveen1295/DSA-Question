public class findLargestElement {
    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 3, 2, 1};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
