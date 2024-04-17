import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Random int Array Method");
    System.out.println(Arrays.toString(RecursiveSearchSort.createRanIntArray(9)));

    System.out.println("Binary Search Method");
    int[] ints = {0,2,4,5,6,7,8,9};
    System.out.println(RecursiveSearchSort.binarySearch(ints,0,8,4));

    System.out.println("Binary Merge Sort Method");
    System.out.println(Arrays.toString(RecursiveSearchSort.mergeSort(RecursiveSearchSort.createRanIntArray(9))));

    System.out.println("Binary Search Method test 2");
    System.out.println(RecursiveSearchSort.binarySearch(RecursiveSearchSort.mergeSort(RecursiveSearchSort.createRanIntArray(9)),0,9,3));

    System.out.println("Binary Search Iterative Method");
    System.out.println(RecursiveSearchSort.binarySearchIterative(2,RecursiveSearchSort.mergeSort(RecursiveSearchSort.createRanIntArray(9))));




//    System.out.println(Recursion.recurseFactorial(10));
//    System.out.println(Recursion.iterateFactorial(10));
//    System.out.println(Recursion.resurseString("Hello World"));
//    int[] ints = {1,2,34,5,50};
//    System.out.println(Recursion.resureseArray(ints,0));
//    ArrayList<Integer> intgrid = new ArrayList<>();
//    intgrid.add(12); intgrid.add(7); intgrid.add(8); intgrid.add(6); intgrid.add(2);
//    System.out.println(Recursion.resurseArrayList(intgrid,6));

    //Maze maze= new Maze();
//    JFrame f = new JFrame();
//    Contents c = new Contents();
//    f.add(c);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    f.setSize(800, 600);
  }
}
 
