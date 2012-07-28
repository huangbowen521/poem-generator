package com.thoughtworks;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.server.browserlaunchers.GoogleChromeLauncher;

import java.io.File;
import java.io.IOException;
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


    private WebDriver chromeDriver;
    private static ChromeDriverService service;

    @BeforeClass
    public static void createAndStartService() throws IOException {
        File file = new File("/Users/twer/Downloads/chromedriver");
        service = new ChromeDriverService.Builder().usingChromeDriverExecutable(file).usingAnyFreePort().build();
        service.start();

    }

    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        chromeDriver = new ChromeDriver(service);
    }

    @Test
    public void getPoem() throws Exception {


        chromeDriver.get("http://localhost:9090/poem-generator/login");
        chromeDriver.findElement(By.name("j_username")).sendKeys("bowen");
        chromeDriver.findElement(By.name("j_password")).sendKeys("123456");
        chromeDriver.findElement(By.name("submit")).click();
        chromeDriver.findElement(By.name("_eventId_generate")).click();
        chromeDriver.findElement(By.id("qi")).sendKeys("first");
        chromeDriver.findElement(By.name("_eventId_next")).click();
        chromeDriver.findElement(By.id("cheng")).sendKeys("second");
        chromeDriver.findElement(By.name("_eventId_next")).click();
        chromeDriver.findElement(By.id("zhuan")).sendKeys("third");
        chromeDriver.findElement(By.name("_eventId_next")).click();
        chromeDriver.findElement(By.id("he")).sendKeys("forth");
        chromeDriver.findElement(By.name("_eventId_next")).click();
        assertEquals(chromeDriver.getTitle(),"success");
    }

    @After
    public  void quitDriver()
    {
        chromeDriver.quit();
    }

    @AfterClass
    public static void stopService()
    {
         service.stop();
    }

}
