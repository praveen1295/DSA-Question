public class find_element_In_SortedRotated_Array {
    public static int search(int[] nums, int target) {
        int n = nums.length, pivotIdx;
        pivotIdx = findPivotIdx(nums, 0, n - 1);
        if (pivotIdx == -1) {
            if (n == 2) {
                if (nums[0] > nums[1])
                    pivotIdx = 0;
                else
                    pivotIdx = 1;
            } else if (n > 2 && nums[0] > nums[1])
                pivotIdx = 0;
            else
                return binarySearch(nums, 0, n - 1, target);
        }
        if (nums[0] <= target)
            return binarySearch(nums, 0, pivotIdx, target);
        else
            return binarySearch(nums, pivotIdx + 1, n - 1, target);

    }

    public static int findPivotIdx(int[] nums, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid != 0 && nums[mid - 1] > nums[mid])
                return mid - 1;
            else if (nums[0] >= nums[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] >= target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 9;
        System.out.println(search(arr, target));
    }
}