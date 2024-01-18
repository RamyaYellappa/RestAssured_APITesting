package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String SheetName) {

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(SheetName);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}



	public static void CellCount(int RowNumber,int Cellnumber) {

		String excelPath = "./Data/TestData.xlsx";

		// can access anydata format in excel
		DataFormatter dataFormatter = new DataFormatter();
		Object value = dataFormatter.formatCellValue(sheet.getRow(RowNumber).getCell(Cellnumber));

		// String value=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Value of cell"+"["+RowNumber +"]"+"["+ Cellnumber+"] :"+ value);

	}

	public static void RowCount() {
		// one way to find path
		String userDirectory = System.getProperty("user.dir");
		System.out.println("path is :" + userDirectory);
		String excelPath = userDirectory + "/Data/TestData.xlsx";
		// 2nd way
		// String excelPath="./Data/TestData.xlsx";
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("No Of Rows :" + rowcount);

	}

}
