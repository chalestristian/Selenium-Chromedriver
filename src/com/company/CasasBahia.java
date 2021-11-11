package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

public class CasasBahia {

    public static void main(String[] args) {
        File file = new File("/home/chalestristian/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.casasbahia.com.br");

        WebElement caixaDeBusca = driver.findElement(By.id("strBusca"));
        caixaDeBusca.sendKeys("PlayStation");
        caixaDeBusca.clear();
        caixaDeBusca.sendKeys("Panela");

        WebElement botaoBusca = driver.findElement(By.id("btnOK"));
        botaoBusca.click();
    }
}
