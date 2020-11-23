import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * KeyListener와 MouseListener를 구현한 Panel 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.23)
 */
public class MyHelloPanelListener extends JPanel implements KeyListener, MouseListener
{
    JLabel ml = new JLabel("Hello");
    
    public MyHelloPanelListener(){
        this.setLayout(null);
        this.setFocusable(true);
        ml.setLocation(50,50);
        ml.setSize(100,20);
        this.add(ml);
        addKeyListener(this);
        addMouseListener(this);
    }
    
    public void keyPressed(KeyEvent e){
        int keycode = e.getKeyCode();
        switch(keycode){
            case KeyEvent.VK_UP:
            ml.setLocation(ml.getX(), ml.getY()-10);
            ml.setText("(" + ml.getX() + "," +ml.getY() + ")");
            break;
            case KeyEvent.VK_DOWN:
            ml.setLocation(ml.getX(), ml.getY()+10);
            ml.setText("(" + ml.getX() + "," +ml.getY() + ")");
            break;
            case KeyEvent.VK_LEFT:
            ml.setLocation(ml.getX()-10, ml.getY());
            ml.setText("(" + ml.getX() + "," +ml.getY() + ")");
            break;
            case KeyEvent.VK_RIGHT:
            ml.setLocation(ml.getX()+10, ml.getY());
            ml.setText("(" + ml.getX() + "," +ml.getY() + ")");
            break;
        }
    }
    
    public void keyReleased(KeyEvent e){
    }
    
    public void keyTyped(KeyEvent e){
    }
    
    public void mouseEntered(MouseEvent e)
    {
        ml.setText("Start");
        this.setBackground(Color.YELLOW);
    }
    
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        ml.setLocation(x, y);
        ml.setText("(" + e.getX() + "," + e.getY() + ")");
    }
    
    public void mouseExited(MouseEvent e)
    {
        ml.setText("End");
        this.setBackground(Color.GRAY);
    }
    
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}

