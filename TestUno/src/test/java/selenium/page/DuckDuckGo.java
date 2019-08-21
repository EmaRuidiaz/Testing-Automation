package selenium.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckDuckGo {


    public DuckDuckGo(WebDriver driver){
        PageFactory.initElements(driver, this  );
    }

    @FindBy(xpath = "//a[@href='https://twitter.com/' and @class='result__a']")
    private WebElement link;
    public void ClickPagina(){
        link.click();
    }

    @FindBy(id = "search_form_input_homepage")
    private WebElement BarraDeBusqueda;
    public void IngresarBusqueda(String consulta){
        BarraDeBusqueda.sendKeys(consulta);
        BarraDeBusqueda.sendKeys(Keys.TAB);
    }

    @FindBy(id = "search_button_homepage")
    private WebElement BotonBusqueda;
    public void PresionarBotonBusqueda(){
        BotonBusqueda.submit();
    }

    @FindBy(className = "StaticLoggedOutHomePage-input StaticLoggedOutHomePage-narrowLoginButton EdgeButton EdgeButton--secondary EdgeButton--small u-floatRight")
    private WebElement boton1;
    public void PresionarBoton1(){
        boton1.click();
    }

    @FindBy(xpath = "//button[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")
    private WebElement boton2;
    public void PresionarBoton2(){
        boton2.click();
    }

    @FindBy(xpath = "//div[@class='clearfix field']/input[@type='text']")
    private WebElement usuario;
    public void IngresarUser(String userParam){
        usuario.sendKeys(userParam);
        usuario.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//input[@class='js-password-field']")
    private WebElement password;
    public void IngresarPass(String passParam){
        password.sendKeys(passParam);
        password.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//a[@aria-label = 'Twittear']")
    private WebElement Twittear1;
    public void PresionarTweetear(){
        Twittear1.click();
    }

    @FindBy(xpath = "//div[@data-offset-key=\"2l2b4-0-0\" and @class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"]")
    private WebElement Tweet;
    public void IngresarTweet(String tweetParam){
        Tweet.sendKeys(tweetParam);
        Tweet.sendKeys(Keys.TAB);
    }

    @FindBy(xpath = "//div[@data-testid='tweetButtonInline']")
    private WebElement SendTweet;
    public void ShareTweet(){
        SendTweet.click();
    }

    public void RealizarBusqueda(String consulta, String userParam, String passParam, String tweetParam){
        IngresarBusqueda(consulta);
        PresionarBotonBusqueda();
        ClickPagina();
        PresionarBoton1();
        IngresarUser(userParam);
        IngresarPass(passParam);
        PresionarBoton2();
        PresionarTweetear();
        IngresarTweet(tweetParam);
        ShareTweet();
    }
}
