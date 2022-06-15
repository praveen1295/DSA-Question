
class Main {
    public static int[] searchRange(int[] nums, int target) {
      int ans[] = { -1, -1 };

		ans[0] = search(nums, target, true);
		if (ans[0] != -1)
			ans[1] = search(nums, target, false);
		return ans;
	}

	static int search(int[] nums, int target, boolean isFindStartIndex) {
		int ans = -1;

		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] < target) {
				start = mid + 1;

			} else if (nums[mid] > target) {
				end = mid - 1;

			} else {
				ans = mid;

				if (isFindStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return ans;
	}
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4,5,6};
        int k = 3;
        
        for (int i : searchRange(arr, k)) {
            System.out.print(i+" ");
        }
    }
}