package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Detailpage extends PageObject {

    private By Detailpagefield() {
        return By.xpath("//*[@id=\"app\"]/div/div/div[1]");
    }

    private By ButtonAddYourCollectionfield() {
        return By.xpath("//*[@id=\"addNewRecordButton\"]  ");
    }

    private By ButtonBackToBookStorefield() {
        return By.xpath("//*[@id=\"addNewRecordButton\"]");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validatedetailpage() {
        return $(Detailpagefield()).isDisplayed();
    }

    @Step
    public void ClickButtonAddYourCollection() {
        $(ButtonAddYourCollectionfield()).click();
    }

    @Step
    public void ClickButtonBackToBookStore() {
        $(ButtonBackToBookStorefield()).click();

    }
}
