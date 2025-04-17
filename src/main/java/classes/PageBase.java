package classes;
import com.microsoft.playwright.Page;
import interfaces.PageInterface;

public class PageBase implements PageInterface {

    protected Page page;

    public Page initializePage(Page page) {
        return this.page = page;
    }

    public PageBase(Page page) {
        this.page = page;
    }

    public void navigateTo(String url) {
        page.navigate(url);
    }

    public void close() {
        page.close();
    }

    public void click(String selector) {
        page.click(selector);
    }

    public void fill(String selector, String text) {
        page.fill(selector, text);
    }

    public String getText(String selector) {
        return page.textContent(selector);
    }

    private void waitForTimeout(int milliseconds) {
        page.waitForTimeout(milliseconds);
    }

    private void waitForSelector(String selector) {
        page.waitForSelector(selector);
    }

}
