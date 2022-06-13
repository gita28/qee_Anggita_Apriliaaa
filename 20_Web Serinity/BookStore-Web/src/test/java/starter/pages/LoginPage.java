package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    private By userNameField(){
        return By.xpath("   ");
    }

    private By passwordField(){
        return By.xpath("   ");
    }

    private By loginButton() {
        return By.xpath("    ");

    }

    @Step public void openPage(){
        open();
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String Username){
        $(userNameField()).type(Username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

}


