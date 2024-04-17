public class RecursiveSearchSort {
    public static int[] createRanIntArray(int length){
        int[] ints= new int[length];
        for(int i=0; i < ints.length; i++){
            ints[i] = (int) Math.random()*9;
        }
        return ints;
    }
    public static int binarySearch(int[] ints, int start, int end, int goal)
    {
        int middle = (start + end) / 2;
        if (goal == ints[middle]) return middle;
        if (end < start) return -1;
        if (goal < ints[middle])
            return binarySearch(ints, start, middle - 1, goal);
        if (goal > ints[middle])
            return binarySearch(ints, middle + 1, end, goal);
        return -1;
    }
    public static int[] mergeSort(int[] intArray)
    {
        int n = intArray.length;
        int[] temp = new int[n];
        mergeSortHelper(intArray, 0, n - 1, temp);
        return intArray;
    }
    private static void mergeSortHelper(int[] intArray1, int start, int end, int[] intArray2)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;
            mergeSortHelper(intArray1, start, middle, intArray2);
            mergeSortHelper(intArray1, middle + 1, end, intArray2);
            merge(intArray1, start, middle, end, intArray2);
        }
    }
    private static void merge(int[] intArray1, int start, int mid, int end, int[] intArray2)
    {
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end)
        {
            if (intArray1[i] < intArray1[j])
            {
                intArray2[k] = intArray1[i];
                i++;
            }
            else
            {
                intArray2[k] = intArray1[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            intArray2[k] = intArray1[i];
            i++;
            k++;
        }
        while (j <= end)
        {
            intArray2[k] = intArray1[j];
            j++;
            k++;
        }
        for (k = start; k <= end; k++)
        {
            intArray1[k] = intArray2[k];
        }
    }
    public static int binarySearchIterative(int goal, int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (goal < array[middle]) {
                end = middle - 1;
            }
            if (goal > array[middle]) {
                start = middle + 1;
            }
            if (goal == array[middle]) {
                return middle;
            }
        }
        return -1;
    }
}
