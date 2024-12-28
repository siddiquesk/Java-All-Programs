
import javax.swing.*;
import java.awt.*;
   class Aswing extends JFrame
{
	Aswing()
	{
		
		JLabel l1=new JLabel("Application Page :2");
		l1.setBounds(200,30,400,30);
		l1.setFont(new Font("Raleway",Font.BOLD,25));
		add(l1);
		
		JLabel religion=new JLabel("Religion:");
		religion.setBounds(90,100,130,20);
		religion.setFont(new Font("Raleway",Font.BOLD,20));
		add(religion);
		
		String valreligion[]={"Hindu","Muslim","Sikh","Jain","Other"};
		JComboBox treligion = new JComboBox(valreligion);
		treligion.setBounds(220,100,350,25);
		treligion.setBackground(Color.WHITE);
		treligion.setForeground(Color.BLACK);
		add(treligion);
		
		
		JLabel category=new JLabel("Category:");
		category.setBounds(90,150,130,20);
		category.setFont(new Font("Raleway",Font.BOLD,20));
		add(category);
		
			String valcategory[]={"OBC","SC","ST","GENERAL","Other"};
		JComboBox tcategory = new JComboBox(valcategory);
		tcategory.setBounds(220,150,350,25);
		tcategory.setBackground(Color.WHITE);
		tcategory.setForeground(Color.BLACK);
		add(tcategory);
		
		 JLabel education = new JLabel("Education:");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(90, 190, 150, 20);
        add(education);
		
		    String valeducation[] = {"10th", "12th", "Graduation", "Post Graduation", "Other"};
       JComboBox teducation = new JComboBox(valeducation);
        teducation.setBackground(Color.white);
        teducation.setForeground(Color.black);
        teducation.setBounds(220, 190, 350, 25);
        add(teducation);
		
		JLabel pan=new JLabel("PanCard:");
		pan.setBounds(90,230,100,20);
		pan.setFont(new Font("Raleway",Font.BOLD,20));
		add(pan);
		
		JTextField tpan=new JTextField();
		tpan.setBounds(220,230,350,25);
		add(tpan);
		
			JLabel adhar=new JLabel("Adhar:");
		adhar.setBounds(90,270,100,20);
		adhar.setFont(new Font("Raleway",Font.BOLD,20));
		add(adhar);
		
		JTextField tadhar=new JTextField();
		tadhar.setBounds(220,270,350,25);
		add(tadhar);
		
		JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(90, 320, 200, 20);
        add(citizen);
		
		JRadioButton b1=new JRadioButton("Yes");
		 b1.setBounds(250, 320, 100, 26);
        b1.setFont(new Font("Raleway", Font.BOLD, 18));
        b1.setBackground(Color.white);
        add(b1);
		
		JRadioButton b2=new JRadioButton("No");
		 b2.setBounds(370, 320, 100, 26);
        b2.setFont(new Font("Raleway", Font.BOLD, 18));
        b2.setBackground(Color.white);
        add(b2);
		
		  JButton next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.setBounds(400,500, 120, 35);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        add(next);
		
		
		setLayout(null);
	   
		setSize(700,700);
        setTitle("Bank management system");  
		setLocation(200,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	
	}
	
	
public static void main(String args[])
{
       new Aswing();
	   
	     
	

	
}


}