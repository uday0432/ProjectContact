package contact;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
//import java.io.IOException;

public class Delete extends JFrame implements ActionListener {
	
	JLabel heading;
	JButton yes,no;
	File file;
	
	public Delete() {
		
		file = new File(FileCreate.filename);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		heading = new JLabel("Delete "+file+" ?");
		heading.setBounds(80,40,350,50);
		heading.setFont(new Font("Consolas",Font.BOLD,30));
		heading.setForeground(Color.red);
		add(heading);
		
		yes= new JButton("YES");
		yes.setBounds(100,170,100,40);
		yes.setBackground(Color.CYAN);
		yes.setFocusable(false);
		yes.addActionListener(this);
		add(yes);
		
		no= new JButton("NO");
		no.setBounds(270,170,100,40);
		no.setBackground(Color.CYAN);
		no.setFocusable(false);
		no.addActionListener(this);
		add(no);
		
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==yes) {
				if(file.delete()) {
					JOptionPane.showMessageDialog(null,FileCreate.filename+" Deleted");
					new Options();
				}
				else {
					JOptionPane.showMessageDialog(null,"No such file Exists");
				}
			}
			if(ae.getSource()==no) {
				setVisible(false);
				new Options();
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Delete();
	}

}
