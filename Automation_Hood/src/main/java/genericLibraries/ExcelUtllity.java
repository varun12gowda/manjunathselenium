






 package genericLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/**
 * 
 * @author manju
 *
 */

public class ExcelUtllity implements IautoConstant {
	/**
	 * 
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readingSingleData(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		File file= new File(EXCELPROPERTIESPATH);
		Workbook workbook = WorkbookFactory.create(file);
		return workbook.getSheet(sheetName).getRow(rownum).getCell(cellnum).toString();	
	}
	@DataProvider(name="testdata")
	/**
	 * 
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public Object[][] readingMultileData() throws EncryptedDocumentException, IOException {
		File file = new File(EXCELPROPERTIESPATH);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount= sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowCount][cellCount];
		for(int row=0;row<rowCount;row++) {
			Row actualRow =sheet.getRow(row);
			for(int cell=0;cell<actualRow.getLastCellNum();cell++) {
				data[row][cell]=actualRow.getCell(cell).toString();
			}
			
		}
		return data;
		
		
	}
}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		ExcelUtllity n = new ExcelUtllity();
//		Object[][] obj = n.readingMultileData();
//		for (int i = 0; i < obj.length; i++) {
//			for (int j = 0; j < obj[i].length; j++) {
//				System.out.println(obj[i][j]);
//			}
//			
//		}
	


