public class RotateArrayINCyclicOrder {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 }; // Rotate Right SIde;
        int t = 4; // tareget How many time rotate;
        int n = arr.length;
        int i = 0, j = n - 1;

        while (t-- > 0) {
            i = 0;
            while (i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        // ..............................OR...........................................
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int t1 = 4; // tareget How many time rotate;
        while (t1-- > 0) {
            int n1 = arr1.length;
            int temp1 = arr1[arr.length - 1];
            for (int p = n1 - 1; p > 0; p--) {
                arr1[p] = arr1[p - 1];
            }
            arr1[0] = temp1;

        }
        for (int j2 = 0; j2 < arr1.length; j2++) {
            System.out.print(arr1[j2] + " ");
        }

        // .......................Rotate Left SIde................................
        System.out.println();

        int arr2[] = { 1, 2, 3, 4, 5, 6 }; // Rotate Right SIde;
        int t2 = 4; // tareget How many time rotate;

        i = 0;
        while (t2-- > 0) {
            j = arr2.length - 1;
            while (i != j) {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr2[k] + " ");
        }

        // ............................OR.............................................
        System.out.println();

        int arr3[] = { 1, 2, 3, 4, 5, 6 };
        int t3 = 4; // tareget How many time rotate;
        int n3 = arr3.length;
        while (t3-- > 0) {
            int temp3 = arr3[0];
            for (int p = 0; p < n3 - 1; p++) {
                arr3[p] = arr3[p + 1];
            }
            arr3[n3 - 1] = temp3;

        }
        for (int j2 = 0; j2 < arr3.length; j2++) {
            System.out.print(arr3[j2] + " ");
        }

    }
}
