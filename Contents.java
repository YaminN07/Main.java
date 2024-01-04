import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Contents extends JPanel{
  private Image dude;
  
  public Contents(){
    super.setDoubleBuffered(true);
  }
  public void paintComponent(Graphics g){
     ImageIcon ii = new ImageIcon(this.getClass().getResource("stickman.jpeg"));
    dude = ii.getImage();
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawImage(dude, 50, 50, null); // Draws the image at (50, 50)
    //Color myColor= new Color(234,23,56); // creating your own color
    //g2d.setColor(Color.green);
    //g2d.drawOval(100, 100, 100, 200);
    //g2d.setColor(myColor);
    //g2d.fillOval(400, 400, 100, 100);
  }
  
}
 
