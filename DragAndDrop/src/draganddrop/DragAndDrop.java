
	package draganddrop;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDrop {				

	    public static WebDriver driver = new ChromeDriver();
	    public String baseurl = "http://demo.guru99.com/test/drag_drop.html";
	    		
	   public void open_url()
	   {
		   driver.get(baseurl);
		   driver.manage().window().maximize();	   
		   
	   }
	public void Action_1() {
	  WebElement dragme = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	  WebElement dropme = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
	 Actions act = new Actions(driver);
	 act.dragAndDrop(dragme, dropme).build().perform();
	   
	}

	
	
	public static void main(String[] args) {
		DragAndDrop test = new DragAndDrop();
		test.open_url();
		test.Action_1();
	}

}
