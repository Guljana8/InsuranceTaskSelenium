package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void openBrowser(){
        openApplication();
    }

    @After
    public void closeBrowser(){
        closeApplication();
    }
}
