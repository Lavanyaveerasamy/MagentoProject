
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*  PAGE OBJECT MODEL FRAMEWORK */

public class MagentoTest {
	@Test
	public void posCredetials() throws Exception {
		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Home h = new Home(driver);
		h.clickOnMyAccount();

		Login l1 = new Login(driver);
		l1.typeEmail("sucheendra.abc@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();

		Logout l2 = new Logout(driver);
		l2.clickOnLogout();

		driver.quit();
	}

}
