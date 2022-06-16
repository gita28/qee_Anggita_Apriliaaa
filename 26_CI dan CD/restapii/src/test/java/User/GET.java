package User;

public class GET {

    public static String url = "           ";
    @Step("I set GET api endpoints")
    public string setEndpoint(){
        return url + "User/2";

    }

    @Step ("I send Get HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step ("I receive valid HTTP response code 200")
    public void validdateHttpResponseCode200() {
        retAssuredThat(response -> response.statusCode(200))
    }

    @Step("I receive valid data for detail user")
    public void validateDataDetail.User(){
        restAssuredThat(response -> response.body (matcher: "'data'.'id'") equalTo (operand: "2")));
        restAssuredThat(response -> response.body (matcher: "'data'.'first_name'") equalTo (operand: "janet")));
    }

}
