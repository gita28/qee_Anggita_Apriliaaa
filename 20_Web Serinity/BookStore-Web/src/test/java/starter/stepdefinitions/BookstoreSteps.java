package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Bookstorepage;
import starter.pages.Detailpage;

public class BookstoreSteps {

    @Steps
    Bookstorepage bookstorepage;

    Detailpage detailpage;

    @Given("I am on the Bookstore page")
    public void iAmOnTheBookstorePage() {
     bookstorepage.validateOnBookStoreField();
     bookstorepage.openPage();

    }

    @When("I click books")
    public void Iclickbooks() {
    bookstorepage.clickBookStore();
    }

    @Then("I Go to Detail page")
    public void IGoToDetailpage() {
     detailpage.validatedetailpage();

        }
    }







