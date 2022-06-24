package pages;


public class GooglePage extends BasePage{
    
    private String searchButton = "//html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";
    private String searchTextField = ".gLFyf.gsfi";


    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void clickgoogleSearch(){
        clickElement(searchButton);
    }

    public void clickgoogleSearchXpath(){
        clickElementXpath(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }


}
