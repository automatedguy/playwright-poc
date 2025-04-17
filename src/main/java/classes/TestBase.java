package classes;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public abstract class TestBase {

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


    @AfterClass
    public void tearDown() {
        if (pageBase != null) {
            pageBase.close();
        }
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }

}
