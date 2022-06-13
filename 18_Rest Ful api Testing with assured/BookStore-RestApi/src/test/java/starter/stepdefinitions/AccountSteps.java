package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import starter.Account.*;

public class AccountSteps {

    @Step
    AuthorizedPost authorizedPost;
    TokenPost tokenPost;
    UserDelete userDelete;
    UserGet userGet;
    UserPost userPost;

    @Given("I set api endopoints for Post Authorized")
    public void setApiEndpointsForPostAuthorized() {

        authorizedPost.setApiEndpointsForPostAuthorized();
    }

    @When("I send Http request Post Authorized")
    public void sendHttpRequestPostAuthorized() {

        authorizedPost.sendHttpRequestPostAuthorized();

    }

    @Then("I receive validate Authorized the status code is response 200")
    public void receiveValidateAuthorizedTheStatusCodeIsResponse200() {

        authorizedPost.receiveValidateAuthorizedTheStatusCodeIsResponse200();
    }

    @And("I receive valid data Post Authorized")
    public void receiveValidDataPostAuthorized() {

        authorizedPost.receiveValidDataPostAuthorized();
    }

    @Given("I set api endopoints for Post Token")
    public void setApiEndpointsForPostToken() {
        tokenPost.setApiEndpointsForPostToken();

    }

    @When("I send Http request Post Token")
    public void sendHttpRequestPostToken() {
        tokenPost.sendHttpRequestPostToken();

    }

    @Then("I receive validate Token the status code is response 200")
    public void receiveValidTokenTheStatusCodeIsResponse200() {
        tokenPost.receiveValidTokenTheStatusCodeIsResponse200();
    }

    @And("I receive valid data Post Token")
    public void receiveValidDataPostToken() {
        tokenPost.receiveValidDataPostToken();
    }

    @Given("I set api endopoints for Delete User")
    public void setPostApiEndopointsForDeleteUser() {
        userDelete.setPostApiEndopointsForDeleteUser();

    }

    @When("I send Http request Delete User")
    public void sendPostHttpRequestDeleteUser() {
        userDelete.sendPostHttpRequestDeleteUser();
    }

    @Then("I receive validate User Delete the status code is response 200")
    public void receiveValidateUserDeleteTheStatusCodeIsResponse200() {
        userDelete.receiveValidateUserDeleteTheStatusCodeIsResponse200();
    }

    @And("I receive valid data Delete User")
    public void receiveValidDataDeleteUser() {
        userDelete.receiveValidDataDeleteUser();
    }

    @Given("I set api endopoints for get User")
    public void setPostApiEndpointsForGetUser() {
        userGet.setPostApiEndpointsForGetUser();

    }

    @When("I send Http request get User")
    public void sendHttpRequestGetUser() {
        userGet.sendHttpRequestGetUser();
    }

    @Then("I receive verify User HTTP response 200")
    public void receiveVerifyUserHttpRequestResponse200() {
        userGet.receiveVerifyUserHttpRequestResponse200();
    }

    @And("I receive valid data get User")
    public void receiveValidDataGetUser() {
        userGet.receiveValidDataGetUser();
    }

    @Given("I set api endopoints for Post User")
    public void setPostApiEndpointsForGetUser() {
        userPost.setApiEndpointsForPostUser();

    }

    @When("I send Http request Post User")
    public void sendPostHttpRequestUser() {
        userPost.sendPostHttpRequestUser();
    }

    @Then("I receive validate User Post the status code is response 200")
    public void receiveValidateUserPostTheStatusCodeIsResponse200() {
        userPost.receiveValidateUserPostTheStatusCodeIsResponse200();
    }

    @And("I receive valid data Post User")
    public void receiveValidDataPostUser () {
        userPost.receiveValidDataPostUser();
    }
}




