package Adactinhotel;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	public static void datePicker(String enterDate)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dhilli.babu\\eclipse-workspace\\Adactinhotel\\src\\test\\resource\\Drivers\\chromedriver80.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.utconline.uk.gov.in/Home.aspx");
		Date current = new Date();
		SimpleDateFormat dFormat = new SimpleDateFormat("d/MM/yyyy");
		try {
			Date dateToSelect = dFormat.parse(enterDate);
			
			String day = new SimpleDateFormat("d").format(dateToSelect);
			String month = new SimpleDateFormat("MMMM").format(dateToSelect);
			String year = new SimpleDateFormat("yyyy").format(dateToSelect);
			
			System.out.println(day+" "+month+" "+year+" ");
			
			String requiredMonth=month+" "+year;
			
			System.out.println("required month year: "+requiredMonth);
			
			WebElement clickkdatefield = driver.findElement(By.xpath("//input[@name='txtDate']"));
			clickkdatefield.click();
			
			Boolean flag=true;
			while(flag) {
				String datepickertitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
									
				if(requiredMonth.equalsIgnoreCase(datepickertitle))
				{
					driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
					                            
					flag=false;
					break;
				}else {
					if(dateToSelect.compareTo(current)>0)
					
						driver.findElement(By.xpath("//a[@data-handler='next']")).click();
					else
						if(dateToSelect.compareTo(current)<0)
						
							driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
				}
				}
			}catch(Exception e) {
				e.printStackTrace();			
		}
		
	}
	public static void main(String[] args) {		
		datePicker("03/06/2020");
	}
}
