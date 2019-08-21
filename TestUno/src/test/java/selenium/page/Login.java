package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login {

    public Login(WebDriver driver){
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

    @FindBy(id="search_query_top")
    private WebElement busqueda;
    public void Buscar(String busquedaParam){
        busqueda.sendKeys(busquedaParam);
    }

    @FindBy(name = "submit_search")
    private WebElement botonBuscar;
    public void PressBuscar(){
        botonBuscar.submit();
    }

    @FindBy(className = "logout")
    private  WebElement logOut;
    public void LogOut(){
        logOut.click();
    }

    public void RealizarCamino(String email, String password, String busqueda){
        WriteEmail(email);
        WritePassword(password);
        PressLogIn();
        Buscar(busqueda);
        PressBuscar();
        LogOut();
    }
}
