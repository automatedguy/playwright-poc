package tests;

import classes.TestBase;
import org.testng.annotations.Test;

public class ChromeTest extends TestBase {

    @Test
    public void testPage() {
        pageBase.navigateTo("http://google.com");
        pageBase.fill("textarea[name='q']", "Playwright");
    }
}
