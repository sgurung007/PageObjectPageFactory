package pageObjects;

import org.example.base.BasePageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllDepartment extends BasePageClass {



    @FindBy(xpath = "//div[2]//div[1]//div[1]//p[1]//a[1]//strong[1]")
    WebElement electricalButton;

    public AllDepartment(WebDriver driver) {
        super(driver);
    }


    public Electricalpage checkElectrical() {
        electricalButton.click();
        return new Electricalpage(driver);
    }


}
