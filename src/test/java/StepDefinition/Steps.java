package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Steps {
    int a;
    int b;
    int sum;
    @Given("^two numbers$")
    public void number(){
         a = 5;
         b = 10;
    }
    @When("^sum two numbers$")
    public void sum(){
        sum = a + b;
    }
    @Then("^check sum$")
    public void checSum(){
        assertEquals(sum,15);
    }
}
