package steps;

import pages.QuotePage;

public class PageInitializer {
    public static QuotePage quote;

    public static void initializePageObjects(){
        quote = new QuotePage();
    }
}
