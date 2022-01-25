import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TestDemoScreen {

    static WebDriver driver;

    public static void main(String args[]) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.navigate().to("https://webmail.stgit.com/");
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.linkText("proceed to webmail.stgit.com (unsafe)")).click();
        driver.findElement(By.cssSelector("input.signInInputText")).sendKeys("stg\\jujuprethab");
        driver.findElement(By.cssSelector("input[type*=\'assw\']")).sendKeys("Pretha@123");
        Thread.sleep(100);
        driver.findElement(By.className("siginTxt")).click();
        Thread.sleep(1000);
        driver.get("https://webmail.stgit.com/");
        takeScreenShot(("Logic_page"));

}
    public static void takeScreenShot(String fileName) throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
        FileUtils.copyFile(file, new File("C:\\Users\\jujuprethab\\eclipse-workspace\\Selenium_Test\\Screenshot\\"
                +fileName+"juju.png"));
        system.out.println("team demo task");
        
    }
}


