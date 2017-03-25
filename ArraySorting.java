//Array Sorting

class ArraySorting
{

	static void printArray (int[] arr)
	{
		if (arr == null)
		{
			System.out.println ("null");
			return;
		}
		String ret = "[";
		for (int index = 0; index < arr.length; index++)
		{
			ret = ret + arr[index];
			if (index != arr.length -1)
			{
			ret = ret + ", ";
			}

		}
		ret = ret + "]";
		System.out.println(ret);

}
		static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}


//BubbleSorting
	static void bubbleSort(int[] arr)
	{ 
	for (int times = 1; times <=arr.length -1;times++ )
	{
		for (int i = 1;i <= arr.length -times; i++)
		{
			if (arr[i-1] > arr[i])
			{
			swap(arr, i-1, i);
			}
		}
	}	
	}

//selectionSorting
	static void selectionSort(int[] arr)
	{
		for (int times = 1;times <=arr.length -1; times++ )
		{
			for (int i = times; i<= arr.length -1; i++)
			{
				if (arr[times-1] > arr[i])
				{
				swap(arr, times-1,i);
				}
			}
		}
		
	}

	


	public static void main (String[] args)
	{

	int[] arr = {2,9,6,7,4,1};
	printArray(arr);
	System.out.println("..................");
	bubbleSort(arr);
	printArray(arr);
	System.out.println("..................");
	selectionSort(arr);
	printArray(arr);


	}


}