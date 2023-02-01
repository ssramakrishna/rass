package seleNIum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAnd_2D {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readExcell("rrr");
	}

	private static void readExcell(String sheetName) throws EncryptedDocumentException, IOException {

		File f = new File("./data/Raja.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = WorkbookFactory.create(fis);
		int row = wb.getSheet(sheetName).getPhysicalNumberOfRows();
		int col = wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		Object [][] arr = new Object[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = wb.getSheet("rrr").getRow(i).getCell(j).getStringCellValue();
			}
			System.out.println(" ");
		}

		for (int k = 1; k < arr.length; k++) // printing
		{ 
			for (int j = 0; j < arr[k].length; j++) 
			{
				System.out.print(arr[k][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
