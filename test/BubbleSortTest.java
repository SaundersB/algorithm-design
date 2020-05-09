import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void testBubbleSort(){
        assertArrayEquals(new int[]{1, 5, 15, 25, 100}, BubbleSort.sort(new int[]{5, 1, 25, 15, 100}));
        assertArrayEquals(new int[]{-100, 1, 5, 15, 25}, BubbleSort.sort(new int[]{5, 1, 25, 15, -100}));
    }
}
