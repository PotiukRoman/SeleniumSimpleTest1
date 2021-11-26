package org.isg;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","c:/Users/arev/Downloads/chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println("Setup method is running before the test");
    }

    @After
    public void close(){
        driver.quit();
        System.out.println("Close method is running after the test");
    }
}
