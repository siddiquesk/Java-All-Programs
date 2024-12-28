

import javax.swing.*;
import java.awt.*;

class Topic extends JFrame
{
	JLabel l1;
	
	Topic(String s1)
	{
		super(s1);
		
		

	}
	Topic()
	{
		
	}
	void setFun()
	{
		setLayout(null);
		l1 = new JLabel("Page:2 Additional Details");
		add(l1);
		setBounds(100,40,350,30);
		l1.setFont(new Font("Raleway", Font.BOLD, 35));
	
		
	}
	
public static void main(String args[])
{
	     Topic s1 = new Topic("Page:2 Additional details");
		  setLayout(null);
        s1.setSize(700, 600);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s1.setLocation(100,0);
        s1.setFun();
        s1.setVisible(true);
	
}


}


