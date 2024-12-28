//introduction to gui (graphical user interface)
//two method 1)awt   2)swing-->sabke aage j laga hoga like jframe,jbutton.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Loginscreen extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2,b3;

    Loginscreen(String s1) {
        super(s1);
    }

    Loginscreen() {
    }

    void setComponents() {
		
		Cursor c1=new Cursor(Cursor.HAND_CURSOR);
		Cursor c2=new Cursor(Cursor.HAND_CURSOR);
		Cursor c3=new Cursor(Cursor.HAND_CURSOR);
		
		Font f1=new Font("Times New Roman",Font.BOLD,30);
		Font f2=new Font("Arial ",Font.BOLD,20);
		Font f3=new Font("Arial ",Font.BOLD,20);
		Font f4=new Font("Arial ",Font.BOLD,22);
		
        l1 = new JLabel("Welcome to Coding Seekho");
		l1.setFont(f1);
		l1.setForeground(Color.blue);
        l2 = new JLabel("User Name");
		l2.setFont(f2);
        l3 = new JLabel("Password");
		l3.setFont(f3);
        l4 = new JLabel();
		l4.setFont(f4);
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
		b1.setCursor(c1);
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
        b2 = new JButton("Clear");
		b2.setCursor(c2);
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b3=new JButton("Add");
		b3.setCursor(c3);
		b3.setForeground(Color.white);
		b3.setBackground(Color.black);
		
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
		add(b3);
        l1.setBounds(145, 60, 400, 40);
        l2.setBounds(180, 200, 200, 30);
        l3.setBounds(175, 350, 170, 30);
        l4.setBounds(150, 550, 170, 30);
        t1.setBounds(350, 200, 100, 30);
        t2.setBounds(350, 350, 100, 30);
        b1.setBounds(200, 450, 100, 30);
        b2.setBounds(400, 450, 100, 30);
		b3.setBounds(500,550,100,30);
		b1.addActionListener(new log());
		b2.addActionListener(new Clear1());
		b3.addActionListener(new Add());
    }

    public static void main(String args[]) {
        Loginscreen s1 = new Loginscreen("Welcome to STP Computer");
        s1.setSize(700, 700);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.setComponents();
        s1.setVisible(true);
    }
	
	class log implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			if(s1.equals("sufiyan") && s2.equals("shaikh"))
			{
			 l4.setText("login successful");	
			}
			else
			{
				l4.setText("Login unsucessful");
			}
		}
		
	}
	
	
	class Clear1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
		{
			t1.setText("");
			t2.setText("");
		}
		
	}
	
	class Add implements ActionListener
	{
		public void actionPerformed(ActionEvent e2)
		{
			try{
				int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			l4.setText("Addition is "+c);
			 
			}
			catch(Exception e1)
			{
				l4.setText("please enter  number only");
			}
			
			}
		
	}
	
}