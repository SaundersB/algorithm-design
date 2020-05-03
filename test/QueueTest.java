import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
    @Test
    public void testQueue(){
        Queue queue = new Queue();
        queue.push(5);
        queue.push(10);
        int value = queue.pop();
        assertEquals(value, 10);
        int secondValue = queue.pop();
        assertEquals(secondValue, 5);
    }
}
