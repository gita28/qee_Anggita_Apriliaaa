package starter.Account;

import java.io.FileWriter;
import java.io.IOException;

public class TokenPost {
    protected static String url ="https://demoqa.com/Account/v1";
    @Step("I set api endopoints for Post Token")
    public String setApiEndpointsForPostToken() {
        return url + "GenerateToken";
    }

    @Step("I send Http request Post Token")
    public void sendHttpRequestPostToken () {
        JSObject requestBody = new JSObject();
        requestBody.put("username", "Gita28");
        requestBody.put("password", "Gita123@");

        SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setApiEndpointsForPostToken());
    }

    @Step("I receive validate Token the status code is response 200")
    public void receiveValidTokenTheStatusCodeIsResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data Post Token")
    public void receiveValidDataPostToken (){
        restAssuredThat(respose -> respose.body("'data'.'token'",equalsTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkdpdGEyOCIsInBhc3N3b3JkIjoiR2l0YTEyM0AiLCJpYXQiOjE2NTQ5NjY3Njh9.qOEvFOA8mcPZiqHf18-Hbh40BHesWkZFaavhHPUkM78")));
        restAssuredThat(respose -> respose.body("'data'.'expires'",equalsTo("2022-06-18T16:59:28.128Z")));
        restAssuredThat(respose -> respose.body("'data'.'status'",equalsTo("Success")));
        restAssuredThat(respose -> respose.body("'data'.'result'",equalsTo("User authorized successfully.")));
    }
}



