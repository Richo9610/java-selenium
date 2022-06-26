package pages;


public class GooglePage extends BasePage{
    
    private String Loc_UserName = ".input_error.form_input#user-name";
    private String Loc_Password = ".input_error.form_input#password";
    private String user = "standard_user";
    private String password = "secret_sauce";
    private String Loc_dropDown = ".product_sort_container";
    private String Loc_spanValue = "za";
    private String Loc_logInButton = ".submit-button.btn_action";

    public GooglePage(){
        super(driver);
    }

    public void navigateToSauceDemo(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterUser(){
        write(Loc_UserName, user);
    }

    public void enterPassword(){
        write(Loc_Password, password);
    }

    public void openDropDown(){
        clickElement(Loc_dropDown);
    }

    public void logIn(){
        clickElement(Loc_logInButton);
    }

    public void selectValue(){
        selectFromDropdownValue(Loc_dropDown,Loc_spanValue);
    }

    public void pageLoaded(){
        verifyExpectedPageLoaded(Loc_dropDown);
    }

}
