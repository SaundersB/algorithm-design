import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayManipulatorTest {
    @Test
    public void testArraySwap(){
        assertArrayEquals(new int[]{2, 1, 3}, ArrayManipulator.swap(new int[]{1, 2, 3}, 0, 1));
        assertArrayEquals(new int[]{1, 3, 2}, ArrayManipulator.swap(new int[]{1, 2, 3}, 1, 2));
        assertArrayEquals(new int[]{3, 2, 1}, ArrayManipulator.swap(new int[]{1, 2, 3}, 0, 2));
        assertArrayEquals(new int[]{1, 3, 2}, ArrayManipulator.swap(new int[]{1, 2, 3}, 2, 1));
        assertArrayEquals(new int[]{3, 2, 1}, ArrayManipulator.swap(new int[]{1, 2, 3}, 2, 0));
    }
}
