package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class MainTest {

    @Test
    public void testSum ()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();
    }

    @Test
    public void theSecondTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement textBox = driver.findElement(By.cssSelector("button"));

        driver.quit();

    }

    @Test
    public void testGetSum() {
        Assert.assertEquals(Main.getSum(1,5) ,6);
        Assert.assertEquals(Main.getSum(0,0),0);
    }

    @Test
    public void testGetConcat(){
        Assert.assertEquals(Main.getConcat("hello","dima"),"hellodima");
        Assert.assertEquals(Main.getConcat("hel lo","Sima"),"hel loSima");
    }


}
