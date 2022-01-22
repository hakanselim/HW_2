package hw_2.page;

import hw_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WarningMessage extends BasePage{

    public WarningMessage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//label[@for='dob']")
    public WebElement dateOfBirt;



    public String getMessage(){
       return dateOfBirt.getText();


    }
}
