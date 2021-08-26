
package con.org.ds.sort.algo;

public class MyInsertionSort {

  public static void main(String[] args) {
    int[] intArray = { 1, 33, -30, 90, 3, 35, -54, 66, -100, 99 };

    //myInsertionSort(intArray,intArray.length);
    recurssionInsertionSort(intArray, 1, intArray.length);
    for (int i : intArray) {
      System.out.println("My Sorted Array " + i);
    }
  }

  public static void myInsertionSort(int[] input, int length) {
    // initially consider first element as a sorted array
    for (int i = 1; i < length; i++) {
      int tempValue = input[i];
      int j = i - 1;
      while (j >= 0 && input[j] > tempValue) {
        input[j + 1] = input[j];
        j--;
      }
      input[j + 1] = tempValue;
    }

  }

  public static void recurssionInsertionSort(int[] input, int sortedIndex, int length) {
    if (sortedIndex == length)
      return;

    int tempValue = input[sortedIndex];
    System.out.println("Sorted Index = " + sortedIndex + " tempValue = " + tempValue);

    int j = sortedIndex;
    while (j > 0) {
      if (input[(j - 1)] > tempValue) {
        System.out.println("input[sortedIndex-1] " + input[(j - 1)] + "greated than  " + tempValue);
        input[j] = input[(j - 1)];
        input[(j - 1)] = tempValue;
      }
      j--;
    }
    recurssionInsertionSort(input, sortedIndex + 1, length);
  }
}
