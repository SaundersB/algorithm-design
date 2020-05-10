import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TreeTraversalTest {
    @Test
    public void testBreadthFirstSearch(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(2);
        assertArrayEquals(new int[]{5, 2, 10, 15}, TreeTraversal.breadthFirstSearch(tree));
    }
}
