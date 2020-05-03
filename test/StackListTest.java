import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackListTest {
    @Test
    public void testQueue() throws Exception {
        StackList stack = new StackList();
        stack.push(5);
        stack.push(10);
        assertFalse(stack.isEmpty());
        int value = stack.pop();
        assertEquals(value, 10);
        int secondValue = stack.pop();
        assertEquals(secondValue, 5);
        assertEquals(-1, stack.pop());
        assertTrue(stack.isEmpty());
    }
}
