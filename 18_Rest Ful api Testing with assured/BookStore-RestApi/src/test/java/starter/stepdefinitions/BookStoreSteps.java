package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.BookStore.*;
import starter.Transaction.TransactionGET;
import starter.Transaction.TransactionPOST;

public class BookStoreSteps {
    @Step
    BookDELETE bookDELETE;
    BookGET bookGET;
    BookPOST bookPOST;
    IdBookDELETE idBookDELETE;
    IdBookGET idBookGET;
    IdBookPUT idBookPUT;

    @Given("I set api endopoints for Delete BookStore")
    public void setApiEndpointsForDeleteBookStore() {
        bookDELETE.setApiEndpointsForDeleteBookStore();
    }

    @When("I send Http request Delete BookStore")
    public void sendHttpRequestDeleteBookStore() {
        bookDELETE.sendHttpRequestDeleteBookStore();
    }

    @Then("I receive validate BookStore Delete the status code is response 400")
    public void receiveValidBookStoreDeleteTheStatusCodeIsResponse400() {
        bookDELETE.receiveValidBookStoreDeleteTheStatusCodeIsResponse400();
    }

    @And("I receive valid data Delete BookStore")
    public void receiveValidDataDeleteBookStore () {
        bookDELETE.receiveValidDataDeleteBookStore();
    }

    @Given("I set api endopoints for get BookStore")
    public void setApiEndpointsForGetBookStore () {
       bookGET.setApiEndpointsForGetBookStore();
    }

    @When("I send Http request get BookStore")
    public void sendHttpRequestGetBookStore() {
       bookGET.sendHttpRequestGetBookStore();
    }

    @Then("I receive verify BookStore get HTTP response 200")
    public void receiveVerifyBookStoreGetHttpResponse200() {
       bookGET.receiveVerifyBookStoreGetHttpResponse200();
    }

    @And("I receive valid data get BookStore")
    public void receiveValidDataGetBookStore() {
        bookGET.receiveValidDataGetBookStore();
    }

    @Given("I set api endopoints for Post BookStore")
    public void setApiEndopointsForPostBookStore() {
        bookPOST.setApiEndopointsForPostBookStore();
    }

    @When("I send Http request Post BookStore")
    public void sendHttpRequestPostBookStore() {
        bookPOST.sendHttpRequestPostBookStore();

    }

    @Then("I receive validate BookStore Post the status code is response 200")
    public void receiveValidateBookstorePostTheStatusCodeIsResponse200() {
        bookPOST.receiveValidateBookstorePostTheStatusCodeIsResponse200();
    }

    @And("I receive valid data Post BookStore")
    public void receiveValidataPostBookstore() {
       bookPOST.receiveValidataPostBookstore();
    }

    @Given("I set api endopoints for Delete BookStoreid")
    public void setApiEndopointsForDeleteBookStoreid() {
        idBookDELETE.setApiEndopointsForDeleteBookStoreid();
        }

    @When("I send Http request Delete BookStoreid")
    public void sendtHttpRequestDelteBookStoreid() {
        idBookDELETE.sendtHttpRequestDelteBookStoreid();
        }

    @Then("I receive validate BookStoreid delete the status code is response 400")
    public void receiveValidateBookStoreidDeleteTheStatusCodeIsResponse400() {
        idBookDELETE.receiveValidateBookStoreidDeleteTheStatusCodeIsResponse400();
        }

    @And("I receive valid data Delete BookStoreid")
    public void validateDataDeleteBookStoreid(){
        idBookDELETE.validateDataDeleteBookStoreid();


        }

    @Given("I set api endopoints for get BookStoreid")
    public void setApiendopointsForgetBookStoreid () {
        idBookGET.setApiendopointsForgetBookStoreid();
        }

    @When("I send Http request get BookStoreid ")
    public void sendHttpRequestGetBookStoreid () {
        idBookGET.sendHttpRequestGetBookStoreid();

        }

    @Then("I receive verify BookStoreid get HTTP response 200 ")
    public void receiveVerifyBookStoreidGetHttpResponse200 () {
        idBookGET.receiveVerifyBookStoreidGetHttpResponse200();
        }

    @And("I receive valid data get BookStoreid ")
    public void receiveValidDataGetBookStoreid () {
        idBookGET.receiveValidDataGetBookStoreid();

        }

    @Given(" I set api endopoints for Put BookStoreid")
    public void setApiEndopointsForPutBookStoreid () {
         idBookPUT.receiveValidDataPutBookStoreid();
        }

    @When("I send Http request Put BookStoreid ")
    public void sendHttpRequestPutBookStoreid () {
         idBookPUT.sendHttpRequestPutBookStoreid();
        }

    @Then("I receive validate BookStoreid put the status code is response 200 ")
    public void receiveValidateBookStoreidPutTheStatusCodeisResponse200 () {
         idBookPUT.receiveValidateBookStoreidPutTheStatusCodeisResponse200();
        }

    @And("I receive valid data Put BookStoreid")
    public void receiveValidDataPutBookStoreid () {
        idBookPUT.receiveValidDataPutBookStoreid();
        }
}




