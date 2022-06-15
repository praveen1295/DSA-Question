import java.util.*;

class Main {
    public static void rearrangeElements(int arr[]) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (Integer i : arr) {
            if (i < 0) {
                list1.add(i);
            } else {
                list2.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        int i = 0;
        int j = 0;
        int k = 0;
        // for ( i = 0; i < arr.length; i++) {
        // if (i % 2 == 0 && j < list1.size() && k < list2.size()) {
        // arr[i] = list2.get(k);
        // k++;
        // } else if (i % 2 == 1 && j < list1.size() && k < list2.size()) {
        // arr[i] = list1.get(j);
        // j++;
        // } else if (j < list1.size()) {
        // arr[i] = list1.get(j);
        // j++;
        // } else if (k < list2.size()) {
        // arr[i] = list2.get(k);
        // k++;
        // }
        // }

        while (j < list1.size() && k < list2.size()) {
            if (i % 2 == 0) {
                arr[i] = list2.get(j);
                i++;
                j++;
            } else {
                arr[i] = list1.get(k);
                i++;
                k++;
            }
        }
        while (j < list1.size()) {
            arr[i] = list1.get(j);
            i++;
            j++;
        }
        while (k < list2.size()) {
            arr[i] = list2.get(k);
            i++;
            k++;
        }
        for (Integer r : arr) {
            System.out.print(r + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, -2, -8, -1, -6, 0, -5, -6, -9, 0, 7, 0 };
        rearrangeElements(arr);
    }
}
