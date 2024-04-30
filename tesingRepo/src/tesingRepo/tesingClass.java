package tesingRepo;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class tesingClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhilesh Kumar Reddy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          Thread.sleep(3000);   
  
    }  
	

}
