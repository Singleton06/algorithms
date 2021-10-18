package com.github.singleton06.sorting;

import org.junit.jupiter.api.Test;
import static com.github.singleton06.sorting.InsertionSort.sort;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


public class InsertionSortTest {
    @Test
    public void testSort() { 
        int[] arr = new int[] {31, 41, 59, 26, 41, 58};
        sort(arr);
        assertThat(arr, is(new int[] {26, 31, 41, 41, 58, 59}));
    }
}
