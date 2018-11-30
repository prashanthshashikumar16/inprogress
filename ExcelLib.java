package commonUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//reads and returns string data
public class ExcelLib {
	public String getStringData( String sheet,  int row,  int col) throws Exception {
		FileInputStream fis = new FileInputStream(Constants.dataPath);
		Workbook wb = WorkbookFactory.create(fis);
		 String data = wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
//reads and returns Numeric data
	public double getNumericData( String sheet,  int row,  int col) throws Exception {
		FileInputStream fis = new FileInputStream(Constants.dataPath);
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet(sheet).getRow(row).getCell(col).getNumericCellValue();
		return data;
	}
	//Writes the Stirng data to the file
	public void setStringData( String sheet,  int row,  int col,  String data) throws Exception {
		 FileInputStream fis = new FileInputStream(Constants.dataPath);
		 Workbook wb = WorkbookFactory.create(fis);
		Row r = wb.getSheet(sheet).getRow(row);

		if (r != null)

		{

			Cell c = wb.getSheet(sheet).getRow(row).getCell(col);

			if (c != null)

			{

				c.setCellValue(data);

			}

			else

			{

				c = r.createCell(col);

				c.setCellValue(data);

			}

		}

		else

		{

			r = wb.getSheet(sheet).createRow(row);

			Cell c = wb.getSheet(sheet).getRow(row).getCell(col);

			if (c != null)

			{

				c.setCellValue(data);

			}

			else

			{

				c = r.createCell(col);

				c.setCellValue(data);

			}

		}

		 FileOutputStream fos = new FileOutputStream(Constants.dataPath);

		wb.write(fos);

		wb.close();

	}
	//Writes the Numeric data to the file
	public void setNumericData( String sheet,  int row,  int col,  double data) throws Exception

	{

		 FileInputStream fis = new FileInputStream(Constants.dataPath);

		 Workbook wb = WorkbookFactory.create(fis);

		if (wb.getSheet(sheet).getRow(row).equals(null))

		{

			wb.getSheet(sheet).createRow(row);

		}

		else if (wb.getSheet(sheet).getRow(row).getCell(col).equals(null))

		{

			wb.getSheet(sheet).getRow(row).createCell(col).setCellValue(data);

		}

		else

		{

			wb.getSheet(sheet).getRow(row).getCell(col).setCellValue(data);

		}

		 FileOutputStream fos = new FileOutputStream(Constants.dataPath);

		wb.write(fos);

		wb.close();

	}

}