public class Node {
    private final int value;
    private Node next;

    public Node(int val){
        this.value = val;
        this.next = null;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public int getValue(){
        return this.value;
    }
}
