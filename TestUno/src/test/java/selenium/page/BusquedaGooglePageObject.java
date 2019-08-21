package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaGooglePageObject {

    private WebDriver driver;

    public BusquedaGooglePageObject(WebDriver driver){
        this.driver = driver;
    }

    public void ingresarBusqueda( String consulta){
        WebElement campoDeBusqueda = driver.findElement(By.name("q"));
        campoDeBusqueda.sendKeys("Youtube");
        campoDeBusqueda.sendKeys(Keys.TAB);
    }

    public void clickBotonBusqueda(){
        WebElement botonBuscar = driver.findElement((By.name("btnK")));
        botonBuscar.submit();
    }
}
