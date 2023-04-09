package contact;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
	JButton Login;
	JButton exit;
	JTextField username;
	JTextField passw;
	Login(){
		
		JLabel heading=new JLabel("ACCOUNT_LOGIN");
		setLayout(null);
		heading.setBounds(230,10,300,100);
		heading.setFont(new Font("Times New Roman",Font.BOLD,25));
		heading.setForeground(Color.WHITE);
		add(heading);
		
		JLabel uname=new JLabel("USER_NAME");
		uname.setBounds(50,70,200,200);
		uname.setFont(new Font("Times New ROman",Font.BOLD,18));
		uname.setForeground(Color.white);
		add(uname);
		
		username=new JTextField();
		username.setBounds(30,200,400,30);
		add(username);
		
		JLabel password=new JLabel("PASSWORD");
		password.setBounds(50,170,200,200);
		password.setFont(new Font("Times New ROman",Font.BOLD,18));
		password.setForeground(Color.WHITE);
		add(password);
		
		passw=new JTextField();
		passw.setBounds(30,300,400,30);
		add(passw);
		
		Login=new JButton("LOGIN");
		Login.setBounds(500,500,70,30);
		Login.setBackground(Color.ORANGE);
		Login.setForeground(Color.BLACK);
		Login.addActionListener(this);
		add(Login);
		
	    exit=new JButton("EXIT");
		exit.setBounds(50,500,70,30);
		exit.setBackground(Color.ORANGE);
		exit.setForeground(Color.BLACK);
		exit.addActionListener(this);
		add(exit);
		
		
		
		setVisible(true);
		setSize(700,700);
		setLocation(300,50);
		getContentPane().setBackground(Color.BLUE);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==Login) {
			String user=username.getText();
			String pas=passw.getText();
			String u=new String("Rakesh");
			String p=new String("123456");
			if(user.equals(u) && pas.equals(p)) {
				//new Contact(user,pas);
				new Options();
				setVisible(false);
			}
			else {
				//new Wrong();
				JOptionPane.showMessageDialog(null,"Wrong Credentials");
				setVisible(true);
			}
		
	}else if(ae.getSource()==exit) {
		setVisible(false);
	}
	}
	public static void main(String[] args) {
		new Login();
	}

}






