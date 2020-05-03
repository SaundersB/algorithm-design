public class SinglyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    public SinglyLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }
}
