package com.thoughtworks;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.server.browserlaunchers.GoogleChromeLauncher;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 7/18/12
 * Time: 10:36 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class GeneratePoemTest {

    @Test
    public void getPoem() throws Exception {

        ChromeDriverService service = new ChromeDriverService.Builder().usingChromeDriverExecutable(new File("/Users/twer/Downloads/chromedriver")).usingAnyFreePort().build();
        service.start();
        int a=0;
        int b= 0;
        assertEquals(a,b);

        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        WebDriver driver = new ChromeDriver(service);
        driver.get("http://localhost:9090/poem-generator/login");
        driver.findElement(By.name("j_username")).sendKeys("bowen");
        driver.findElement(By.name("j_password")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.name("_eventId_generate")).click();
        driver.findElement(By.id("qi")).sendKeys("first");
        driver.findElement(By.name("_eventId_next")).click();
        driver.findElement(By.id("cheng")).sendKeys("second");
        driver.findElement(By.name("_eventId_next")).click();
        driver.findElement(By.id("zhuan")).sendKeys("third");
        driver.findElement(By.name("_eventId_next")).click();
        driver.findElement(By.id("he")).sendKeys("forth");
        driver.findElement(By.name("_eventId_next")).click();
        assertEquals(driver.getTitle(),"success");


    }

}
