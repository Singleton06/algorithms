package com.github.singleton06.sorting;

import static com.github.singleton06.DataGeneration.generateRandomArrayOfLength;
import static com.github.singleton06.sorting.InsertionSort.reverseSort;
import static com.github.singleton06.sorting.InsertionSort.reverseSort2;
import static com.github.singleton06.sorting.InsertionSort.sort;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
  @Test
  public void testSort_bookExample() {
    int[] arr = new int[] {31, 41, 59, 26, 41, 58};
    sort(arr);
    assertThat(arr, is(new int[] {26, 31, 41, 41, 58, 59}));
  }

  @Test
  public void testSort_largeDataSet() {
    int[] arr = generateRandomArrayOfLength(100000);
    int[] expected = Arrays.copyOf(arr, arr.length);
    Arrays.sort(expected);

    sort(arr);

    assertThat(arr, is(expected));
  }

  @Test
  public void testReverseSort_bookExample() {
    int[] arr = new int[] {31, 41, 59, 26, 41, 58};
    reverseSort(arr);
    assertThat(arr, is(new int[] {59, 58, 41, 41, 31, 26}));
  }

  @Test
  public void testReverseSort2_bookExample() {
    int[] arr = new int[] {31, 41, 59, 26, 41, 58};
    reverseSort2(arr);
    assertThat(arr, is(new int[] {59, 58, 41, 41, 31, 26}));
  }
}
