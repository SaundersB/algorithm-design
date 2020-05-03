public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.value = val;
        this.left = null;
        this.right = null;
    }

    public void setLeft(TreeNode next){
        this.left = next;
    }

    public TreeNode getLeft(){
        return this.left;
    }

    public void setRight(TreeNode next){
        this.right = next;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
