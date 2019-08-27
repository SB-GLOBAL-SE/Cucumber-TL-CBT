package io.cucumber.WYcart;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("^navigation to the URL of the WebOrders has been successful$")
    public void navigationToTheURLOfTheWebOrdersHasBeenSuccessful() {
        actionwords.navigationToTheURLOfTheWebOrdersHasBeenSuccessful();
    }

    @Given("^the username of \"(.*)\" is inputted into the username field$")
    public void theUsernameOfUserIsInputtedIntoTheUsernameField(String user, DataTable datatable) {
        actionwords.theUsernameOfUserIsInputtedIntoTheUsernameField(datatable, user);
    }

    @Given("^the password of \"(.*)\" is inputted into the password field$")
    public void thePasswordOfPasswordIsInputtedIntoThePasswordField(String password) {
        actionwords.thePasswordOfPasswordIsInputtedIntoThePasswordField(password);
    }

    @Given("^the 'Login' button is clicked$")
    public void theLoginButtonIsClicked() {
        actionwords.theLoginButtonIsClicked();
    }

    @Then("^a successful login will take place$")
    public void aSuccessfulLoginWillTakePlace() {
        actionwords.aSuccessfulLoginWillTakePlace();
    }

    @When("^I click the logout button$")
    public void iClickTheLogoutButton() {
        actionwords.iClickTheLogoutButton();
    }

    @Then("^I'm returned to the login window$")
    public void imReturnedToTheLoginWindow() {
        actionwords.imReturnedToTheLoginWindow();
    }

    @Given("^I have logged in$")
    public void iHaveLoggedIn() {
        actionwords.iHaveLoggedIn();
    }

    @Given("^I can go to the \"(.*)\" product page$")
    public void iCanGoToTheP1ProductPage(String p1) {
        actionwords.iCanGoToTheP1ProductPage(p1);
    }

    @When("^I click 'Add to Cart'$")
    public void iClickAddToCart() {
        actionwords.iClickAddToCart();
    }

    @Then("^my cart contains one of \"(.*)\"$")
    public void myCartContainsOneOfP1(String p1) {
        actionwords.myCartContainsOneOfP1(p1);
    }


    @Then("^the value is from the \"(.*)\"$")
    public void theValueIsFromTheP1(String p1) {
        actionwords.theValueIsFromTheP1(p1);
    }

    @Then("^this is a \"(.*)\"$")
    public void thisIsAP1(String p1) {
        actionwords.thisIsAP1(p1);
    }
}