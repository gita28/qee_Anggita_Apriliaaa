package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Detailpage;


public class DetailpageSteps {

    @Steps
    Detailpage detailpage;

    @Given("I am on the Detail page")
    public void iAmOnTheDetaiPage() {
      detailpage. openPage();
    }

    @When("Click Button Add Your Collection")
    public void ClickButtonAddYourCollection() {
        detailpage. ClickButtonAddYourCollection();

    }

    @And("Click Button Back To BookStore")
    public void ClickButtonBackToBookStore() {
      detailpage.ClickButtonBackToBookStore();
    }

    @Then("sucses add book")
    public void sucsesaddbook() {

    }
}
