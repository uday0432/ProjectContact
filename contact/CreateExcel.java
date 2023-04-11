package contact;

import jxl.Workbook;
import jxl.write.WritableWorkbook;
import java.io.File;
import java.io.IOException;

public class CreateExcel {

	String excelname = new String("Contacts");
	CreateExcel() {
		try {
			//It will create a .xls file in current project named Contacts
			WritableWorkbook workbook = Workbook.createWorkbook(new File(excelname));
			workbook.createSheet("Sheet 1",0);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new CreateExcel();
	}

}
