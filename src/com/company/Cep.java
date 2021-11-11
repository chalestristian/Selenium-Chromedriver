package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

public class Cep {
    public static void main(String[] args) {
        File file = new File("/home/chalestristian/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");

        WebElement caixaDeBusca = driver.findElement(By.id("endereco"));
        caixaDeBusca.sendKeys("30622010");

        WebElement botaoBusca = driver.findElement(By.id("btn_pesquisar"));
        botaoBusca.click();
    }

}
