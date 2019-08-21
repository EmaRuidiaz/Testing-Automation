package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPageFactory {
    @FindBy(xpath = "//a/h3[text()='The Ruidi (@EmaRuidiaz) | Twitter']")
    private WebElement page;

    public GoogleResultsPageFactory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void abrirPaginaYoutube(){
        page.click();
    }
}
