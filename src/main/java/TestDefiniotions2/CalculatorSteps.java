package TestDefiniotions2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by dell on 10.11.2016 г..
 */
public class CalculatorSteps {

    Calculator calculator = new Calculator();

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable{
        assertNotNull(calculator);      // to be sure that no get no values
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable{
        calculator.add(arg1, arg2);
        System.out.println(arg1);
        System.out.println("+");
        System.out.println(arg2);
        System.out.println("====");
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable{
        assertEquals(result, calculator.getResult());
        System.out.println(result);
    }

}
