package generic;

import java.util.Date;

public class Get_date {  
      
	public static String currentDate()
	{
		Date d= new Date();
		String d1 = d.toString().replace(":","-");
	     return d1;

	}
	
}
