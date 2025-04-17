package interfaces;

import com.microsoft.playwright.Page;

public interface PageInterface {


    Page initializePage(Page page);

    void navigateTo(String url);

    void close();

    void click(String selector);

    void fill(String selector, String text);

    String getText(String selector);

}
