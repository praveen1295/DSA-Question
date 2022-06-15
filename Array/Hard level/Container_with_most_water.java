public class Container_with_most_water {
    static int Area(int height[]) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l <= r) {
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh, rh);
            max = Math.max(max, min_h * (r - l));
            if (lh < rh) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(Area(arr));
    }
}
