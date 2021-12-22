package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;

public class CliquesPage extends BasePage {

	public void cliqueLongo(){
		cliqueLongo(By.xpath("//*[@text='Clique Longo']"));
	}
	
	public String obterTextoCampo(){
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}
}
