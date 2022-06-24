package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage google = new GooglePage();

    @Given("^navegate to google$")
    public void navigateToGoogle(){
         google.navigateToGoogle();
    }

    @When("^search something$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("pato donald");
        google.clickElement(".o3j99.LLD4me");
        
    }

    @And("^Click the Search Button$")
    public void clickSearchButton(){
        google.clickgoogleSearchXpath();
    }

    @Then("^Get results$")
    public void getResults(){}


}