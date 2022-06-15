public class findMinElement {
    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 3, 2, 1};
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
