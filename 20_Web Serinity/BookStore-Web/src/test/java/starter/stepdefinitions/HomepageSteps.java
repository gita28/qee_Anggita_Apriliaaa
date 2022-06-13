package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Bookstorepage;
import starter.pages.Detailpage;
import starter.pages.Homepage;

public class HomepageSteps {
    @Steps
    Homepage homepage;
    Bookstorepage bookstorepage;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homepage.openPage();

    }

    @When("I click Button Go To BookStore")
    public void clickButtonGoToBookStore() {
        homepage.clickButtonGoToBookStore();

    }

    @And("I click Button Delete All Books")
    public void clickButtonDeleteAllBooks() {
        homepage.clickButtonDeleteAllBooks();
    }

    @Then("I go to bookstore page")
    public void iGoToBookStorePage() {
        bookstorepage.validateOnBookStoreField();
    }
}
