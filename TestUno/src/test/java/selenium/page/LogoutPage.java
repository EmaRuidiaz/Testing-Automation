package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


	@FindBy(className = "logout")
    private WebElement logoutButton;

    private void logout() {
        logoutButton.click();
    }

    public void salir() {
        logout();
    }

}
