package contact;
import java.io.*;

import javax.swing.JOptionPane;



public class View {
	public View() throws IOException{
			File file = new File(FileCreate.filename);
			
			if(file.exists()) {
				ProcessBuilder pb = new ProcessBuilder("Notepad.exe", FileCreate.filename);
				pb.start();
				//file.destroy();
		}
			else {
				JOptionPane.showMessageDialog(null,"File Doesnot Exist!");
			}
		
	}
	public static void main(String[] args) throws IOException{
		new View();
		
	}
}



