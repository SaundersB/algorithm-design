public class SinglyLinkedList {
    private int length;
    private Node head;
    private Node tail;

    public SinglyLinkedList(){
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Adds to the end of the list
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
     */
    public void unshift(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = this.head;
        }
        newNode.setNext(this.head);
        this.head = newNode;
        this.length++;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }
}
