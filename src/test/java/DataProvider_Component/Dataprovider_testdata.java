package DataProvider_Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_Component.BaseClass;



public class Dataprovider_testdata {
	
	@DataProvider(name="dp_zolopart1test")
	public static Iterator<Object[]> zolopart1test() throws IOException
	{
		
		return commonmethod_for_testdata("zoloAssignementpart1","zolopart1test");
		
	}
	
	@DataProvider(name="dp_zolopart1test")
	public static Iterator<Object[]> zolopart2test() throws IOException
	{
		return commonmethod_for_testdata("zoloAssignementpart2","zolopart2test");
	}
	
	
	
	
	public static Iterator<Object[]> commonmethod_for_testdata(String sheetname,String Scriptname) throws IOException
	{
	
		Generic_Component.ExcelReadWrite xl= new Generic_Component.ExcelReadWrite(System.getProperty("user.dir")+"/testdata/zolotestdata.xls");
		HSSFSheet Sheet = xl.Setsheet(sheetname);
		
		int RowCount = xl.getrowcount(Sheet);
		int ColCount = xl.getcolcount(Sheet, 0);
		
		List<Object[]> arr_list= new ArrayList<Object[]>();
		
		for(int i=1;i<=RowCount;i++)
		{
			String Execute_Flag = xl.Readvalue(Sheet, i, "Execute_Flag");
			String Script_name = xl.Readvalue(Sheet, i, "Script_name");
			
			if((Execute_Flag.equalsIgnoreCase("Y")) && (Script_name.equals(Scriptname)))
			{
				Object[] x= new Object[1];
				Map<String,String> dMap= new HashMap<String,String>();
				
				for(int j=0;j<ColCount;j++)
				{
					
					String Skey = xl.Readvalue(Sheet, 0, j);
					String Value = xl.Readvalue(Sheet, i, j);
					
					dMap.put(Skey, Value);
					
				}//end of col for loop
				
				x[0]=dMap;
				arr_list.add(x);		
				
				
			}//end of if condition
			
			
			
		}//end of row for loop
		
		
		
		return arr_list.iterator();
		
		
		
		
	}

}
