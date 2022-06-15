public class InsertinoSort {
    static void printArr(int arr[], int n){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,1};
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int current = arr[i];
            int j = i-1;

            while (j>=0 && current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArr(arr, n);
    }
}
