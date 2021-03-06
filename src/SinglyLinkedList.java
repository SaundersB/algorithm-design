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
     * Get the node at a current index.
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
     * Set the value for a given element's index.
     * O(n) From get method
     */
    public boolean set(int index, int value){
        Node node = this.get(index);
        if(node != null){
            node.setValue(value);
            return true;
        }
        return false;
    }

    /**
     * O(1)
     */
    public boolean insert(int index, int value){
        if(index < 0 || index > this.length){
            return false;
        }
        if(index == this.length){
            this.push(value);
            return true;
        } else if(index == 0){
            this.unshift(value);
            return true;
        }
        Node newNode = new Node(value);
        Node previousNode = this.get(index - 1);
        Node temp = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(temp);
        this.length++;
        return true;
    }

    /**
     * O(n) from this.get()
     */
    public void remove(int index){
        if(index < 0 || index >= this.length){
            return;
        }
        if(index == this.length - 1){
            this.pop();
            return;
        }
        if(index == 0){
            this.shift();
            return;
        }
        Node previousNode = this.get(index - 1);
        Node removed = previousNode.getNext();
        previousNode.setNext(removed.getNext());
        this.length--;
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
     * Reverse a linked list
     * O(n)
     */
    public void reverse(){
        Node node = this.head;
        this.head = this.tail;
        this.tail = node;
        Node next = null;
        Node previous = null;
        for(int i = 0; i < this.length; i++){
            next = node.getNext();
            node.setNext(previous);
            previous = node;
            node = next;
        }
    }

    /**
     * Get the head of the list
     * O(1)
     */
    public Node getHead(){
        return this.head;
    }

    /**
     * Get the tail of the list
     * O(1)
     */
    public Node getTail(){
        return this.tail;
    }
}
