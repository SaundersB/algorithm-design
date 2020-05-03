import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    @Test
    public void testQueue() throws Exception {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        int value = stack.pop();
        assertEquals(value, 10);
        int secondValue = stack.pop();
        assertEquals(secondValue, 5);
    }
}
