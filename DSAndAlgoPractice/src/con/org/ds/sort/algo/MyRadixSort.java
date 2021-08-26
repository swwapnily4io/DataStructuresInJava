
package con.org.ds.sort.algo;

public class MyRadixSort {

  public static void main(String[] args) {
    int[] intArray = { 4231, 4573, 7842, 9824, 5743, 4290, 8857, 5643 };
    int radix = 10;// elements 0-9 for counting sort
    int width = 4; //max width of values in the array 9824 = 4

    myRadixSort(intArray, radix, width);
    for (int i : intArray) {
      System.out.println("Sorted Array " + i);
    }
  }

  public static void myRadixSort(int[] input, int radix, int width) {
    int tempWidth = 0;
    while (tempWidth < width) {
      countingSort(input, tempWidth, radix);
      tempWidth++;
    }
  }

  public static void countingSort(int[] input, int tempWidth, int radix) {
    int[] countArray = new int[radix];
    int[] tempArray = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      int digit = getDigit(tempWidth, input[i], radix);
      countArray[digit] += 1;
    }
    // actual positions of elements in array
    for (int i = 1; i < countArray.length; i++) {
      countArray[i] += countArray[i - 1];
    }
    // reposition the elements
    // to maintain the stability start from end
    for (int i = input.length - 1; i >= 0; i--) {
      tempArray[--countArray[getDigit(tempWidth, input[i], radix)]] = input[i];
    }
    System.arraycopy(tempArray, 0, input, 0, input.length);
  }

  private static int getDigit(int position, int value, int radix) {
    value = value / (int) Math.pow(radix, position) % radix;
    return value;
  }
}
