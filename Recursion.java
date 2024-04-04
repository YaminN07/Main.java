import java.util.ArrayList;

public class Recursion {
    public static int recurseFactorial(int x){
        if (x == 1) return 1;
        return x * recurseFactorial(x - 1);
    }
    public static int iterateFactorial(int x){
        int y = 1;
        for(int i=x; x<0;x--){
            y = y * i;
        }
        return y;
    }
    public static String resurseString( String str){
        if(str.length() == 0) return "";
        return str.substring(0,1) + resurseString(str.substring(1));
    }
    public static int resureseArray(int[] arr, int index){
        if(arr.length - 1 == index) return arr[index];
        return arr[index] + resureseArray(arr , index +1);
    }
    public static int resurseArrayList(ArrayList<Integer> ints, int x){
        if(x == 1) return ints.get(0);
        int i = ints.get(0) + resurseArrayList(ints,x-1);
        return i;
    }
}

