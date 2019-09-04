


import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

@FixMethodOrder



public class SeleniumPractice {


    private static WebDriver driver;


    @BeforeSuite

    public static void main() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moshe\\Desktop\\chrome drivers\\76A\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");


    }


    @Test

    public void Test01() throws InterruptedException, AWTException {

        driver = new FirefoxDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("hello");

        driver.get("https://www.facebook.com/?stype=lo&jlou=Afe-I9-5JdNzd8BOOm8buwa1LOTk_nFSh13H3R2mTJLJ-QgFX0LXYa4oiCr9GXAzRJwKYzFpDXwfKJnwarZVzPXk&smuh=58249&lh=Ac9l-tD4iXRl95lB");

        driver.findElement(By.cssSelector("#email")).sendKeys("mosheavidorster@gmail.com");

        Thread.sleep(500);

        driver.findElement(By.cssSelector("#pass")).sendKeys("SHARK24");

        Thread.sleep(500);
        driver.findElement(By.cssSelector("#u_0_a")).submit();

Thread.sleep(30000);



        driver.findElement(By.cssSelector("#userNavigationLabel")).click();

        Thread.sleep(1000);


        int i = 0;

        List<WebElement> allOptions = driver.findElements(By.cssSelector("._54nc"));


        for (WebElement we : allOptions) {
            i++;
            if (i == 6) {
                we.click();


                System.out.println(driver.manage().window().getSize());


            }
        }
    }


            @Test


            public void Test02 () throws InterruptedException, AWTException {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.ynet.co.il/home/0,7340,L-8,00.html"); // sample url
                Robot robot = new Robot();
                robot.mouseMove(630, 420); // move mouse point to specific location
                robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step
                robot.mousePress(InputEvent.BUTTON2_DOWN_MASK); // press left click
                //robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK); // release left click
                robot.delay(1500);
                robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button
                Thread.sleep(2000);
                robot.keyPress(KeyEvent.VK_ENTER);
                // press enter key of keyboard to perform above selected action



            }



            @Test


            public void Test03 () throws InterruptedException {

                driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://edition.cnn.com/?refresh=1");

                String printUrl;

                printUrl = driver.findElement(By.xpath("//a[@href=\"/2019/09/03/uk/boris-johnson-election-gamble-gbr-intl/index.html\"]")).getAttribute("href");

                System.out.println(printUrl);
                {

                    driver = new ChromeDriver();
                    driver.manage().window().maximize();


                    driver.get(printUrl);

                    Thread.sleep(5000);

                    WebElement element = driver.findElement(By.cssSelector(".theoplayer-skin button.vjs-big-play-button"));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                    Thread.sleep(5000);

                    driver.findElement(By.cssSelector(".theoplayer-skin button.vjs-big-play-button")).click();


                    Thread.sleep(30000);

                    driver.findElement(By.cssSelector(".theoplayer-skin.vjs-user-inactive.vjs-playing:not(.theo-menu-opened)")).click();


                }


            }

        }










