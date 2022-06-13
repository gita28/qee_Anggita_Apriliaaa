package starter.BookStore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class BookGET {

    protected static String url = "https://demoqa.com/BookStore/v1";

    @Step("I set api endopoints for get BookStore")
    public String setApiEndpointsForGetBookStore () {
        return url + "Books";
    }

    @Step("I send Http request get BookStore")
    public void sendHttpRequestGetBookStore() {
        SerenityRest.given().get(setApiEndpointsForGetBookStore());
    }

    @Step("I receive verify BookStore get HTTP response 200")
    public void receiveVerifyBookStoreGetHttpResponse200() {
        restAssuredThat(response ->response.statusCode(200));
    }
    @Step ("I receive valid data get BookStore")
    public void receiveValidDataGetBookStore(){
        restAssuredThat(respose -> respose.body("'data'.'isbn'",equalsTo("9781449325862")));
        restAssuredThat(respose -> respose.body("'data'.'title'",equalsTo("Git Pocket Guide")));
        restAssuredThat(respose -> respose.body("'data'.'subtitle'",equalsTo("A Working Introduction")));
        restAssuredThat(respose -> respose.body("'data'.'author'",equalsTo("Richard E. Silverman")));
        restAssuredThat(respose -> respose.body("'data'.'publish_date'",equalsTo("2020-06-04T08:48:39.000Z")));
        restAssuredThat(respose -> respose.body("'data'.'publisher'",equalsTo("O'Reilly Media")));
        restAssuredThat(respose -> respose.body("'data'.'pages'",equalsTo("234")));
        restAssuredThat(respose -> respose.body("'data'.'description'",equalsTo("This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git exp")));
        restAssuredThat(respose -> respose.body("'data'.'website'",equalsTo("http://chimera.labs.oreilly.com/books/1230000000561/index.html")));

    }

}