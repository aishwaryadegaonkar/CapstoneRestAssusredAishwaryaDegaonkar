package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.restassured.RestAssured;

public class StepDefinitions {
    WebDriver driver;

    @Given("User is on the Login page")
    public void user_is_on_the_login_page() {

        driver = new ChromeDriver();
        driver.get("https://example.com/login");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        // Selenium code to enter username and password
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        // Selenium code to click login button
    }

    @Then("User is redirected to the home page")
    public void user_is_redirected_to_the_home_page() {
        // Selenium code to verify redirection
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://example.com/home", currentUrl);
    }

    @Then("User sees an error message")
    public void user_sees_an_error_message() {
        // Selenium code to verify error message
    }

    @Given("I send a GET request to {string}")
    public void i_send_a_get_request_to(String url) {
        RestAssured.get(url).then().statusCode(200);
    }
}
