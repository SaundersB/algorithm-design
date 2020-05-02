import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void testMergeTwoArrays(){
        int[] firstArray = {4, 5, 6, 7};
        int[] secondArray = {1, 2, 3, 3};
        int[] expectedResult = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] result = MergeSort.merge(firstArray, secondArray);
        assertArrayEquals(expectedResult, result);
    }
}
