package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class id consists of generic methods to use
 * @author NARESH MEDI
 */

public class excelFileUtility {
	public String readDataFromExcel(String sheetname, int rowno, int cellno) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".//src\\test\\resources\\Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value= wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
		
	}

}
