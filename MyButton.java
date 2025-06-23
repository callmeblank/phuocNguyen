import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class MyButton {
    public static void main(String[] args){
        MyButton myButtons = new MyButton();
        myButtons.appear();
    }  
    public void appear(){
        JFrame frame = new JFrame(); //default layout manger is BorderLayout
        
        JPanel panel = new JPanel(); //default layout manager is FlowLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // change layout manager to BoxLayout
        panel.setBackground(Color.BLACK);
        
        //add three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        //add panel (stills under control of BorderLayout manager)
        frame.getContentPane().add(BorderLayout.EAST, panel);
    
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    
    }
}
