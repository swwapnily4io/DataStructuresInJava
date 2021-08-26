
package con.org.ds.sort.algo;

public class MyStringRadixSort {
  public enum Alphabet {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    public static int getNum(String targ) {
      return valueOf(targ).ordinal();
    }

    public static int getNum(char targ) {
      return valueOf(String.valueOf(targ)).ordinal();
    }
  }

  public static void main(String[] args) {
    String[] strArray = { "bcdef", "dbaqc", "abcde", "bbbbb" };
    int radix = 17;// elements 0-9 for counting sort
    int width = 5; //max width of values in the array abcde = 5
    myRadixSort(strArray, radix, width);
    for (String value : strArray) {
      System.out.println("Sorted array " + value);
    }

  }

  public static void myRadixSort(String[] input, int radix, int width) {
    int tempWidth = width - 1;
    while (tempWidth >= 0) {
      countingSort(input, tempWidth, radix);
      tempWidth--;
    }
  }

  public static void countingSort(String[] input, int tempWidth, int radix) {
    int[] countArray = new int[radix];
    String[] tempArray = new String[input.length];
    for (int i = 0; i < input.length; i++) {
      int digit = getPosition(input[i], tempWidth, tempWidth + 1);
      countArray[digit] += 1;
    }
    // actual positions of elements in array
    for (int i = 1; i < countArray.length; i++) {
      countArray[i] += countArray[i - 1];
    }
    // reposition the elements
    // to maintain the stability start from end
    for (int i = input.length - 1; i >= 0; i--) {
      tempArray[--countArray[getPosition(input[i], tempWidth, tempWidth + 1)]] = input[i];
    }
    System.arraycopy(tempArray, 0, input, 0, input.length);
  }

  private static int getPosition(String original, int substringStartIndex, int substringEndIndex) {
    int position = Alphabet.getNum(original.substring(substringStartIndex, substringEndIndex).toUpperCase());
    System.out.println("char is " + original.substring(substringStartIndex, substringEndIndex).toUpperCase()
            + " position is " + position);
    return position;
  }

}
