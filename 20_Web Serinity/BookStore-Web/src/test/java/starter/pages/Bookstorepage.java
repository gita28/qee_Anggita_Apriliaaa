package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Bookstorepage extends PageObject {

    private By BookStorefield() {
        return By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]");
    }

    private By ButtonClickBooks() {
        return By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a");
    }

    @Step
    public void openPage() {
        open();
    }
    @Step
    public void clickBookStore() {
        $(ButtonClickBooks()).click();
    }
    @Step
    public void validateOnBookStoreField() {
        $(BookStorefield()).isDisplayed();
    }

}





