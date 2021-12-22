package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeListPage extends BasePage {

	public void swipeElementLeft(String opcao) {
		swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRight(String opcao) {
		swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
	}
	
	public void clicarBotaoMais(){
		MobileElement botao = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
		new TouchAction<>(getDriver())
		    .tap(TapOptions.tapOptions().withElement(ElementOption.element(botao, -50, 0)))
			.perform();
	}
}
