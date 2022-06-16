package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Homepage extends PageObject {

   private By Homepagefield(){
       return By.xpath("//*[@id=\"books-wrapper\"]/div[1]");
   }
    private By ButtonGotoBookStorefield() {
        return By.xpath("//*[@id=\"gotoStore\"]");
    }

    private By ButtonDeleteAllBooksfield() {
        return By.xpath("//*[@id=\"submit\"]");
    }


    @Step
    public void openPage() {
        open();
    }

    @Step
    public void clickButtonGoToBookStore() {
        $(ButtonGotoBookStorefield()).click();

    }
    @Step
    public void clickButtonDeleteAllBooks() {
        $(ButtonDeleteAllBooksfield()).click();

    }
    @Step
    public boolean validateOnHomepage() {
        return $(Homepagefield()).isDisplayed();

    }
}


