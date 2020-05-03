import java.util.ArrayList;

public class StackArray implements StackInterface{
    private final ArrayList<Integer> arrayList;

    private int getMostRecentIndex(){
        return this.arrayList.size() - 1;
    }

    public StackArray(){
        this.arrayList = new ArrayList<>();
    }

    public int push(int number){
        this.arrayList.add(number);
        return this.arrayList.size() - 1;
    }

    public int pop(){
        if(!this.isEmpty()) {
            return this.arrayList.remove(this.getMostRecentIndex());
        }
        return -1;
    }

    public int peek(){
        if(!this.isEmpty()) {
            return this.arrayList.get(this.getMostRecentIndex());
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.arrayList.size() <= 0;
    }
}
