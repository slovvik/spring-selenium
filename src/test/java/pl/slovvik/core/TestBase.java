package pl.slovvik.core;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import pl.slovvik.core.configuration.BrowserConfiguration;
import pl.slovvik.core.configuration.SeleniumTestCaseContext;
import pl.slovvik.core.test.listener.SeleniumTestsExecutionListener;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BrowserConfiguration.class, SeleniumTestCaseContext.class})
@TestExecutionListeners(listeners = {SeleniumTestsExecutionListener.class, DependencyInjectionTestExecutionListener.class})
public abstract class TestBase {

}
