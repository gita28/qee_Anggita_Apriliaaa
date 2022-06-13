package starter.Account;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserDelete {
    protected static String url ="https://demoqa.com/Account/v1";

    @Step("I set api endopoints for Delete User")
    public String setPostApiEndopointsForDeleteUser() {
        return url + "User/{UUID}";
    }

    @Step("I send Http request Delete User")
    public void sendPostHttpRequestDeleteUser() {
        JSObject requestBody = new JSObject();
        requestBody.put("email", "alexunder@email.com");
        requestBody.put("password", "123123123");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setPostApiEndopointsForDeleteUser());
    }

    @Step("I receive validate User Delete the status code is response 200")
    public void receiveValidateUserDeleteTheStatusCodeIsResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data Delete User")
    public void receiveValidDataDeleteUser (){
        restAssuredThat(response -> response.statusCode(400));

    }

}
