package page;

import org.openqa.selenium.By;

import core.BasePage;

public class SBLoginPage extends BasePage {

	public void setEmail(String email) {
		escrever(By.className("android.widget.EditText"), email);
	}
	
	public void setSenha(String senha) {
		escrever(By.xpath("//android.widget.EditText[2]"), senha);
	}
	
	public void entrar(){
		clicarPorTexto("ENTRAR");
	}
}
