import javax.swing.JFrame;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println(Recursion.recurseFactorial(10));
    System.out.println(Recursion.iterateFactorial(10));
    System.out.println(Recursion.resurseString("Hello World"));
    int[] ints = {1,2,34,5,50};
    System.out.println(Recursion.resureseArray(ints,0));
    ArrayList<Integer> intgrid = new ArrayList<>();
    intgrid.add(12); intgrid.add(7); intgrid.add(8); intgrid.add(6); intgrid.add(2);
    System.out.println(Recursion.resurseArrayList(intgrid,6));













    //Maze maze= new Maze();
//    JFrame f = new JFrame();
//    Contents c = new Contents();
//    f.add(c);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    f.setSize(800, 600);
  }
}
 
