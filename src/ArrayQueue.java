import java.util.ArrayList;

public class ArrayQueue implements QueueInterface {
    private final ArrayList<Integer> numbersArray;

    public ArrayQueue(){
        this.numbersArray = new ArrayList<>();
    }

    /**
     * O(1) because we append to the end of the array
     */
    public int enqueue(int number){
        this.numbersArray.add(number);
        return this.numbersArray.size() - 1;
    }

    /**
     * O(n) because we have to shift array indexes after the removal
     */
    public int dequeue(){
        if(this.numbersArray.size() > 0) {
            return this.numbersArray.remove(0);
        }
        return -1;
    }

    /**
     * O(1)
     */
    public int front(){
        return this.numbersArray.get(0);
    }

    /**
     * O(1)
     */
    public int rear(){
        return this.numbersArray.get(this.numbersArray.size() - 1);
    }
}
