public class ArrayManipulator {
    public static int[] swap(int[] array, int firstIndex, int secondIndex){
        int tempValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempValue;
        return array;
    }
}
