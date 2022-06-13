package starter.Account;

import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;

public class UserGet {
    protected static String url = "https://demoqa.com/Account/v1";

    @Step("I set api endopoints for get User")
    public String setPostApiEndpointsForGetUser () {
        return url + "/User/{UUID}";
    }

    @Step("I send Http request get User")
    public void sendHttpRequestGetUser () {
        SerenityRest.given().get(setPostApiEndpointsForGetUser());
    }

    @Step("I receive verify User HTTP response 200")
    public void receiveVerifyUserHttpRequestResponse200 () {
        restAssuredThat(response ->response.statusCode(200));
    }
    @Step ("I receive valid data get User")
    public void receiveValidDataGetUser(){
        restAssuredThat(respose -> respose.body("'data'.'isbn'",equalsTo("1104")));
        restAssuredThat(respose -> respose.body("'data'.'title'",equalsTo("kesehatan")));
        restAssuredThat(respose -> respose.body("'data'.'subtitle'",equalsTo(" ")));
        restAssuredThat(respose -> respose.body("'data'.'author'",equalsTo("1104")));
        restAssuredThat(respose -> respose.body("'data'.'publish_date'",equalsTo("kesehatan")));
        restAssuredThat(respose -> respose.body("'data'.'publisher'",equalsTo(" ")));
        restAssuredThat(respose -> respose.body("'data'.'pages'",equalsTo("1104")));
        restAssuredThat(respose -> respose.body("'data'.'description'",equalsTo("kesehatan")));
        restAssuredThat(respose -> respose.body("'data'.'website'",equalsTo(" ")));

    }

}
