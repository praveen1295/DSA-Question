public class sortAnArray {
    public static void SortArray(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for(int i=0; i<n; i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 4, 1};
        int n = arr.length;
        SortArray(arr, n);

    }
}
