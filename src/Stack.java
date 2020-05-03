import java.util.ArrayList;

public class Stack {
    private final ArrayList<Integer> arrayList;
    public Stack(){
        this.arrayList = new ArrayList<>();
    }

    public void push(int number){
        this.arrayList.add(number);
    }

    public int pop(){
        if(!this.isEmpty()) {
            return this.arrayList.remove(this.arrayList.size() - 1);
        }
        return -1;
    }

    public int peek(){
        if(!this.isEmpty()) {
            return this.arrayList.get(this.arrayList.size() - 1);
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.arrayList.size() <= 0;
    }
}
