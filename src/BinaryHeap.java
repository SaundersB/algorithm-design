import java.util.ArrayList;

public class BinaryHeap {
    private final ArrayList<Integer> values;

    public BinaryHeap(){
        this.values = new ArrayList<>();
    }

    public void insert(int value){
        this.values.add(value);
        this.bubbleUp();
    }

    public void bubbleUp(){
        int index = this.values.size() - 1;
        int element = this.values.get(index);
        while(true){
            int parentIndex = (int) Math.floor(index >> 1);
            int parent = this.values.get(parentIndex);
            if(element <= parent) {
                break;
            }
            this.values.set(parentIndex, element);
            this.values.set(index,parent);
            index = parentIndex;
        }
    }

    public int[] getValues() {
        return ArrayManipulator.arrayListToIntArray(this.values);
    }
}
