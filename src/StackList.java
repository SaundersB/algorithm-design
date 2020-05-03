import java.util.ArrayList;

public class StackList implements StackInterface{
    private Node first;
    private Node last;
    private int length;

    public StackList(){
        this.length = 0;
    }

    /**
     * Add a new element to the stack.
     * O(1)
     */
    @Override
    public int push(int number) {
        Node newNode = new Node(number);
        if(this.first == null){
            this.first = newNode;
            this.last = newNode;
        } else {
            Node currentNode = this.first;
            this.first = newNode;
            this.first.setNext(currentNode);
        }
        return this.length++;
    }

    /**
     * Remove an element from the stack.
     * O(1)
     */
    @Override
    public int pop() {
        if(this.first == null){
            return -1;
        }
        Node temp = this.first;
        if(this.first == this.last){
            this.last = null;
        }
        this.first = this.first.getNext();
        this.length--;
        return temp.getValue();
    }

    /**
     * Looking at the value of the first element.
     * O(1)
     */
    @Override
    public int peek() {
        return this.first.getValue();
    }

    /**
     * Checking if the stack is empty or not.
     * O(1)
     */
    @Override
    public boolean isEmpty() {
        return this.first == null;
    }
}
