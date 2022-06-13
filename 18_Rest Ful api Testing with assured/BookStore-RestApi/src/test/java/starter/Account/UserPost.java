package starter.Account;

import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;

public class UserPost {

        protected static String url ="https://demoqa.com/Account/v1";

        @Step("I set api endopoints for Post User")
        public String setApiEndpointsForPostUser() {
            return url + "User";
        }

        @Step("I send Http request Post User")
        public void sendPostHttpRequestUser () {
            JSObject requestBody = new JSObject();
            requestBody.put("username", "Gita28");
            requestBody.put("password", "Gita123@");

            SerenityRest.given().header("Content-Type", "applications/json").body(requestBody.toJSONString()).post(setApiEndpointsForPostUser());
        }

        @Step("I receive validate User Post the status code is response 200")
        public void receiveValidateUserPostTheStatusCodeIsResponse200() {
            restAssuredThat(response -> response.statusCode(200));
        }

        @Step("I receive valid data Post User")
        public void receiveValidDataPostUser (){
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
