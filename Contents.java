import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyListener;
  

public class Contents extends JPanel implements ActionListener{
  private Image dude;
  private int x=100,y=100;
  private Timer t;
  
  public Contents(){
    super.setDoubleBuffered(true);
    t=new Timer(7,this); //machine said 20
    t.start();
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    ImageIcon ii = new ImageIcon(this.getClass().getResource("stickman.jpeg"));
    dude = ii.getImage();
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawImage(dude, x, y, null);// Draws the image at (50, 50)
    //Color myColor= new Color(234,23,56); // creating your own color
    //g2d.setColor(Color.green);
    //g2d.drawOval(100, 100, 100, 200);
    //g2d.setColor(myColor);
    //g2d.fillOval(400, 400, 100, 100);
  }

  public void keyPressed(KeyEvent e) {

      int key = e.getKeyCode();

      if (key == KeyEvent.VK_LEFT) {
          x = -1;
      }

      if (key == KeyEvent.VK_RIGHT) {
          x = 1;
      }

      if (key == KeyEvent.VK_UP) {
          y = -1;
      }

      if (key == KeyEvent.VK_DOWN) {
          y = 1;
      }
  }

  //public void keyReleased(KeyEvent e) {

  int xV=1;
  int yV=1;

  public void move(){
    x+=xV;
    y+=yV;
    
  }

  public void actionPerformed(ActionEvent e){
    move();
    if (x==0){
      xV=1;
    } else if(x==900){
      xV=-1;
    }
    if (y==0){
      yV=1;
    } else if(y==600){
      yV=-1;
    }
    repaint();
  }
}
 
