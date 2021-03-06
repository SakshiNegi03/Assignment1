package test;
import java.awt.AWTException;
import java.nio.file.Paths;
import java.util.List;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType; 
public class demo {
	
	public static void main(String[] args) throws AWTException {
		
		// Setting chrome executable
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\snegi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String cwd = Paths.get("").toAbsolutePath().toString();
		String filePath = cwd + "/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);
		// Launching browser
        WebDriver driver = new ChromeDriver();
        // Loading URL
        driver.get("https://www.myntra.com/");
        // Mentioning type of Log 
        LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        // Retrieving all log 
        List<LogEntry> logs= entry.getAll();
        // Print one by one
        for(LogEntry e: logs)
        {
        	System.out.println(e);
        }
        
        // Printing details separately 
        for(LogEntry e: logs)
        {
        	System.out.println("Message is: " +e.getMessage());
        	System.out.println("Level is: " +e.getLevel());
        }
       
        
        
	}
 
}