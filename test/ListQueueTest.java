import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListQueueTest {
    @Test
    public void testQueue() throws Exception {
        ListQueue queue = new ListQueue();
        queue.enqueue(5);
        queue.enqueue(10);
        int value = queue.dequeue();
        assertEquals(value, 5);
        int secondValue = queue.dequeue();
        assertEquals(secondValue, 10);
    }
}
