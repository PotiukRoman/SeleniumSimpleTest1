package org.isg;
import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest1() {
        driver.get("https://www.ukr.net");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("UKR.NET: Всі новини України, останні новини дня в Україні та Світі"));
    }

    @Test
    public void firstTest2() {
        driver.get("https://www.google.com.ua/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
    }
}
