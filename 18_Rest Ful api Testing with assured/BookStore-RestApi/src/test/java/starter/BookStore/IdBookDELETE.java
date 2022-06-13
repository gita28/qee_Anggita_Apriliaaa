package starter.BookStore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class IdBookDELETE {

    protected static String url = "https://demoqa.com/BookStore/v1";

    @Step("I set api endopoints for Delete BookStoreid")
    public String setApiEndopointsForDeleteBookStoreid() {
        return url + "Books?UserId=Gita28";
    }
    @Step("I send Http request Delete BookStoreid")
    public void sendtHttpRequestDelteBookStoreid() {
        SerenityRest.given().get(setApiEndopointsForDeleteBookStoreid());
    }
    @Step("I receive validate BookStoreid delete the status code is response 400")
    public void receiveValidateBookStoreidDeleteTheStatusCodeIsResponse400() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data Delete BookStoreid")
    public void validateDataDeleteBookStoreid() {
        restAssuredThat(respose -> respose.body("'data'.'userid'", equalsTo("Gita28")));
        restAssuredThat(respose -> respose.body("'data'.'massege'", equalsTo("   ")));
    }
}










