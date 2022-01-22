package hw_2.page;

import com.github.javafaker.Faker;
import hw_2.utilities.BrowserUtils;
import hw_2.utilities.ConfigurationReader;
import hw_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NavigateToWebPageAndLogin extends BasePage {

    public NavigateToWebPageAndLogin(){
        PageFactory.initElements(Driver.get(),this);

    }
    @FindBy(xpath = "//a[@href='/sign-up.shtml']")
    public WebElement signInBttn;

    @FindBy(xpath = "//select[@name='map(title)']")
    public WebElement titleBox;

    @FindBy(xpath = "//input[@name='map(firstName)']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='form']")
    public WebElement submit;




    public void signIn(){


        signInBttn.click();

        Select dropDownTitle = new Select(titleBox);
        dropDownTitle.selectByValue(ConfigurationReader.get("title"));

        Faker credential=new Faker();
        firstName.sendKeys(credential.name().firstName());
        lastName.sendKeys(credential.name().lastName());
        submit.click();











    }

}
