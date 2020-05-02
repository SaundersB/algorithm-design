import java.util.Arrays;

public class MergeSort {
    /**
     * Merge two sorted arrays.
     * O(n + m) => O(n)
     * @param firstArray
     * @param secondArray
     * @return
     */
    public static int[] merge(int[] firstArray, int[] secondArray){
        int firstArraySize = firstArray.length;
        int secondArraySize = secondArray.length;
        int[] result = new int[firstArraySize + secondArraySize];
        int firstCount = 0;
        int secondCount = 0;
        int resultCount = 0;
        while(firstCount < firstArray.length && secondCount < secondArray.length){
            if(firstArray[firstCount] < secondArray[secondCount]){
                result[resultCount] = firstArray[firstCount];
                firstCount++;
            } else {
                result[resultCount] = secondArray[secondCount];
                secondCount++;
            }
            resultCount++;
        }
        while(firstCount < firstArraySize){
            result[resultCount] = firstArray[firstCount];
            firstCount++;
            resultCount++;
        }
        while(secondCount < secondArraySize){
            result[resultCount] = secondArray[secondCount];
            secondCount++;
            resultCount++;
        }

        return result;
    }

    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }
        int middleIndex = (int)Math.floor(array.length / 2);
        int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        int[] rightArray = Arrays.copyOfRange(array, middleIndex, array.length);
        int[] left = mergeSort(leftArray);
        int[] right = mergeSort(rightArray);
        return merge(left, right);
    }
}
