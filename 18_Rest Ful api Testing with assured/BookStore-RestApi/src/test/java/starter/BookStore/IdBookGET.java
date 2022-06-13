package starter.BookStore;

public class IdBookGET {

    protected static String url = "https://demoqa.com/BookStore/v1";

    @Step("I set api endopoints for get BookStoreid")
    public String setApiendopointsForgetBookStoreid () {
        return url + "ISBN=9781449325862";
    }

    @Step("I send Http request get BookStoreid")
    public void sendHttpRequestGetBookStoreid () {
        SerenityRest.given().get(setApiendopointsForgetBookStoreid());
    }

    @Step("I receive verify BookStoreid get HTTP response 200")
    public void receiveVerifyBookStoreidGetHttpResponse200 () {
        restAssuredThat(response ->response.statusCode(200));
    }
    @Step ("I receive valid data get BookStoreid")
    public void receiveValidDataGetBookStoreid(){
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
