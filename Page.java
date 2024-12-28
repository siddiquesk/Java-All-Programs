import java.util.*;
import javax.swing.*;
import java.awt.*;

class Page extends JFrame {
    JLabel l1, l2;
    JLabel name, fname, gender, country, state, mstatus, email, address, pincode;
    JTextField tname, tfname, tcountry, tstate, temail, taddress, tpincode;
    JRadioButton male, female;
    ButtonGroup m1;
    JRadioButton married, unmarried, other;
    ButtonGroup m2;
	JButton b1;

    Page() {
        setLayout(null); // This is necessary when using setBounds
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L) + 1000L;

        l1 = new JLabel("APPLICATION FORM NO: " + random);
        l1.setFont(new Font("Raleway", Font.BOLD, 35));
        l1.setBounds(120, 20, 600, 35);
        add(l1);

        l2 = new JLabel("Page 1 : Personal Details");
        add(l2);
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(200, 70, 400, 34);

        name = new JLabel("Name:");
        add(name);
        name.setBounds(100, 140, 200, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 19));

        tname = new JTextField();
        add(tname);
        tname.setBounds(300, 140, 300, 30);
        tname.setFont(new Font("Raleway", Font.BOLD, 15));

        fname = new JLabel("Father's Name:");
        add(fname);
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 19));

        tfname = new JTextField();
        add(tfname);
        tfname.setBounds(300, 190, 300, 30);
        tfname.setFont(new Font("Raleway", Font.BOLD, 15));

        gender = new JLabel("Gender:");
        add(gender);
        gender.setBounds(100, 240, 200, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 19));

        male = new JRadioButton("Male");
        add(male);
        male.setBounds(300, 240, 100, 30);
        male.setForeground(Color.BLACK);
        male.setBackground(Color.WHITE);

        female = new JRadioButton("Female");
        add(female);
        female.setBounds(450, 240, 130, 30);
        female.setForeground(Color.BLACK);
        female.setBackground(Color.WHITE);

        m1 = new ButtonGroup();
        m1.add(male);
        m1.add(female);

        mstatus = new JLabel("Marital status:");
        add(mstatus);
        mstatus.setBounds(100, 290, 200, 30);
        mstatus.setFont(new Font("Raleway", Font.BOLD, 19));

        married = new JRadioButton("Married");
        unmarried = new JRadioButton("Unmarried");
        other = new JRadioButton("Other");
        add(married);
        add(unmarried);
        add(other);
        married.setBounds(300, 290, 100, 30);
        unmarried.setBounds(400, 290, 100, 30);
        other.setBounds(500, 290, 100, 30);

        m2 = new ButtonGroup();
        m2.add(married);
        m2.add(unmarried);
        m2.add(other);

        country = new JLabel("Country Name:");
        add(country);
        country.setBounds(100, 340, 200, 30);
        country.setFont(new Font("Raleway", Font.BOLD, 19));

        tcountry = new JTextField();
        add(tcountry);
        tcountry.setBounds(300, 340, 300, 30);
        tcountry.setFont(new Font("Raleway", Font.BOLD, 15));

        state = new JLabel("State:");
        add(state);
        state.setBounds(100, 390, 200, 30);
        state.setFont(new Font("Raleway", Font.BOLD, 19));

        tstate = new JTextField();
        add(tstate);
        tstate.setBounds(300, 390, 300, 30);
        tstate.setFont(new Font("Raleway", Font.BOLD, 15));

        email = new JLabel("Your Email:");
        add(email);
        email.setBounds(100, 440, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 19));

        temail = new JTextField();
        add(temail);
        temail.setBounds(300, 440, 300, 30);
        temail.setFont(new Font("Raleway", Font.BOLD, 15));

        address = new JLabel("Address:");
        add(address);
        address.setBounds(100, 490, 200, 30);
        address.setFont(new Font("Raleway", Font.BOLD, 19));

        taddress = new JTextField();
        add(taddress);
        taddress.setBounds(300, 490, 300, 30);
        taddress.setFont(new Font("Raleway", Font.BOLD, 15));

        pincode = new JLabel("Pincode:");
        add(pincode);
        pincode.setBounds(100, 540, 200, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 19));

        tpincode = new JTextField();
        add(tpincode);
        tpincode.setBounds(300, 540, 300, 30);
        tpincode.setFont(new Font("Raleway", Font.BOLD, 15));
		
		b1 = new JButton("Next");
		add(b1);
		b1.setBounds(500,600,100,35);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 700);
        setVisible(true);
        setLocation(100, 10);
        setTitle("Bank management system");
    }

    public static void main(String args[]) {
        new Page();
    }
}

	
