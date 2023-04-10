package contact;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	static String filename = new String("Details.txt");
		public FileCreate() throws IOException	{
			//System.out.println(Add.name1 + Add.number1);
			FileWriter myfile = new FileWriter(filename,true);
			myfile.write("Name: " + Add.name1 + "\nNumber: " + Add.number1 + "\n");
			myfile.close();
		}
	public static void main(String[] args) throws IOException	{
		new Add();
	}

}