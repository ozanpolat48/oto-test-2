package FrondEnd2.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{


    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']//img")
    public WebElement eDropdownButton;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement logOutButton;






}



