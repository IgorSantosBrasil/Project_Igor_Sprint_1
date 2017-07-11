package TestDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    Checkout checkout = new Checkout();

    @When("^we have (\\d+) and (\\d+)$")
    public void weHaveApplecount(int applecount, int bananacound) {
        checkout.add(applecount, bananacound);
        System.out.println(applecount);
        System.out.println("+");
        System.out.println(bananacound);
        System.out.println("==="+ "\n" );
    }

   @Then("^their sum should be ([^\"]*)$")
    public void theirSumShouldBeTotalcound(int totalcound) {
        assertEquals(totalcound, checkout.getResult());
        System.out.println(totalcound);
    }

}
