package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Registerpage extends PageObject {


    private By FristNameField() {
        return By.xpath("//*[@id=\"firstname\"]");
    }

    private By LastNameField() {
        return By.xpath("//*[@id=\"lastname\"]");
    }

    private By UserNameField() {
        return By.xpath("//*[@id=\"userName\"]");
    }

    private By ImNotRobotField(){return By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"); }

    private By PaswordField() {
        return By.xpath("//*[@id=\"password\"]");
    }

    private By ButtonRegisterField() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(ButtonRegisterField()).isDisplayed();
    }

    @Step
    public void inputFristName(String fristname) {
        $(FristNameField()).type(fristname);

    }

    @Step
    public void inputLastName(String lastname) {
        $(LastNameField()).type(lastname);
    }

    @Step
    public void inputUserName(String username) {
        $(UserNameField()).type(username);

    }

    @Step
    public void inputPassword(String password) {
        $(PaswordField()).type(password);
    }

    @Step
    public void clickImNotRobot(String imnotrobot) {
        $(ImNotRobotField()).type(imnotrobot);

}
    @Step
    public void clickRegisterButton(){
        $(ButtonRegisterField()).click();
    }
}






