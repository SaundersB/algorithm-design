public class QuickSort {
    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static int pivot(int[] array, int startIndex, int endIndex){
        int pivot = array[startIndex];
        int swapIndex = startIndex;
        for(int i = startIndex + 1; i < array.length; i++){
            if(pivot > array[i]){
                swapIndex++;
                array = swap(array, swapIndex, i);
            }
        }
        swap(array, startIndex, swapIndex);
        return swapIndex;
    }

    public static int[] quickSort(int[] array, int left, int right){
        if(left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
        return array;
    }
}
