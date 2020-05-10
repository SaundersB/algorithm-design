import java.util.ArrayList;
import java.util.Arrays;

public class TreeTraversal {
    /**
     * Search each level of a tree's breadth before descending down the tree.
     */
    public static int[] breadthFirstSearch(BinarySearchTree tree){
        TreeNode node = tree.getRoot();
        ArrayList<TreeNode> queue = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();

        queue.add(node);
        while(queue.size() > 0){
            node = queue.remove(0);
            visited.add(node.getValue());
            if(node.getLeft() != null){
                queue.add(node.getLeft());
            }
            if(node.getRight() != null){
                queue.add(node.getRight());
            }
        }
        return visited.stream().mapToInt(Integer::intValue).toArray();
    }
}
