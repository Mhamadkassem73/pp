package jFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;


     public class Enters extends JFrame implements ActionListener{
    	 
    	 
    	 JLabel e1,e2,e3,e4,e5;
    	 JTextField tt1,tt2,tt3,tt4,tt5;
    	 JButton btn2;
    	 Enters()
    	 {
    		 JFrame frameE=new JFrame("entrer ...");
    		 JLabel e1 = new JLabel("your name");
    		 JLabel e2 = new JLabel("your addres");
    		 JLabel e3 = new JLabel("your phone nb");
    		 JLabel e4 = new JLabel("your moyenne");
    		 JLabel e5 = new JLabel("your email");
    		 JButton btn2 = new JButton("ok");
    		 JTextField tt1 = new JTextField();
    		 JTextField tt2 = new JTextField();
    		 JTextField tt3 = new JTextField();
    		 JTextField tt4 = new JTextField();
    		 JTextField tt5 = new JTextField();
    		  e1.setBounds(80, 30, 400, 30);
    		  e2.setBounds(80, 60, 200, 30);
    		  e3.setBounds(80, 90, 200, 30);
    		  e4.setBounds(80, 120, 400, 30);
    		  e5.setBounds(80, 150, 200, 30);
    		  tt1.setBounds(300, 30, 200, 30);
    		  tt2.setBounds(300, 60, 200, 30);
    		  tt3.setBounds(300, 90, 200, 30);
    		  tt4.setBounds(300, 120, 200, 30);
    		  tt5.setBounds(300, 150, 200, 30);
    		  btn2.setBounds(200, 200, 100, 50);

			frameE.add(e1);
    		  frameE.add(e2);
    		  frameE.add(e3);
    		  frameE.add(e4);
    		  frameE.add(e5);


    		  frameE.add(tt1);
    		  frameE.add(tt2);
    		  frameE.add(tt3);
    		  frameE.add(tt4);
    		  frameE.add(tt5);
    		  frameE.add(btn2);

    		  frameE.setSize(600,400);
    		  frameE.setLayout(null);
    		  frameE.setVisible(true);
    	 }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

     public static void main(String[] args) {
    	  new Enters();
    	 }}
