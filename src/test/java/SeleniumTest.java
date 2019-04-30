import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    WebDriver driver;

    @Test
    public void test(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.linkText("Маркет")).click();
        driver.findElement(By.linkText("Компьютерная техника")).click();
        driver.findElement(By.linkText("Ноутбуки")).click();

        driver.quit();
    }
}
