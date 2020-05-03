public class Node {
    private final int value;
    private Object next;

    public Node(int val){
        this.value = val;
        this.next = null;
    }

    public void setNext(Object next){
        this.next = next;
    }

    public int getValue(){
        return this.value;
    }
}
