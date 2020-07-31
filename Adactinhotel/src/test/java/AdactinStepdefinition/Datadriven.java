package AdactinStepdefinition;

import AdactinBaseclass.BaseClass;

public class Datadriven extends BaseClass {
	
	public static void main(String[] args)throws Throwable{
		launchBrowser("chrome");
		for(int i=0;i<=2;i++)
		{
			int j=0;
			driver.get(excelRead(i, j));
			String title = driver.getTitle();
			for(j=1;j<=1;j++)
			{
				excelWrite(i, j, title);
				System.out.println("written");
			}
		}
		
	}
	

}
