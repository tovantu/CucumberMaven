package steps;


import io.cucumber.java.en.*;
import util.WebPage;

public class HomePageSteps {
    WebPage webPage = new WebPage();

    @Given("I test given")
    public void iTestGiven() throws InterruptedException {
        System.out.println("I test given");
        webPage.homePage.inputIntoSearchField("ahi");
    }

    @When("I test when")
    public void iTestWhen() {
        System.out.println("I test when");
    }

    @Then("I test then")
    public void iTestThen() {
        System.out.println("I test then");
//        Assert.assertTrue(false);
    }
}
