package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import page.AbasPage;
import page.AccordionPage;
import page.AlertaPage;
import page.CliquesPage;
import page.DragDropPage;
import page.FormularioPage;
import page.MenuPage;
import page.SBContasPage;
import page.SBHomePage;
import page.SBLoginPage;
import page.SBMenuPage;
import page.SBMovimentacaoPage;
import page.SBResumoPage;
import page.SplashPage;
import page.SwipeListPage;
import page.WebViewPage;

@RunWith(Suite.class)
@SuiteClasses({
	AbasPage.class,
	AccordionPage.class,
	AbasTeste.class,
	AccordionTeste.class,
	AlertTeste.class,
	//CalculadoraAsusTeste.class,
	CalculadoraTeste.class,
	CalculadoraTesteRodrigo.class,
	CliquesTeste.class,
	DragNDropTeste.class,
	FormularioTeste.class,
	OpcaoEscondidaTest.class,
	SBTeste.class,
	SplashTeste.class,
	SwipeElementTeste.class,
	SwipeTest.class,
	WebViewTeste.class,
	
})
public class SuiteTeste {

}
