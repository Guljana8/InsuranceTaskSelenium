package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.QuotePage;
import utils.CommonMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class InsuranceQuote extends CommonMethods {
    public static WebDriver driver;
    @Given("user navigates to the application")
    public void user_navigates_to_the_application() {

    }

    @When("Assert the title ON the webpage")
    public void assert_the_title_on_the_webpage() {
        String actualPageTitle = quote.pageTitle.getText();
        String expectedPageTitle = "Get a Quote";
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }
    @When("user enters the firstName {string}")
    public void user_enters_the_first_name(String name) {
        sendText(quote.firstName,name);

    }

    @Then("Check {string} under Interest")
    public void check_under_interest(String autoBox) throws InterruptedException {
        scrollDown(quote.interest);
        Thread.sleep(3000);
        click(quote.interest);

    }

    @Then("user click on Submit button")
    public void user_click_on_submit_button() {
        scrollDown(quote.submitButton);
        click(quote.submitButton);

    }

    @Then("Assert that the First Name field does not have an error message")
    public void assert_that_the_first_name_field_does_not_have_an_error_message(){

        if(quote.firstName.isDisplayed()){
            System.out.println("FirstName field doesn't have an error message!");

        }else{
            String firstNameError=quote.firstName.getText();
            System.out.println(firstNameError);
        }
    }
    @Then("Assert the Last Name field error message using the variable, lastNameErrorMessage")
    public void assert_the_last_name_field_error_message_using_the_variable_last_name_error_message() {
        String actualError = quote.lastNameErrorMsg.getText();
        String expectedError = "Response required";
        Assert.assertEquals(expectedError, actualError);
    }
}
