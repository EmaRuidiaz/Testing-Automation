package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import selenium.page.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class miPrimerTest {

    WebDriver driver;
    String email = "apo1234@gmail.com";
    String pass = "123123123";

    @BeforeClass
    public void inicializarBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterClass
    public void cerrarBrowser(){
        if (driver != null){
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void registration() throws InterruptedException{
        
        //driver.get("https://duckduckgo.com/");
        CreateAccount1 Register = new CreateAccount1(driver);

        Register.FirstStep(email);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Register.SecondStep("Emanuel","Ruidiaz",pass,
                "2","June","1995", "Informatorio", "ArturoIllia - 1055",
                "Sacramento", "California", "94203", "United States",
                "3624587914", "Mi Dirección");

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
    
    @Test(priority = 2)
    public void LogIn() {
    	LoginPage LoginPage = new LoginPage(driver);
    	LoginPage.Iniciar(email,pass);
    }
    
    @Test(priority = 3)
    public void Search() {
    	SearchPage busqueda = new SearchPage(driver);
    	busqueda.Busqueda("Camiseta de Boca 2019");
    	Assert.assertEquals(actual, expected);
    	
    }
    
    @Test(priority = 4)
    public void Logout() {
    	LogoutPage Salir = new LogoutPage(driver);
    	Salir.salir();
    }
    
}
