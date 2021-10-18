package com.github.singleton06.sorting;

public class InsertionSort {
  public static void sort(int[] arr) {
    // the algorithm page says j = 2, but they're doing 1-based index, not 0
    for (int j = 1; j < arr.length; j++) {
      int val = arr[j];
      int i = j - 1;

      // the algorithm page indicates that it's > 0, but that's 1-based index, not 0
      // so this has been changed to >=
      while (i >= 0 && arr[i] > val) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = val;
    }
  }

  /** Exercise 1.1-2 */
  public static void reverseSort(int[] arr) {
    for (int j = arr.length - 2; j >= 0; j--) {
      int val = arr[j];
      int i = j + 1;

      // still keep the > sign because this approach takes the right to left approach,
      // meaning that we still sort descending right -> left.
      while (i <= arr.length - 1 && arr[i] > val) {
        arr[i - 1] = arr[i];
        i++;
      }
      arr[i - 1] = val;
    }
  }

  /** Exercise 1.1-2: Going from left to right in this approach. */
  public static void reverseSort2(int[] arr) {
    for (int j = 1; j < arr.length; j++) {
      int val = arr[j];
      int i = j - 1;

      while (i >= 0 && arr[i] < val) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = val;
    }
  }
}
