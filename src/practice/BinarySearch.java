package practice;

public class BinarySearch {

	int binarySearch(int arr[], int l, int r, int x) {

		if (r >= l) {

			int mid = 1 + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			else

			return binarySearch(arr, l, mid + 1, x);

		}

		return -1;

	}

	public static void main(String[] args) {

		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 4;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");

		else
			System.out.println("Element found at index " + result);

	}

}
