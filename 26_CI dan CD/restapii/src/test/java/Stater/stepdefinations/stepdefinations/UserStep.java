package Stater.stepdefinations.stepdefinations;

import User.GET;
import User.GET;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStep {
    @Steps
    GET get;
    public void setGetApiEndpoints()

    @Given ("I set GET spi endpint")
    public void serGetApiEndpoints(){
        get.setEndpoint();
    }
    @When ("I set Get HTTP request")
    public void sendGetHttpRequest() {
        get.sendGetHttpRequest();
    }

    @Then("I receive valid Http response code 200")
    public void receiveValidHttpResponse(){
        get.validdateHttpResponseCode200();
    }

    @And("I receive valid data doe deatail user")
    public void receiveValidDataForDetailUser(){
        get.validdateDataDetailUser();
    }
}









