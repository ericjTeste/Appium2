package test;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import page.MenuPage;
import page.SplashPage;

public class SplashTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();

	@Test
	public void deveAguardarSplashSumir(){
		//acessar menu splash
		menu.acessarSplash();
		
		//verificar que o splash esta sendo exibido
		page.isTelaSplashVisivel();
		
		//aguardar saida do splash
		page.aguardarSplashSumir();
		
		//verificar que o formulario esta aparecendo
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
	}
}
