package stepDef.Web;

import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Web.LoginPage;
import page.Web.SignupPage;

public class LoginStefDef {
    LoginPage loginPage;
    SignupPage signupPage;
    Utility util = new Utility();

    public LoginStefDef() {
        this.loginPage = new LoginPage();
        this.signupPage = new SignupPage();
    }

    @And("user clicks on the login menu in the navbar")
    public void userClicksOnTheLoginMenuInTheNavbar() {
        loginPage.clickLoginLabel();
    }

    @And("user enters username {string} on login page")
    public void userEntersUsernameOnLoginPage(String username) {
        loginPage.loginUsername(username);
    }

    @And("user enters password {string} on login page")
    public void userEntersPasswordOnLoginPag(String password) {
        loginPage.loginPassword(password);
    }

    @When("user click the login button")
    public void userClickTheLoginButton() {
        loginPage.clickBtnLogin();
    }

    @Then("the user should see a welcome greeting")
    public void theUserShouldSeeAWelcomeGreeting() {

    }

    @Then("the user should see a welcome message {string}")
    public void theUserShouldSeeAWelcomeMessage(String expectedMessage) throws InterruptedException {
        Thread.sleep(2000);
        loginPage.greetingUser(expectedMessage);
    }
}
