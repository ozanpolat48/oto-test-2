package FrondEnd2.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@id='user']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;


    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    public void login(String username, String password){

        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

}
