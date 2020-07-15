package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    //1:22
    @FindBy(xpath = "//*[@id=\"headerMyAccountTitle\"]/div")
    WebElement Button1;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void loginTest() {
        Button1.click();
    }
}
