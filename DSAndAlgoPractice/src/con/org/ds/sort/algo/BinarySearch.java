package con.org.ds.sort.algo;

/*
 * log(n) - Time complexity - best 
 * NOTE - O(log(n)) is better than O(N)
 */
public class BinarySearch {

	public static void main(String[]args) {
		int a [] = {1,2,3,4,5};
		int target = 3;
		int result = binarySearch(a,target);
		if(result == -1)
			System.out.println("Element doesnot exists in the array");
		else
			System.out.println("found the result at index "+result);
	}

	private static int binarySearch(int[] a, int target) {
		int left = 0,right=a.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(a[mid] == target)
				return mid;
			if(a[mid] < target)
				left = mid+1;
			else
				right = mid-1;
				
		}
		return -1;
	}
}
