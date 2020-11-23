import javax.swing.*;

/**
 * Frame의 설정값을 지정해주는 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.11.23)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        this.setTitle("실습#4(2020.11.23");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mp = new MyHelloPanelListener();
        this.setVisible(true);
        this.add(mp);
    }
}
