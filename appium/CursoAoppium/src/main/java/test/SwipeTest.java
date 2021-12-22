package test;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import page.MenuPage;

public class SwipeTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();

	@Test
	public void deveRealizarSwipe(){
		//acessar menu
		menu.acessarSwipe();
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		//swipe para direita
		menu.swipeRight();
		
		//verificar texto 'E veja se'
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		
		// clicar botão direita
		menu.clicarPorTexto("›");
		
		//verificar texto 'Chegar até o fim!'
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar at� o fim!"));
		
		// swipe esquerda
		menu.swipeLeft();
		
		//clicar botão esquerda
		menu.clicarPorTexto("‹");
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}
}
