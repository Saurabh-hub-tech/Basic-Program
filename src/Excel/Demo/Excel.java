package Excel.Demo;

import java.util.ArrayList;

public class Excel {
	  static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDatafromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader= new Xls_Reader("C://Users//Admin//eclipse-workspace//Test//Excel//Data Sheet.xlsx");
		} catch(Exception e)	{
			e.printStackTrace();
		}

	
	for(int rowNum=2; rowNum  <= reader.getRowCount("Sheet1"); rowNum++) {
		
		String UserName = reader.getCellData("Sheet1", "UserName",rowNum);
		String Password = reader.getCellData("Sheet1", "Password",rowNum);
		
		Object ob[] = {UserName,Password};
		
		myData.add(ob);
	}
		
	return myData;
	}
	
}

