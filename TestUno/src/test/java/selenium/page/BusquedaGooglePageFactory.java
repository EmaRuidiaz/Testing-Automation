package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusquedaGooglePageFactory {

    @FindBy(name = "q")
    private WebElement campoDeBusqueda;

    @FindBy(name = "btnK")
    private WebElement botonBuscar;

    @FindBy(className = "js-username-field email-input js-initial-focus")
    private WebElement user;

    @FindBy(className = "js-password-field")
    private WebElement pass;

    @FindBy(className = "submit EdgeButton EdgeButton--primary EdgeButtom--medium")
    private WebElement button;

    public BusquedaGooglePageFactory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void ingresarBusqueda(String consulta){
        campoDeBusqueda.sendKeys(consulta);
    }

    public void presionarBoton(){
        botonBuscar.submit();
    }

    public void ingresarUsuario(String usuario){ user.sendKeys(usuario); }

    public void ingresarContraseña(String contraseña){ pass.sendKeys(contraseña);}

    public void presionarBoton2() { button.submit();}



    public void buscarEnGoogle(String consulta){
        ingresarBusqueda(consulta);
        presionarBoton();
    }

    public void ingresarEnTwitter(String usuario, String contraseña){
        ingresarUsuario(usuario);
        ingresarContraseña(contraseña);
        presionarBoton2();
    }

}
