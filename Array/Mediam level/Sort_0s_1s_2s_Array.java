public class Sort_0s_1s_2s_Array {
    static void sortArray(int arr[], int n) {
        int Left = 0;
        int Right = n - 1;
        int m = 0;

        while (m <= Right) {
            switch (arr[m]) {
                case 0: {
                    int temp = arr[Left];
                    arr[Left] = arr[m];
                    arr[m] = temp;
                    Left++;
                    m++;
                    break;
                }

                case 1:
                    m++;
                    break;
                case 2: {
                    int temp = arr[m];
                    arr[m] = arr[Right];
                    arr[Right] = temp;
                    Right--;
                }
                default:
                    break;
            }
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 0, 0, 1, 0, 2 };
        int n = arr.length;
        sortArray(arr, n);
        printArray(arr, n);
    }
}
