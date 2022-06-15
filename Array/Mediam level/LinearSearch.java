public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 4, 1 };
        int Data = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (Data == arr[i]) {
                System.out.println("Element Present AT Index " + i);
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("Element is not present in array!");
        }
    }
}
