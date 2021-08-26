
package con.org.ds.sort.algo;

import java.util.Arrays;

public class MyCountingSort {

  public static void main(String[] args) {
    int[] intArray = { 1, 2, 5, 2, 9, 7, 10, 8, 3, 6, 8, 0 };
    countingSort(intArray, 10);

    for (int j : intArray) {
      System.out.println("Sorted Array " + j);
    }
  }

  public static void countingSort(int[] input, int max) {
    int countArraySize = (max) + 1;
    int[] countArray = new int[countArraySize];
    int[] sortedArray = new int[input.length];
    // form count array
    for (int i = 0; i < input.length; i++) {
      countArray[input[i]]++;
    }

    // actual positions of elements in array
    for (int i = 1; i < countArraySize; i++) {
      countArray[i] += countArray[i - 1];
    }
    // reposition the elements
    // to maintain the stability start from end
    for (int i = input.length - 1; i >= 0; i--) {
      System.out.println(i + " value " + input[i]);
      sortedArray[--countArray[input[i]]] = input[i];
    }

    System.arraycopy(sortedArray, 0, input, 0, sortedArray.length);
    for (int j : countArray) {
      System.out.println("Count Array " + j);
    }
    
  }
}
// 0,1,3,4,4,5,6,7,9,10,11