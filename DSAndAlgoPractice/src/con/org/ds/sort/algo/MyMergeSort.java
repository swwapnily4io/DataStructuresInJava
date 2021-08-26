package con.org.ds.sort.algo;

public class MyMergeSort {

  public static void main(String[] args) {

    int[] intArray= {12,43,-56,32,4,5,8,};
    mergeSort(intArray,0,intArray.length);
    
    for(int value:intArray) {
      System.out.println(value);
    }
  }

  public static void mergeSort(int[] inputArray, int start, int end) {
    if(end-start<2)
      return;
    int mid = (start+end) / 2;
   
    mergeSort(inputArray,start,mid);
    mergeSort(inputArray,mid,end);
    merge(inputArray,start,mid,end);
    
  }
  
  // Descending order
  public static void merge(int[] inputArray, int start, int mid, int end) {
    System.out.println("start "+start+" end "+end);
    if (inputArray[mid - 1] >= inputArray[mid])
      return;
    int[] tempArray = new int[start + end];
    
    int i = start;
    int j = mid;
    int tempIndex = 0;
    
    while(i < mid && j <end) {
      tempArray[tempIndex++] = inputArray[i] >= inputArray[j] ? inputArray[i++]: inputArray[j++];
    }
    System.out.println("start + tempIndex "+(start + tempIndex)+" mid - i "+(mid - i));
    System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
    //int tt = start + tempIndex;
//    for(;i<(mid-1);i++) {
//      inputArray[tt++] = inputArray[i];
//    }
    System.out.println("start pp "+(start )+" tempIndex "+tempIndex);
    System.arraycopy(tempArray, 0, inputArray, start, tempIndex);
/*    for(int m =0;m<tempIndex;m++) {
      inputArray[start++] = tempArray[m];
   }
    
    while (i <= mid) {
      tempArray[tempIndex++] = inputArray[i++];
      }
      while (j <= end) {
      tempArray[tempIndex++] = inputArray[j++];
      }
      System.arraycopy(tempArray, 0, inputArray, 0, tempArray.length);
   */   
  }
}
