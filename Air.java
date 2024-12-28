

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Air extends JFrame implements ActionListener
{
  JLabel username,password;
  JTextField tname;
  JPasswordField tpassword;
  JButton reset,submit,cancel;

  Air()
  {
	  setLayout(null);
	  
	  username=new JLabel("Username");
	  username.setBounds(40,30,150,25);
	  username.setFont(new Font("Tohma",Font.BOLD,18));
	  add(username);
	  
	  password=new JLabel("Password");
	 password.setBounds(40,80,150,25);
	  password.setFont(new Font("Tohma",Font.BOLD,18));
	  add(password);
	  
	  
	  tname=new JTextField();
	  tname.setBounds(150,30,200,25);
	  add(tname);
	  
	
	  tpassword=new JPasswordField();
	  tpassword.setBounds(150,80,200,25);
	  add(tpassword);
	  
	  reset = new JButton("Reset");
	  reset.setBounds(60,180,140,25);
	  reset.addActionListener(this);
	  add(reset);
	  
	   submit = new JButton("Submit");
	  submit.setBounds(220,180,140,25);
	  submit.addActionListener(this);
	  add(submit);
	  
	  	   cancel= new JButton("Cancel");
	  cancel.setBounds(120,220,160,25);
	  cancel.addActionListener(this);
	  add(cancel);
	  
	  
	  getContentPane().setBackground(Color.WHITE);
	  setSize(470,350);
	  setLocation(200,100);
	  setVisible(true);
	  
	  
  }
  
  public void actionPerformed(ActionEvent e1)
  {
	  if(e1.getSource()==reset)
	  {
		  tname.setText("");
		  tpassword.setText("");
	  }
	  else if(e1.getSource()==cancel)
	  {
		  setVisible(false);
		  
	  }
	  else if(e1.getSource()==submit)
	  {
		  new Home();
		  
	  }
	  
  }

public static void main(String args[])
{

   new Air();

}



}