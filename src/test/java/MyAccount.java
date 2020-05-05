

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class MyAccount {
        public static WebElement myAccount(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//span[contains(text(),'My Account')]"));
            return element;
        }

        public static WebElement registerAccount(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//li[@id='customerAccount']//li[1]//a[1]"));
            return element;
        }
        public static WebElement firstName(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//input[@id='firstName']"));
            return element;
        }
        public static WebElement lastName(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//input[@id='lastName']"));
            return element;
        }
        public static WebElement selectCountry(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//select[@id='registration_country']"));
            return element;
        }
        public static WebElement selectState(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//select[@id='customer_zones']"));
            return element;
        }
        public static WebElement  selectEmail(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//input[@id='emailAddress']"));
            return element;
        }
        public static WebElement typePassword(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//input[@id='password']"));
            return element;
        }

        public static WebElement repeatPassword(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//input[@id='passwordAgain']"));
            return element;
        }
        public static WebElement createAccount(WebDriver browser) {
            WebElement element = browser.findElement(By.xpath("//button[@class='btn btn-default login-btn']"));
            return element;
        }
    }


