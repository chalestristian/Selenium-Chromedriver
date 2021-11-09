package com.company;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        abrirChrome();
    }
    private static void abrirChrome() {
        File file = new File("/home/chalestristian/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("hTp://devmedia.com.br");
        String i = driver.getCurrentUrl();
        System.out.println(i);
        driver.close();
    }
}