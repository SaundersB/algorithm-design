import java.util.ArrayList;

public class Queue {
    private final ArrayList<Integer> numbersArray;

    public Queue(){
        this.numbersArray = new ArrayList<>();
    }

    public void enqueue(int number){
        this.numbersArray.add(number);
    }

    public int dequeue() throws Exception {
        if(this.numbersArray.size() > 0) {
            return this.numbersArray.remove(0);
        } else {
            throw new Exception("Queue underflow");
        }
    }

    public int front(){
        return this.numbersArray.get(0);
    }

    public int rear(){
        return this.numbersArray.get(this.numbersArray.size() - 1);
    }
}
