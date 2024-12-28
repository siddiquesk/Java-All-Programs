

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Book extends JFrame implements ActionListener
{
  JLabel username,password,uname;
  JTextField tname;
  JPasswordField tpassword;
  JButton reset,submit,cancel;

  Book()
  {
	  setLayout(null);
	  
	  username=new JLabel("AirLine System");
	  username.setBounds(100,10,200,30);
	  username.setFont(new Font("Tohma",Font.PLAIN,20));
	  username.setBackground(Color.RED);
	  add(username);
	  
	  uname=new JLabel("Username");
	  uname.setBounds(40,40,150,25);
	  uname.setFont(new Font("Tohma",Font.PLAIN,18));
	  add(uname);
	  
	  password=new JLabel("Password");
	 password.setBounds(40,80,150,25);
	  password.setFont(new Font("Tohma",Font.PLAIN,18));
	  add(password);
	  
	  
	  tname=new JTextField();
	  tname.setBounds(150,40,150,25);
	  add(tname);
	  
	
	  tpassword=new JPasswordField();
	  tpassword.setBounds(150,80,150,25);
	  add(tpassword);
	  
	  reset = new JButton("Reset");
	  reset.setBounds(60,180,140,25);
	  reset.addActionListener(this);
	  add(reset);
	  
	   submit = new JButton("Submit");
	  submit.setBounds(210,180,140,25);
	  submit.addActionListener(this);
	  add(submit);
	  
	  	   cancel= new JButton("Cancel");
	  cancel.setBounds(100,220,140,25);
	  cancel.addActionListener(this);
	  add(cancel);
	  
	  
	  getContentPane().setBackground(Color.WHITE);
	  setSize(400,350);
	  setLocation(200,100);
	  setVisible(true);
	  
	  
  }
  
  public void actionPerformed(ActionEvent e1)
  {
	
	  
  }

public static void main(String args[])
{

   new Book();

}



}