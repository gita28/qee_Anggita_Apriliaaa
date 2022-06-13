package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Homepage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    Homepage homepage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void iInputValidEmail() {
        loginPage.inputUsername("Gita28");
    }
    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Gita123@");
    }

    @And("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to home page")
    public void iGoToHomePage() {
        homepage.validateOnHomepage();
        }
    }

