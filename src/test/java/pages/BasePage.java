package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage{
    
    //Creacion del webdriver y su respectivo wait
    protected static WebDriver driver;
    private static WebDriverWait  wait;

    static{  //Da a conocer que driver vamos a usar, y el path del driver de ese navegador
             // espera hasta  10 segundos
        System.setProperty("webdriver.chrome.driver","C:/WebDrivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
    }

    public BasePage(WebDriver driver){
            BasePage.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            }

    public static void navigateTo(String url){
        driver.get(url);
    }

    private WebElement FindCss(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }


    private WebElement Findx(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        }

    public void clickElementXpath(String locator){
        Findx(locator).click();
    }

        
    public void clickElement(String locator){
        FindCss(locator).click();
    }   

    public void write(String locator, String textToWrite){
        FindCss(locator).clear();
        FindCss(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownValue(String locator, String valueToSelect){
        Select dropdown = new Select(Findx(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownIndex(String locator, String indexToSelect){
        Select dropdown = new Select(Findx(locator));
        dropdown.selectByValue(indexToSelect);
    }

    public void selectFromDropDownText(String locator, String valueToSelect){
        Select dropdown = new Select(Findx(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }


}
