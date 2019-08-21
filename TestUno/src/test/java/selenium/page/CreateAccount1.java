package selenium.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.lang.reflect.Array;

public class CreateAccount1 {

    public CreateAccount1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email_create")
    private WebElement email;

    @FindBy(id = "SubmitCreate")
    private WebElement botonaceptar;

    public void IngresarEmail(String emailParam){
        email.sendKeys(emailParam);
        email.sendKeys(Keys.TAB);}

    public void PresionarBoton(){botonaceptar.submit();}

    public void FirstStep(String emailParam){
        IngresarEmail(emailParam);
        PresionarBoton();
    }

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement name;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(id = "passwd")
    private WebElement pass;

    @FindBy(id = "days")
    private WebElement day;

    @FindBy(id = "months")
    private WebElement month;

    @FindBy(id = "years")
    private WebElement year;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "phone_mobile")
    private WebElement phone;

    @FindBy(id = "alias")
    private WebElement alias;

    @FindBy(id = "submitAccount")
    private WebElement createAccount;

    @FindBy(className = "logout")
    private WebElement logout;

    public void SecondStep(String firstName, String lastName, String passWord,
                           String dayP, String monthP, String yearP, String companyP,
                           String addressP, String cityP, String stateP, String postcodeP,
                           String countryP, String mobileP, String aliasP){
        gender.click();
        name.sendKeys(firstName);
        lastname.sendKeys(lastName);
        pass.sendKeys(passWord);
        day.sendKeys(dayP);
        month.sendKeys(monthP);
        year.sendKeys(yearP);
        company.sendKeys(companyP);
        address.sendKeys(addressP);
        city.sendKeys(cityP);
        state.sendKeys(stateP);
        postcode.sendKeys(postcodeP);
        country.sendKeys(countryP);
        phone.sendKeys(mobileP);
        alias.clear();
        alias.sendKeys(aliasP);
        createAccount.click();
        logout.click();

    }

}






