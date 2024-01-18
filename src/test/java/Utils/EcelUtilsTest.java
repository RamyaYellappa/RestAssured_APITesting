package Utils;

public class EcelUtilsTest {
	 
	public static void main(String[] args) {
		String excelPath="./Data/TestData.xlsx";
		String SheetName="Sheet1";
		
		ExcelUtils excel=new ExcelUtils(excelPath, SheetName);
		
		excel.RowCount();
		excel.CellCount(1, 0);
		excel.CellCount(1, 1);
		excel.CellCount(1, 2);
	}

}
