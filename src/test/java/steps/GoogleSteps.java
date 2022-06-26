package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage sauceDemo = new GooglePage();

    @Given("^navegate to google$")
    public void navigateToGoogle(){
         sauceDemo.navigateToSauceDemo();
    }

    @When("^search something$")
    public void enterSearchCriteria(){
        sauceDemo.enterUser();
        sauceDemo.enterPassword();
        sauceDemo.logIn();

        sauceDemo.openDropDown();
        sauceDemo.selectValue();
    }

    @And("^Click the Search Button$")
    public void clickSearchButton(){
        
    }

    @Then("^Get results$")
    public void getResults(){
       
    }


}