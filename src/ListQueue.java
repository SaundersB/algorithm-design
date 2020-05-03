public class ListQueue implements QueueInterface {
    private Node first;
    private Node last;
    private int length;

    public ListQueue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    /**
     * O(1)
     */
    @Override
    public int enqueue(int number) {
        Node newNode = new Node(number);
        if(this.first == null){
            this.first = newNode;
        } else {
            this.first.setNext(newNode);
        }
        this.last = newNode;
        return this.length++;
    }

    /**
     * O(1)
     */
    @Override
    public int dequeue(){
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
     * O(1)
     */
    @Override
    public int front() {
        return this.first.getValue();
    }

    /**
     * O(1)
     */
    @Override
    public int rear() {
        return this.last.getValue();
    }
}
