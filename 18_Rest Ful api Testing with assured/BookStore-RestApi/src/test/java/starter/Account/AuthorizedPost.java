package starter.Account;

import java.io.FileWriter;
import java.io.IOException;

public class AuthorizedPost {

    protected static String url = "https://demoqa.com/Account/v1";

    @Step("I set api endopoints for Post Authorized")
    public String setApiEndpointsForPostAuthorized() {
        return url + "Authorized";
    }

    @Step("I send Http request Post Authorized")
    public void sendHttpRequestPostAuthorized() {
        JSObject requestBody = new JSObject();
        requestBody.put("username", "Gita28");
        requestBody.put("password", "Gita123@");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setApiEndpointsForPostAuthorized());
    }

    @Step("I receive validate Authorized the status code is response 200")
    public void receiveValidateAuthorizedTheStatusCodeIsResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data Post Authorized")
    public void receiveValidDataPostAuthorized() {
        Response response = SerinityRes.lastResponse();
        Integer Authorized = response.body().path("user[0].Authorized");
        try (FileWriter file = new FileWriter("src//test//resources//token.json//token.json")) {
            file.write(Authorized);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

