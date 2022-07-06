package FrondEnd2.StepDefinitions;

import FrondEnd2.Pages.DashboardPage;
import FrondEnd2.Pages.LoginPage;
import FrondEnd2.Utilities.BrowserUtils;
import FrondEnd2.Utilities.ConfigurationReader;
import FrondEnd2.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDef {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user able to navigates login page")
    public void userAbleToNavigatesLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("user logged in with username as {string} and password as {string}")
    public void userLoggedInWithUsernameAsAndPasswordAs(String username, String password) {
        loginPage.login(username, password);
        loginPage.loginButton.click();


    }

    @And("user clicks on logout button")
    public void userClicksOnLogoutButton() {
        dashboardPage.eDropdownButton.click();
        BrowserUtils.waitFor(5);

        dashboardPage.logOutButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user successfully logout")
    public void user_successfully_logout() {

        BrowserUtils.waitFor(5);
        if (Driver.getDriver().getCurrentUrl().equals("https://qa.seamlessly.net/index.php/apps/files/?dir=/&fileid=2503")){
            Assert.fail();
        }else {
            Assert.assertTrue(true);
        }

    }


    @And("user clicks navigate back button on browser")
    public void userClicksNavigateBackButtonOnBrowser() {
        BrowserUtils.waitFor(5);
        Driver.getDriver().navigate().back();

    }
}
