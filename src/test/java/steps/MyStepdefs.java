package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("I test given tag2")
    public void iTestGiven() {
    }

    @When("I test when tag2")
    public void iTestWhen() {
        Assert.assertTrue("This is a message",false);
    }

    @Then("I test then tag2")
    public void iTestThen() {
    }
}
