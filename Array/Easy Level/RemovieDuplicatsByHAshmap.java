import java.util.*;
import java.util.HashMap;

public class RemovieDuplicatsByHAshmap {
    private static void removieDuplicates(Object arr[]) {
        HashMap<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.remove(arr[i]);
            }
            map.put(arr[i], i);
        }
        System.out.println(map);
        map.forEach((k, v) -> System.out.print(k+" "));
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 6, 2, 3, 4, 4, 5, 6, 6 };
        removieDuplicates(arr);
       
    }
}
