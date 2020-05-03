import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    @Test
    public void testQueue() throws Exception {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        int value = queue.dequeue();
        assertEquals(value, 5);
        int secondValue = queue.dequeue();
        assertEquals(secondValue, 10);
    }
}
