package curso.treinamento.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;


public class MenuPage {
	
	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//
	}

	@FindBy(xpath = "//a[@href='#Cars']")
	private WebElement linkCars;

	@FindBy(xpath = "//ul[@id='Cars']/descendant::a[text()='Cars']")
	private WebElement subMenuCars;

	@FindBy(xpath = "//ul[@id='Cars']/descendant::a[text()='Extras']")
	private WebElement subMenuExtras;

	@FindBy(xpath = "//ul[@id='Cars']/descendant::a[text()='Cars Settings']")
	private WebElement subMenuCarsSettings;


	public void clikcarCars() {
		Helper.elemento_existe(linkCars, 10);
		linkCars.click();
	}

	public void validarElementosSubMenu(String menu, String subMenu) {
		
	    WebElement elemento  = Hooks.get_driver().findElement(By.xpath("//ul[@id='"+menu+"']/descendant::a[text()='"+subMenu+"']"));;
		Assert.assertTrue("Elemento Validado com sucesso", Helper.elemento_existe(elemento, 8));

	}

}
