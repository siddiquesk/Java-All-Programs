

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Home extends JFrame 
{


  Home()
  {
	 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
	 JLabel l1=new JLabel(i1);
	 l1.setBounds(0,0,1300,760);
	 add(l1);
	 
	 JLabel heading=new JLabel("AIR INDIA WELCOMES YOU");
	 heading.setBounds(440,20,600,30);
	  heading.setFont(new Font("Raleway",Font.BOLD,30));
	   heading.setForeground(Color.RED);
	   l1.add(heading);
	   
	 JMenuBar menu=new JMenuBar();
       setJMenuBar(menu);
       
       JMenu details=new JMenu("Details");
       menu.add(details);
       
        JMenuItem flightdetails=new JMenuItem("Flight Details");
        details.add(flightdetails);
	  
	  
	   JMenuItem bookflight=new JMenuItem("Book Flight");
        details.add(bookflight);
		
		JMenuItem customer=new JMenuItem("Customer Details");
        details.add(customer);
		
		 JMenuItem ticket=new JMenuItem("Ticket Check");
        details.add(ticket);
		
		 JMenuItem cancel=new JMenuItem("Cancel Ticket");
        details.add(cancel);
	  
	  setExtendedState(JFrame.MAXIMIZED_BOTH);
         setVisible(true);
	  
  }

public static void main(String args[])
{

   new Home();

}



}