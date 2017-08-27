package pl.slovvik.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import pl.slovvik.core.TestBase;
import pl.slovvik.page.objects.GoogleHomePage;

public class GoogleTests extends TestBase {

    @Autowired
    protected WebDriver webDriver;

    @Autowired
    private GoogleHomePage googleHomePage;

    @Test
    public void testHomePage() {
        webDriver.get("http://www.google.com");
        googleHomePage.typeSearchText("Selenium Spring Boot");
//        googleHomePage.clickOnSeachButton();
        googleHomePage.wait(5);
    }

    @Test
    public void testHomePage2() {
        webDriver.get("http://www.google.com");
        googleHomePage.typeSearchText("Cycki");
//        googleHomePage.clickOnSeachButton();
        googleHomePage.wait(5);
    }
}
