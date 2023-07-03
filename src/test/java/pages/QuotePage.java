package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class QuotePage extends CommonMethods {

    @FindBy (xpath = "//h1[text()='Get a Quote']")
    public WebElement pageTitle;

    @FindBy (xpath = "//input[@id=\'FirstName\'][1]")
    public WebElement firstName;

    @FindBy (xpath = "//label[text()='Auto']")
    public WebElement interest;


    @FindBy (xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//span[@id='FirstName-error']")
    public  WebElement firstNameErrorMsg;

    @FindBy (xpath = "//span[@id='LastName-error']")
    public  WebElement lastNameErrorMsg;

    public QuotePage() {

        PageFactory.initElements(driver, this);
    }
}
