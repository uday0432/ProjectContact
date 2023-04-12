package contact;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;

public class Add extends JFrame implements ActionListener{
	private JLabel heading,name,num;
	private JTextField username,number;
	private JButton submit,back;
	private JButton buttons[] = new JButton[2];
	static String name1,number1;
	Font f1 = new Font("Monotype Corsiva",Font.BOLD,50);

	public Add() {
		Color col = new Color(255,153,0);
		this.getContentPane().setBackground(new Color(148,0,211));
		this.setLayout(null);
		this.setTitle("Add Contact");
		
		heading = new JLabel("ADD CONTACT");
		heading.setFont(f1);
		heading.setForeground(new Color(255,189,25));
		heading.setBounds(280,30,400,50);
		this.add(heading);
		
		name = new JLabel("Name: ");
		name.setBounds(300,130,100,50);
		name.setForeground(new Color(0,255,255));
		name.setFont(new Font("Consolas",Font.ITALIC,25));
		this.add(name);
		
		username = new JTextField();
		username.setBounds(400,140,150,30);
		this.add(username);
		
		num = new JLabel("Number:");
		num.setBounds(280,190,100,50);
		num.setFont(new Font("Consolas",Font.ITALIC,25));
		num.setForeground(new Color(0,255,255));
		this.add(num);
		
		number = new JTextField();
		number.setBounds(400,200,150,30);
		this.add(number);
		
		submit = new JButton("Submit");
		submit.setBounds(250,350,130,30);
		submit.setForeground(new Color(0,255,255));
		buttons[0]=submit;
		
		back = new JButton("Back");
		back.setBounds(450,350,130,30);
		back.setForeground(new Color(0,255,255));
		buttons[1]=back;		
		
		for(int i=0;i<2;i++) {
			buttons[i].setBackground(col);
			buttons[i].setFont(new Font("Consolas",Font.BOLD,15));
			buttons[i].setBorder(null);
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
		
		this.setSize(900,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit) {
			if(username.getText().equals("") && number.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Name can not be Empty");
			}else {
				name1 = username.getText();
				number1 = number.getText();
				//System.out.println(number1);
				try {
					new FileCreate();
					//new CreateExcel();
					JOptionPane.showMessageDialog(null,"Successfully Submitted");
					username.setText("");
					number.setText("");
					//this.setVisible(false);
				} catch(Exception ioe) {
					ioe.printStackTrace();
				}
			}
		}
		if(ae.getSource()==back) {
			this.setVisible(false);
			new Options();
		}
	}
	
	public static void main(String[] args) {
		new Add();
	}
}
