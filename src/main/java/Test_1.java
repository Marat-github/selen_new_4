import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test_1
{
    public static void main(String[] args)
    {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\marat\\IdeaProjects\\Selenium_ChromDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://yandex.ru/");

            WebElement element = driver.findElement(By.xpath("(//input[@class])[2]"));

            element.sendKeys("Java", Keys.ENTER);


            // Способо 2
            for (int i = 0; i < 5; i++) {
                WebElement element1 = driver.findElement(By.xpath("//a[contains(@class, 'link link_theme_none link_target_serp pager__item pager__item_kind_next i-bem link_js_inited')]"));
                Thread.sleep(100);
                element1.click();
            }

            // Способ 1
            //List<WebElement> WebElementList = driver.findElements(By.xpath("//a[contains(@class, 'link link_theme_none link_target_serp pager__item pager__item_kind_page i-bem')]"));
            //System.out.println(WebElementList.size());
            //for(WebElement elements : WebElementList){
                //    elements.click(); // click can be called on object of WebElement

                //List<WebElement> listResult =  matchingResult.findElements(By.xpath("//li[@class='serp-item']"));

                //System.out.println(listResult.size());

                //for(WebElement results: listResult)
                //{
                //    String value= results.getText();
                //    System.out.println(value);
                //}
            //}
        }
        catch (Exception e)
        {
            System.err.println("Error caught - " + e);
        }
    }
}
