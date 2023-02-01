package seleNIum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultiple {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("./data/Raja.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);

		// String data = wb.getSheet("rrr").getRow(0).getCell(0).getStringCellValue();
		// System.out.println(data);

		// int c = wb.getSheet("rrr").getLastRowNum();
		// for (int i = 0; i <= c; i++)
		// {
		// String r = wb.getSheet("rrr").getRow(i).getCell(0).getStringCellValue();
		// String b = wb.getSheet("rrr").getRow(i).getCell(1).getStringCellValue();
		//
		// System.out.println(r+ "------>" + b);
		// }

		int row = wb.getSheet("rrr").getPhysicalNumberOfRows();
		int col = wb.getSheet("rrr").getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				String r = wb.getSheet("rrr").getRow(i).getCell(j).getStringCellValue();
				System.out.print(r + " ");
			}
			System.out.println(" ");
		}
	}
}
