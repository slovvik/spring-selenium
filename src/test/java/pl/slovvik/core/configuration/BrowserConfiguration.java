package pl.slovvik.core.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import pl.slovvik.core.browsers.Browsers;

@Configuration
@ComponentScan(basePackages = "pl.slovvik")
@PropertySource("classpath:configuration.properties")
public class BrowserConfiguration {

    @Value("${browser}")
    private String browser;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Scope("test")
    public WebDriver webDriver() {
        switch (Browsers.valueOf(this.browser)) {
            case CH:
                System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
                return new ChromeDriver();
            case FF:
                System.setProperty("webdriver.gecko.driver", "D:\\Projects\\geckodriver.exe");
                return new FirefoxDriver();
            default:
                throw new RuntimeException("Browser not found");
        }
    }
}
