package starter.BookStore;

import netscape.javascript.JSObject;

import java.io.FileWriter;
import java.io.IOException;

public class BookDELETE {

        protected static String url ="https://demoqa.com/BookStore/v1";


        @Step("I set api endopoints for Delete BookStore")
        public String setApiEndpointsForDeleteBookStore() {
            return url + "Books?UserId=Gita28";
        }

        @Step("I send Http request Delete BookStore")
        public void sendHttpRequestDeleteBookStore() {
            SerenityRest.given().get(setApiEndpointsForDeleteBookStore());
        }

        @Step("I receive validate BookStore Delete the status code is response 400")
        public void receiveValidBookStoreDeleteTheStatusCodeIsResponse400() {
            restAssuredThat(response -> response.statusCode(200));
        }

        @Step("I receive valid data Delete BookStore")
        public void receiveValidDataDeleteBookStore() {

            restAssuredThat(respose -> respose.body("'data'.'userid'", equalsTo("Gita28")));
            restAssuredThat(respose -> respose.body("'data'.'massege'", equalsTo("   ")));
    }
}
