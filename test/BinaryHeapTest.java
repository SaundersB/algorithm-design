import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryHeapTest {
    @Test
    public void testBinaryHeapInsertion(){
        BinaryHeap binaryHeap = new BinaryHeap();
        /*
         *              55
         *            39   41
         *          18 27  12 33
         *
         */
        binaryHeap.insert(41);
        binaryHeap.insert(39);
        binaryHeap.insert(33);
        binaryHeap.insert(18);
        binaryHeap.insert(27);
        binaryHeap.insert(12);
        binaryHeap.insert(55);
        assertArrayEquals(new int[]{55, 41, 33, 39, 27, 12, 18}, binaryHeap.getValues());
    }
}
