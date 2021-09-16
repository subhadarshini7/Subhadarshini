import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wheather_api {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby\\Desktop\\chromedriver_win32\\chromedriver.exe" );
    WebDriver driver=new ChromeDriver();//Used Selenium framework
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get("https://accounts.datoms.io/login");
    driver.findElement(By.id("email")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
    Thread.sleep(5000);
    driver.findElement(By.id("password")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("password")).sendKeys("xyz");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id='form_submit_btn']")).click();
    Thread.sleep(5000);
    driver.close();
}
}
