class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(arr, 8);
		System.out.println(index);

	}

	static int binarySearch(int[] arr, int key)
	{
		
		int low = 0;
		int high = arr.length -1;
		while(low <= high)
		{
			System.out.println(low +".........."+high);
			int mid = (low + high) >> 1;
			int midVal = arr[mid];
			if (midVal > key)
			{
				high = mid -1;
			}
			else if (midVal < key)
			{
				low = mid +1;
			}
			else 
			{
				return mid;
			}

		
		}
		return -1;

	}

}
