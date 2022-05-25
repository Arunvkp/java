import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsenameId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nammalu.com\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textname = driver.findElement(By.id("email"));
		textname.sendKeys("arunkumar@gmail.com");
		WebElement textpass = driver.findElement(By.name("pass"));
		textpass.sendKeys("98398759486");
		driver.manage().window().maximize();
		System.out.println("login function");
		
		
		
		
	}

}
