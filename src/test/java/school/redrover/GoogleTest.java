package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void GoogleTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement requestString = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
        requestString.sendKeys("Selenium");

        WebElement button = driver.findElement(By.xpath("//input[@value='Google Search']"));
        button.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
