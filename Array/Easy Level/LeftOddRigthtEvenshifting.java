import java.util.*;
class Main {
	static void segregateEvenOdd(int arr[]) {
		int left = 0, right = arr.length - 1;
		while (left < right){
			while (arr[left]%2 == 1 && left < right)
				left++;

			while (arr[right]%2 == 0 && left < right)
				right--;

			if (left < right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main (String[] args) {
		int arr[] = {4,5,6,1,2,3,9,8,7,1,0};
		segregateEvenOdd(arr);

		System.out.print("Array after segregation ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
