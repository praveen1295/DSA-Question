import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.IntegerSyntax;

public class Union_of_two_sorted_array {
    private static void find_union(int arr1[], int arr2[], List<Integer> list) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            while (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) {
                i++;
            }
            while (j < arr2.length - 1 && arr2[j] == arr2[j + 1]) {
                j++;
            }
            if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else {
                list.add(arr1[i]);
                j++;
                i++;
            }
        }
        // while (i < arr1.length) {
        // if (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) {
        // i++;
        // } else{
        // list.add(arr1[i]);
        // }
        // }
        // while (j < arr2.length) {
        // if (j < arr2.length - 1 && arr2[j] == arr2[j + 1]) {
        // j++;
        // } else{
        // list.add(arr2[j]);
        // }
        // }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static void Intersection_of_sorted_array(int arr1[], int arr2[], List<Integer> list1) {
        int p = 0;
        int q = 0;

        while (p < arr1.length && q < arr2.length) {
            if (arr1[p] < arr2[q]) {
                p++;
            } else if (arr1[p] > arr2[q]) {
                q++;
            } else if (arr1[p] == arr2[q]) {
                list1.add(arr1[p]);
                // System.out.print(arr2[q]+" ");
                p++;
                q++;
            }
        }
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 1, 1, 7, 9 };
        int arr2[] = { 1, 1, 4, 6, 8, 9, 10 };

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        find_union(arr1, arr2, list);
        Intersection_of_sorted_array(arr1, arr2, list1);
    }
}
