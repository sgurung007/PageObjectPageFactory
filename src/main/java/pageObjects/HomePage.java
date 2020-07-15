package pageObjects;

import org.example.base.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePageClass {

    @FindBy(linkText = "All Departments")
    WebElement allDepartment;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public AllDepartment checkAllDepartment() {
        allDepartment.click();
        return new AllDepartment(driver);
    }
}
