public class SinglyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    /**
     * Constructs an initial singly linked list with 0 elements pointing to a null head and tail.
     */
    public SinglyLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * O(n)
     */
    public Node get(int index){
        if(index < 0 || index >= this.length){
            return null;
        }
        int count = 0;
        Node current = this.head;
        while(count != index){
            current = current.getNext();
            count++;
        }
        return current;
    }

    /**
     * Adds to the end of the list
     * O(1)
     **/
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

    /**
     * Removes from the end of the list
     * O(n)
     **/
    public Node pop(){
        if(this.head == null){
            return this.tail;
        }
        Node current = this.head;
        Node newTail = current;
        while(current.getNext() != null){
            newTail = current;
            current = current.getNext();
        }
        this.tail = newTail;
        this.tail.setNext(null);
        this.length--;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return current;
    }

    /**
     * Removes from the beginning of the list
     * O(1)
     **/
    public Node shift(){
        if(this.head == null){
            return null;
        }
        Node current = this.head;
        this.head = current.getNext();
        this.length--;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return current;
    }

    /**
     * Adds to the beginning of the list
     * O(1)
     */
    public void unshift(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
    }

    /**
     * Get the head of the list
     * O(1)
     * @return
     */
    public Node getHead(){
        return this.head;
    }

    /**
     * Get the tail of the list
     * O(1)
     * @return
     */
    public Node getTail(){
        return this.tail;
    }
}
