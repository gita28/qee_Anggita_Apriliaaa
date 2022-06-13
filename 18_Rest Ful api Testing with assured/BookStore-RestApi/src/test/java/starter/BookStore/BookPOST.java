package starter.BookStore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import netscape.javascript.JSObject;

public class BookPOST {
    protected static String url ="https://demoqa.com/BookStore/v1";

    @Step("I set api endopoints for Post BookStore")
    public String setApiEndopointsForPostBookStore () {
        return url + "Books";
    }
    @Step("I send Http request Post BookStore")
    public void sendHttpRequestPostBookStore () {
        JSObject requestBody = new JSObject();
        requestBody.put("userId", "Gita28");
        requestBody.put("collectionOfIsbns", "  ");
        requestBody.put("isbn", "9781449325862");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setApiEndopointsForPostBookStore());
    }

    @Step("I receive validate BookStore Post the status code is response 200")
    public void receiveValidateBookstorePostTheStatusCodeIsResponse200 () {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data Post BookStore")
    public void receiveValidataPostBookstore(){

        restAssuredThat(respose -> respose.body("'data'.'isbn'",equalsTo("9781449325862")));

    }
}


