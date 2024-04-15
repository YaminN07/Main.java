public class RecursiveSearchSort {
    public static int[] createRanIntArray(){
        int[] ints= new int[(int) Math.random()];
        for(int i=0; i < ints.length; i++){
            ints[i] = (int) Math.random();
        }
        return ints;
    }
    public static int binarySearch(int[] arr, int left, int right, int target)
    {
        int middle = (left + right) / 2;
        if (target == arr[middle]) return middle;
        if (right < left) return -1;
        if (target < arr[middle])
            return binarySearch(arr, left, middle - 1, target);
        if (target > arr[middle])
            return binarySearch(arr, middle + 1, right, target);
        return -1;
    }

}
