import java.util.Arrays;

public class MergeSort {
    private static int[] merge(int[] firstArray, int[] secondArray){
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

    public static void main(String[] args) {
        System.out.println("Testing the merge function");
        int[] firstArray = {4, 5, 6, 7};
        int[] secondArray = {1, 2, 3, 3};
        int[] result = MergeSort.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(result));
    }
}
