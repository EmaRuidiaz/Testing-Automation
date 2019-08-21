package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement email;
    public void WriteEmail(String emailParam){
        email.clear();
        email.sendKeys(emailParam);
    }

    @FindBy(id = "passwd")
    private WebElement password;
    public void WritePassword(String passwordParam){
        password.clear();
        password.sendKeys(passwordParam);
    }

    @FindBy(id = "SubmitLogin")
    private WebElement boton;
    public void PressLogIn(){
        boton.click();
    }

    public void Iniciar(String email, String password){
        WriteEmail(email);
        WritePassword(password);
        PressLogIn();
    }
}
