import javax.swing.JFrame;

public class Maze extends JFrame{
  public Maze(){
    super("Maze");
    setSize(900,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    add(new Contents());
    setLocationRelativeTo(null);
    setVisible(true);
  }
}
 
