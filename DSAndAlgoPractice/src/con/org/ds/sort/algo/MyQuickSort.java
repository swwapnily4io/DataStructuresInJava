package con.org.ds.sort.algo;

public class MyQuickSort {

  // NOT WORKING
	public static void main(String[] args) {
		int[] intArray = { 1, 33, -30, 90, 3, 35, -54, 66, -100, 99 };

		quickSort(intArray, 0, intArray.length-1);

		for (int i : intArray) {
			System.out.println("Sorted Array " + i);
		}
	}

	public static int partition(int[] input, int start, int end) {
	  int pivot=input[start];
	  int i = start, j= end;
	  
	  while(i<j) {
  	  // start from left
  	  while(input[i]<pivot) {
  	    i++;
  	  }
  	// start from right
  	  while(input[j]>pivot) {
        j--;
      }
  	  //swap elements
  	  if(i<j) {
  	    int temp = input[j];
  	    input[j]=input[i];
  	    input[i]=temp;
  	  }
	  }
	  int temp = input[j];
    input[j]=input[start];
    input[start]=temp;
    
    return end;
	  
	}
	public static void quickSort(int[] input, int start, int end) {
		if (end-start <2) 
		  return;
				// Get pivot index
		int pivotIndex = partition(input, start, end);

		// Sort Left side of the pivot element
		System.out.println("Sorting the left side of pivot with start " + start + " end " + pivotIndex);
		quickSort(input, start, pivotIndex-1);
		// Sort Right side of the pivot element
		System.out.println("Sorting the right side of pivot with start " + (pivotIndex + 1) + " end " + end);
		quickSort(input, pivotIndex + 1, end);
		

	}

	private static int partition1(int[] input, int start, int end) {
		// This is using first element as pivot element
		int pivot = input[start];

		int i = start;
		int j = end;

		while (i < j) {
			System.out.println("value of start is " + i + " value of end is " + j);
			// NOTE: This is an empty body loop
			while (i < j && input[--j] >= pivot)
				;
			System.out.println("VALUE of start is " + i + " value of end is " + j);
			if (i < j)
				input[i] = input[j];

			// NOTE: This is an empty body loop
			while (i < j && input[++i] <= pivot)
				;
			System.out.println("VALUE of START is " + i + " value of end is " + j);
			if (i < j)
				input[j] = input[i];

		}
		input[j] = pivot;
		System.out.println("pivot element is " + pivot + " at index " + j);
		return j;

	}
}
