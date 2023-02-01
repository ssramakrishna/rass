package seleNIum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Login {
	public static Object[][] readExcell(String sheetName) throws EncryptedDocumentException, IOException {
		File f = new File("./src/test/resources/Raja.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);
		int row = wb.getSheet(sheetName).getPhysicalNumberOfRows();
		int col = wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		Object[][] arr = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i - 1][j] = wb.getSheet("rrr").getRow(i).getCell(j).getStringCellValue();
			}
			System.out.println(" ");
		}
		return arr;
	}
}
