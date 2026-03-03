/*
Name: Angel Carmichael
Date: 3/3/2026
Description: Recursively sort the first and second half of an array with creating a new temporary array. 
    The code will use the mergeSort method. After the sort the code merges the two into a temporary array 
    and copy its contents to the original array.
*/

public class Exercise23_05_angel {
  /** A test method */
  public static void main(String[] args) {
    int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, -5};
    mergeSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
  /** The method for sorting the numbers */
  public static void mergeSort(int[] list) {
    int[] tempList = new int[]{list.length};
    merge(mergeSort(list[0,(list.length/2)]),mergeSort(list[(list.length/2),-1]),tempList);
    
  }

  private static void mergeSort(int[] list, int low, int high) {

    
  }

  private static int[] merge(int[] list, int low, int high) {
    int[] temp = new int[high - low + 1];
 
    int mid = (low + high) / 2;
    int current1 = low; // Current index in list1
    int current2 = mid + 1; // Current index in list2
    int current3 = 0; // Current index in temp

    while (current1 <= mid && current2 <= high) {
      if (list[current1] < list[current2])
        temp[current3++] = list[current1++];
      else
        temp[current3++] = list[current2++];
    }

    while (current1 <= mid)
      temp[current3++] = list[current1++];

    while (current2 <= high)
      temp[current3++] = list[current2++];
    
    return temp;
  }
}
