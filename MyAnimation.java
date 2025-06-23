import javax.swing.*;
import java.awt.*;

public class MyAnimation{
    int x = 0;
    int y = 0;
    JFrame frame;
    public void go(){
        frame = new JFrame();

        MyOval myBall = new MyOval();

        frame.setSize(400, 400);
        frame.getContentPane().add(myBall);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //make ball move
        for (int i = 0; i < 200; ++i){
            x++;
            y++;
            myBall.repaint();
            try{
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }
    class MyOval extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.CYAN);
            g.fillOval(x, y, 40, 40);
        }
    }
    public static void main(String[] args){
        MyAnimation myAnimation = new MyAnimation();
        myAnimation.go();
    }
}