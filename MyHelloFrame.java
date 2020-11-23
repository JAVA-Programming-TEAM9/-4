import javax.swing.*;

/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.23)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        this.setTitle("실습#4(2020.11.23");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mp = new MyHelloPanelListener();
        this.setVisible(true);
        this.add(mp);
    }
}
