package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_query_top")
    private WebElement busqueda;
    private void buscar(String busquedaParam){
        busqueda.sendKeys(busquedaParam);
    }

    @FindBy(name = "submit_search")
    private WebElement botonBuscar;
    private void PressBuscar(){
        botonBuscar.submit();
    }
    
    public void Busqueda(String busqueda) {
    	buscar(busqueda);
    	PressBuscar();    	
    }

}
