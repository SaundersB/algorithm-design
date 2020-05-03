import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayQueueTest {
    @Test
    public void testQueue() throws Exception {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(5);
        queue.enqueue(10);
        int value = queue.dequeue();
        assertEquals(value, 5);
        int secondValue = queue.dequeue();
        assertEquals(secondValue, 10);
    }
}
