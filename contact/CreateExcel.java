package contact;
//
import jxl.Workbook;
import jxl.write.*;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;

public class CreateExcel {

	String excelname = new String("Contacts.xls");
	
	WritableWorkbook workbook;
	WritableCell[] cell;
	WritableSheet sheet;
	
	void defaultValue() throws RowsExceededException, WriteException {
		WritableCell cell1 = new Label(0,0,"Name");
		WritableCell cell2 = new Label(1,0,"Number");
		
		sheet.addCell(cell1);
		sheet.addCell(cell2);
		
	}
	CreateExcel() throws ClassNotFoundException, WriteException{
		try {
			//It will create a .xls file in current project named Contacts
			workbook = Workbook.createWorkbook(new File(excelname));
			sheet = workbook.createSheet("Sheet 1",0);// Sheet Created
			
			
			
			workbook.write();
			workbook.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, RowsExceededException, WriteException{
		new CreateExcel() ;
	}

}
