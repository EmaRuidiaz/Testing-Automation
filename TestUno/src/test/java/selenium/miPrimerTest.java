package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.page.CreateAccount1;
import selenium.page.DuckDuckGo;
import selenium.page.Login;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class miPrimerTest {

    WebDriver driver;

    @BeforeMethod
    public void inicializarBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void cerrarBrowser(){
        if (driver != null){
            driver.quit();
        }
    }

    @Test
    public void Navegacion() throws InterruptedException{
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        //driver.get("https://duckduckgo.com/");



        String email = "efr11@gmail.com";
        String pass = "123123123";
        CreateAccount1 Register = new CreateAccount1(driver);

        Register.FirstStep(email);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Register.SecondStep("Emanuel","Ruidiaz",pass,
                "2","June","1995", "Informatorio", "ArturoIllia - 1055",
                "Sacramento", "California", "94203", "United States",
                "3624587914", "Mi Dirección");

        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Login SignIn = new Login(driver); //Separar login de busqueda y de logout
        //Thread.sleep(5000);
        SignIn.RealizarCamino(email, pass,"Camiseta de Boca 2019");



        //BusquedaGooglePageObject busqueda = new BusquedaGooglePageObject(driver);
       // busqueda.ingresarBusqueda("Twitter login");
       // busqueda.clickBotonBusqueda();

        //BusquedaGooglePageFactory busquedaGooglePageFactory = new BusquedaGooglePageFactory(driver);
        //busquedaGooglePageFactory.buscarEnGoogle("Twitter EmaRuidiaz");


        //GoogleResultsPageFactory googleResultsPageFactory = new GoogleResultsPageFactory(driver);
        //googleResultsPageFactory.abrirPaginaYoutube();

       // busquedaGooglePageFactory.ingresarEnTwitter("EmaRuidiaz", "contraseña1234");

        //DuckDuckGo Busqueda = new DuckDuckGo(driver);
        //Busqueda.RealizarBusqueda("Twitter","EmaRuidiaz","123","Hola, soy un tweet enviado a través de un test automatizado. Java - TAE");

        //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Resistencia Wiki", Keys.TAB);
        //driver.findElement(By.xpath("//input[@name='btnK']")).submit();

    }
}
