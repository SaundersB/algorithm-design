public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(){
        this.root = null;
    }
    public void insert(int value){
        TreeNode newNode = new TreeNode(value);
        if(this.root == null){
            this.root = newNode;
            return;
        }
        TreeNode current = this.root;
        while(true){
            if(value == current.getValue()){
                // Prevent duplicates
                return;
            }
            if(value < current.getValue()){
                if(current.getLeft() == null){
                    current.setLeft(newNode);
                    return;
                } else {
                    current = current.getLeft();
                }
            } else {
                if(current.getRight() == null){
                    current.setRight(newNode);
                    return;
                } else {
                    current = current.getRight();
                }
            }
        }
    }

    public boolean exists(int value){
        if(this.root == null){
            return false;
        }
        TreeNode current = this.root;
        while(current != null){
            if(value == current.getValue()){
                return true;
            }
            else if (value < current.getValue()){
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    private TreeNode getRoot() {
        return root;
    }
    private void setRoot(TreeNode root) {
        this.root = root;
    }
}
