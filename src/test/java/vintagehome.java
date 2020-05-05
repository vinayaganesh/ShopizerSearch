import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class vintagehome {
        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            System.out.println("Register");
            driver.get("http://localhost:8080/shop/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();
            MyAccount.myAccount(driver).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            driver.manage().window().maximize();
           /* MyAccount.registerAccount(driver).click();
            MyAccount.firstName(driver).sendKeys("MyYellowTeam2");
            MyAccount.lastName(driver).sendKeys("Sprintteam2");
            MyAccount.selectCountry(driver).sendKeys("Australia");
            MyAccount.selectState(driver).sendKeys("Western Australia");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MyAccount.selectEmail(driver).sendKeys("MyTeamyellow2@gmail.com");
            MyAccount.typePassword(driver).sendKeys("acsmvyt2");
            MyAccount.repeatPassword(driver).sendKeys("acsmvyt2");
            MyAccount.createAccount(driver).click();*/

            search.search1(driver).click();
            search.search2(driver).sendKeys("hand bags");
            search.search3(driver).click();



        }
    }

