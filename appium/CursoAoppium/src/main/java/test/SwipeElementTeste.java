package test;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import page.MenuPage;
import page.SwipeListPage;

public class SwipeElementTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void deveResolverDesafio(){
		//1 - clicar swipe list
		menu.clicarSwipeList();
		
		//2 - op1 para direita
		page.swipeElementRight("Op��o 1");
		
		//3 - op1 +
		page.clicarBotaoMais();
		
		//4 - Verificar op1+
		Assert.assertTrue(page.existeElementoPorTexto("Op��o 1 (+)"));
		
		// 5 - op4 para direita
		page.swipeElementRight("Op��o 4");
		
		// 6 - op4 -
		page.clicarPorTexto("(-)");
		
		//7 - verificar op4-
		Assert.assertTrue(page.existeElementoPorTexto("Op��o 4 (-)"));
		
		//8 - op5 para esquerda
		page.swipeElementLeft("Op��o 5 (-)");
		
		//9 - verificar op5
		Assert.assertTrue(page.existeElementoPorTexto("Op��o 5"));
	}
}
