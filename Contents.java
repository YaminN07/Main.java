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
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Contents extends JPanel implements ActionListener, KeyListener{
    private Image dude;
    private Timer t=new Timer(7,this);
    double x = 0, y = 0, velx = 0, vely = 0;

    public Contents() {
        super.setDoubleBuffered(true);
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }


    public void paintComponent(Graphics g){

        super.paintComponent(g);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("stickman.jpeg"));
        dude = ii.getImage();
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
        //g2.drawImage(dude, x, y, null);// Draws the image at (50, 50)
        //Color myColor= new Color(234,23,56); // creating your own color
        //g2d.setColor(Color.green);
        //g2d.drawOval(100, 100, 100, 200);
        //g2d.setColor(myColor);
        //g2d.fillOval(400, 400, 100, 100);
    }

   /* public void keyPressed() {



        if (KeyEvent.VK_LEFT) {
            x = -1;
        }

        if (KeyEvent.VK_RIGHT) {
            x = 1;
        }

        if (KeyEvent.VK_UP) {
            y = -1;
        }

        if (KeyEvent.VK_DOWN) {
            y = 1;
        }
    }*/

    //public void keyReleased(KeyEvent e) {

    int xV=1;
    int yV=1;

    public void move(){
        //x+=xV;
        //y+=yV;
        keyPressed(null);
        repaint();

    }

    public void actionPerformed(ActionEvent e){
        repaint();
        x = velx;
        y = vely;
//
//        move();
//        if (x==0){
//            xV=1;
//        } else if(x==900){
//            xV=-1;
//        }
//        if (y==0){
//            yV=1;
//        } else if(y==600){
//            yV=-1;
//        }
        //repaint();
    }
    public void up() {
        vely += -15;
        velx += 0;
        
    }
    public void down() {
        vely += 15;
        velx += 0;
    }
    public void left() {
        velx += -15;
        vely += 0;
    }
    public void right() {
        velx += 15;
        vely += 0;
    }
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            up();
        }
        if (code == KeyEvent.VK_DOWN) {
            down();
        }
        if (code == KeyEvent.VK_RIGHT) {
            right();
        }
        if (code == KeyEvent.VK_LEFT) {
            left();
        }

    }
    public void keyTyped(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }


}
