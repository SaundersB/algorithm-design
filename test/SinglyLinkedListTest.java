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
        assertNull(singlyLinkedList.getHead());
        assertNull(singlyLinkedList.getTail());
    }

    @Test
    public void testShiftingQueue() throws Exception {
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
        singlyLinkedList.shift();
        assertEquals(10, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.shift();
        assertEquals(15, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.shift();
        assertEquals(25, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.shift();
        assertNull(singlyLinkedList.getHead());
        assertNull(singlyLinkedList.getTail());
    }

    @Test
    public void testUnShiftingQueue() throws Exception {
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
        singlyLinkedList.unshift(30);
        assertEquals(30, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.unshift(35);
        assertEquals(35, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.unshift(40);
        assertEquals(40, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.unshift(45);
        assertEquals(45, singlyLinkedList.getHead().getValue());
        assertEquals(25, singlyLinkedList.getTail().getValue());
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        singlyLinkedList.pop();
        assertNull(singlyLinkedList.getHead());
        assertNull(singlyLinkedList.getTail());
    }


    @Test
    public void testGetFromList() throws Exception {
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
        singlyLinkedList.push(30);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(30, singlyLinkedList.getTail().getValue());
        Node nodeAtZero = singlyLinkedList.get(0);
        assertEquals(5, nodeAtZero.getValue());
        Node nodeAtOne = singlyLinkedList.get(1);
        assertEquals(10, nodeAtOne.getValue());
        Node nodeAtTwo = singlyLinkedList.get(2);
        assertEquals(15, nodeAtTwo.getValue());
        Node nodeAtThree = singlyLinkedList.get(3);
        assertEquals(25, nodeAtThree.getValue());
    }

    @Test
    public void testSetValueInList() throws Exception {
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
        singlyLinkedList.push(30);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(30, singlyLinkedList.getTail().getValue());
        assertTrue(singlyLinkedList.set(0, 100));
        assertEquals(100, singlyLinkedList.get(0).getValue());
        assertTrue(singlyLinkedList.set(1, 101));
        assertEquals(101, singlyLinkedList.get(1).getValue());
        assertTrue(singlyLinkedList.set(2, 102));
        assertEquals(102, singlyLinkedList.get(2).getValue());
        assertTrue(singlyLinkedList.set(3, 103));
        assertEquals(103, singlyLinkedList.get(3).getValue());
    }

    @Test
    public void testInsertValueInList() throws Exception {
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
        singlyLinkedList.push(30);
        assertEquals(5, singlyLinkedList.getHead().getValue());
        assertEquals(30, singlyLinkedList.getTail().getValue());
        assertTrue(singlyLinkedList.insert(0, 100));
        assertEquals(100, singlyLinkedList.get(0).getValue());
        assertTrue(singlyLinkedList.insert(1, 101));
        assertEquals(101, singlyLinkedList.get(1).getValue());
        assertTrue(singlyLinkedList.insert(2, 102));
        assertEquals(102, singlyLinkedList.get(2).getValue());
        assertTrue(singlyLinkedList.insert(3, 103));
        assertEquals(103, singlyLinkedList.get(3).getValue());
    }
}
