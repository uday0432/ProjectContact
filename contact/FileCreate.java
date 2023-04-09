package contact;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileCreate {
	
		public FileCreate() throws IOException	{
			//System.out.println(Add.name1 + Add.number1);
			FileWriter myfile = new FileWriter("Details.txt",true);
			myfile.write("Name: " + Add.name1 + "\tNumber: " + Add.number1 + "\n");
			myfile.close();
		}
	public static void main(String[] args) throws IOException	{
		new Add();
	}

}