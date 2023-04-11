package contact;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException.*;


public class Options extends JFrame implements ActionListener  {
	JButton add,update,view,delete,exit;
	
	Options(){
		getContentPane().setBackground(Color.MAGENTA);
		setLayout(null);
		
		JLabel heading = new JLabel("CONTACTS");
		heading.setBounds(270,20,300,60);
		heading.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		Font buttonfont = new Font("West Java",Font.BOLD,24);
		
		add = new JButton("Add Contact");
		add.setBounds(250,100,300,60);
		add.setFont(buttonfont);
		add.setBackground(Color.ORANGE);
		add.setForeground(Color.WHITE);
		add.addActionListener(this);
		add(add);
		
		update = new JButton("Update Contact");
		update.setBounds(250,180,300,60);
		update.setFont(buttonfont);
		update.setBackground(Color.ORANGE);
		update.setForeground(Color.WHITE);	
		update.addActionListener(this);
		add(update);
		
		view = new JButton("View Contact");
		view.setBounds(250,260,300,60);
		view.setFont(buttonfont);
		view.setBackground(Color.ORANGE);
		view.setForeground(Color.WHITE);
		view.addActionListener(this);
		add(view);
		
		delete = new JButton("Delete Contact"); 
		delete.setBounds(250,340,300,60);
		delete.setFont(buttonfont);
		delete.setBackground(Color.ORANGE);
		delete.setForeground(Color.WHITE);
		delete.addActionListener(this);
		add(delete);
		
		exit = new JButton("Exit");
		exit.setBounds(300,450,180,40);
		exit.setFont(buttonfont);
		exit.setBackground(Color.ORANGE);
		exit.setForeground(Color.WHITE);
		exit.addActionListener(this);
		add(exit);
		
		setSize(800,600);
		setLocation(380, 120);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		//setVisible(false);
		if (ae.getSource()== add) {
			this.setVisible(false);
			try {
				new Add();
				this.setVisible(false);
			}catch(Exception ioe) {
				ioe.printStackTrace();
			}
		}
		else if (ae.getSource()== update) {
			this.setVisible(false);
			/*try {
				//new Update();
			}catch(Exception ioe) {
				ioe.printStackTrace();
			}*/
		}
		else if (ae.getSource()== view) {
			this.setVisible(false);
			/*try {
				
			}catch(Exception ioe) {
				ioe.printStackTrace();
			}*/
		}
		else if (ae.getSource()== delete) {
			this.setVisible(false);
			try {
				new Delete();
			}catch(Exception ie) {
				ie.printStackTrace();
			}
		}
		else {
			setVisible(false);
			try {
				new Login();
				this.setVisible(false);
			}catch(Exception ioe) {
				ioe.printStackTrace();
			}
		}
		
			
		}
	public static void main(String[] args) {
		new Options();
		
	}
}
