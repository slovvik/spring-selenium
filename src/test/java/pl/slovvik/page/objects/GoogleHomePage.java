package pl.slovvik.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pl.slovvik.core.page.PageObject;

@PageObject
public class GoogleHomePage {

    @FindBy(id = "lst-ib")
    WebElement searchInput;

    @FindBy(css = "input[name='btnK']")
    WebElement searchButton;

    public void typeSearchText(String text) {
        searchInput.sendKeys(text);
    }

    public void clickOnSeachButton() {
        searchButton.click();
    }

    public void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
