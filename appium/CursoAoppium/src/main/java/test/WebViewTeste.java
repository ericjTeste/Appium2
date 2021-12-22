package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();

	@Test
	public void deveFazerLogin(){
		//acessar o menu
		menu.acessarSBHibrido();
		esperar(3000);
		page.entrarContextoWeb();
		
		//preencher email
		page.setEmail("a@a");
		
		//senha
		page.setSenha("a");
		
		//entrar
		page.entrar();
		
		//verificar
		Assert.assertEquals("Bem vindo, Wagner!", page.getMensagem());
	}
	
	@After
	public void tearDown(){
		page.sairContextoWeb();
	}
}
