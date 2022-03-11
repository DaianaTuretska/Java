public class HeapSort {
	public void sort(int arr[])
	{
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heap(arr, n, i);

		for (int i = n - 1; i > 0; i--) {
			int buff = arr[0];
			arr[0] = arr[i];
			arr[i] = buff;
			heap(arr, i, 0);
		}
	}

	void heap(int arr[], int n, int i)
	{
		int biggest = i; 
		int left = 2 * i + 1; 
		int right = 2 * i + 2; 

		if (left < n && arr[left] > arr[biggest])
			biggest = left;
		if (right < n && arr[right] > arr[biggest])
			biggest = right;
		if (biggest != i) {
			int swap = arr[i];
			arr[i] = arr[biggest];
			arr[biggest] = swap;
			heap(arr, n, biggest);
		}
	}
	static void outputArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 22, 11, 18, 8, 9, 13 };
		System.out.println("Array:");
		outputArray(arr);
		int n = arr.length;

		HeapSort object = new HeapSort();
		object.sort(arr);

		System.out.println("Sorted array :");
		output
			Array(arr);
	}
}
