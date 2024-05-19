import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
//Login page
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("ahmedhelmyyy98@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.className("button-1 login-button")).click();

        // sign up page
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Ahmed");
        driver.findElement(By.id("FirstName")).sendKeys("Helmy");
        driver.findElement(By.name("DateOfBirthMonth"));

        driver.findElement(By.id("Email")).sendKeys("ahmedhelmyyy98@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Bank");
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        driver.findElement(By.id("register-button")).click();
    }


}
