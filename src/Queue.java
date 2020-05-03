import java.util.ArrayList;

public class Queue {
    private final ArrayList<Integer> numbersArray;

    public Queue(){
        this.numbersArray = new ArrayList<>();
    }

    public void push(int number){
        this.numbersArray.add(number);
    }

    public int pop(){
        return this.numbersArray.remove(this.numbersArray.size() - 1);
    }
}
