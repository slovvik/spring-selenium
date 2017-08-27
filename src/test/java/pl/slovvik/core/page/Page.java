package pl.slovvik.core.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Page {

    @Autowired
    private WebDriver webDriver;

    public Page() {
        PageFactory.initElements(new DefaultFieldDecorator(new DefaultElementLocatorFactory(webDriver)), this);
    }
}
