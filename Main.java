import javax.swing.JFrame;
public class Main {
  public static void main(String[] args) {
    //Maze maze= new Maze();
    JFrame f = new JFrame();
    Contents c = new Contents();
    f.add(c);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(800, 600);
  }
}
 
