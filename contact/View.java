package contact;
//import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class View extends JFrame {
	
	JLable heading;
	public View(){
		new heading("View Contacts");
		heading.setFont(new Font("Helvetica",Font.Italic,72));
		heading.setBounds(300,50,80,40);
		heading.setForeground(color.Black));

		getContentsPane().setBackground(Color.ORANGE);
		setSize(1000, 500);
		setVisible(true);
		setLocation(300,50);
	}

}
