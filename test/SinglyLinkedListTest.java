import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {
    @Test
    public void testQueue() throws Exception {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(5, singlyLinkedList.getTail().getValue());
        singlyLinkedList.push(10);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(10, singlyLinkedList.getTail().getValue());
        singlyLinkedList.push(15);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(15, singlyLinkedList.getTail().getValue());
        singlyLinkedList.push(25);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.pop();
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(15, singlyLinkedList.getTail().getValue());
        singlyLinkedList.pop();
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(10, singlyLinkedList.getTail().getValue());
        singlyLinkedList.pop();
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(5, singlyLinkedList.getTail().getValue());
        singlyLinkedList.pop();
        assertNull(singlyLinkedList.getHead().getNext());
        assertNull(singlyLinkedList.getTail().getNext());
    }
}
