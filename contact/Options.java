package contact;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Options extends JFrame implements ActionListener  {
	JButton add;
	JButton update;
	JButton view;
	JButton delete;
	Options(){
		JLabel heading = new JLabel("CONTACTS");
		setLayout(null);
		
		heading.setBounds(50,50,300,50);
		heading.setFont(new Font("Cooper",Font.BOLD,26));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		add = new JButton("Add Contact");
		add.setBounds(50,100,120,30);
		add.setBackground(Color.WHITE);
		add.setForeground(Color.BLACK);
		add.addActionListener(this);
		add(add);
		
		update = new JButton("Update Contact");
		
		update.setBounds(50,150,120,30);
		update.addActionListener(this);
		add(update);
		
		view = new JButton("View Contact");
		view.setBounds(50,200,120,30);
		view.addActionListener(this);
		add(view);
		
		delete = new JButton("Delete Contact"); 
		delete.setBounds(50,250,120,30);
		delete.addActionListener(this);
		add(delete);
		
		getContentPane().setBackground(Color.WHITE);
		//setLayout(null);
		setSize(1100,600);
		setLocation(200, 120);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource()== add) {
			try {
				this.setVisible(false);
				new Add();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if (ae.getSource()== update) {
			this.setVisible(false);
			//Update Class Constructor
		}
		if (ae.getSource()== view) {
			this.setVisible(false);
			//View Class Constructor
		}
		if (ae.getSource()== delete) {
			this.setVisible(false);
			new Delete();
		}
		}
	public static void main(String[] args) {
		new Options();
		
	}
}
