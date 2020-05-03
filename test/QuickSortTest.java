import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort(){
        int[] testArray = {4, 5, 6, 7, 1, 2, 3, 3};
        int[] expectedResult = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] result = QuickSort.quickSort(testArray, 0, 6);
        assertArrayEquals(expectedResult, result);
    }
}
