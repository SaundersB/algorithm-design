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
        /*
         *              5
         *            2   10
         *                  15
         *
         *          [5, 2, 10, 15]
         */
        assertArrayEquals(new int[]{5, 2, 10, 15}, TreeTraversal.breadthFirstSearch(tree));
    }

    @Test
    public void testPreOrderDepthFirstSearch(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(6);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        tree.insert(20);
        /*
         *              10
         *            6   15
         *          3  8    20
         *
         */
        TreeTraversal treeTraversal = new TreeTraversal();
        assertArrayEquals(new int[]{10, 6, 3, 8, 15, 20}, treeTraversal.preOrderDepthFirstSearch(tree));
    }
}
