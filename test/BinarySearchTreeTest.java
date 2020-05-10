import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {
    @Test
    public void testBinarySearchTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(2);
        assertEquals(5, tree.getRoot().getValue());
        assertEquals(10, tree.getRoot().getRight().getValue());
    }

    @Test
    public void testWhetherElementExistsInBinarySearchTree(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(2);
        assertTrue(tree.exists(5));
        assertFalse(tree.exists(17));
    }
}
