import java.util.ArrayList;

public class TreeTraversal {
    /**
     * Visit each level of a tree's breadth before descending down the tree.
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
        return ArrayManipulator.arrayListToIntArray(visited);
    }

    /*
     * Visit all nodes of a tree vertically before progressing to the next node.
     */
    public int[] preOrderDepthFirstSearch(BinarySearchTree tree){
        ArrayList<Integer> visited = new ArrayList<>();
        this.preOrderTraverse(visited, tree.getRoot());
        return ArrayManipulator.arrayListToIntArray(visited);
    }

    public int[] postOrderDepthFirstSearch(BinarySearchTree tree){
        ArrayList<Integer> visited = new ArrayList<>();
        this.postOrderTraverse(visited, tree.getRoot());
        return ArrayManipulator.arrayListToIntArray(visited);
    }

    private void preOrderTraverse(ArrayList<Integer> visited, TreeNode node){
        visited.add(node.getValue());
        if(node.getLeft() != null){
            preOrderTraverse(visited, node.getLeft());
        }
        if(node.getRight() != null){
            preOrderTraverse(visited, node.getRight());
        }
    }

    private void postOrderTraverse(ArrayList<Integer> visited, TreeNode node){
        if(node.getLeft() != null){
            postOrderTraverse(visited, node.getLeft());
        }
        if(node.getRight() != null){
            postOrderTraverse(visited, node.getRight());
        }
        visited.add(node.getValue());
    }
}
