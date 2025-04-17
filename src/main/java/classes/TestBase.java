package classes;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestBase {

    protected PageBase pageBase;
    protected Browser browser;
    protected Playwright playwright;

    @BeforeClass
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setChannel("chrome")
                .setSlowMo(50));
        pageBase = new PageBase(browser.newPage());
    }

    @Test
    public void testPage() {
        pageBase.navigateTo("http://google.com");
        pageBase.fill("textarea[name='q']", "Playwright");
        pageBase.close();
    }
}
