package jFrame;

import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
public class JFrameExample {  
    public static void main(String s[]) {  
        JFrame framee = new JFrame("welcome");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("");  
        JButton button = new JButton();  
        button.setText("tu es un etudians");
        JButton button1 = new JButton();  
        button1.setText("tu es un Employee");
        button1.setBounds(100,100, 100, 50);
        button.setBounds(100, 100, 100, 100);

        panel.add(label);  
        panel.add(button); 
        panel.add(button1);
        framee.add(panel);  
        framee.setSize(400, 300);  
        framee.setLocationRelativeTo(null);  
        framee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        framee.setVisible(true);  
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}  
} 