import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class common_element {
    static void commonele(int arr[], int brr[]){
        Arrays.sort(arr);
        Arrays.sort(brr);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i<arr.length && j<brr.length) {
            if(arr[i]==brr[j]){
                list.add(arr[i]);
                i++; j++;
            }else if(arr[i]< brr[j]){
                i++;
            }else if(arr[i]>brr[j]){
                j++;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 5 };
        int brr[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5};
        commonele(arr, brr);
    }
}
