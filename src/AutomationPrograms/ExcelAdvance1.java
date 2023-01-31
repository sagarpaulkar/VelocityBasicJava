package AutomationPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdvance1 {

	public static FileInputStream file;  // global and static
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		file = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
		int rownum = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		file = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
		int colnum = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(colnum);
		for (int i=0;i<=rownum;i++) {
			for(int j=0;j<colnum;j++) {
				file = new FileInputStream("C:\\Users\\Sagar Paulkar\\Desktop\\excelwork.xlsx");
				String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
