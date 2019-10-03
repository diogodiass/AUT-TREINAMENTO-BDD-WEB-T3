package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.utils.Helper;

public class HomePage {
	
	//Construtor para intanciar webDriver
	public HomePage(WebDriver driver) { 
		PageFactory.initElements(driver, this);//		
	}
	
	@FindBy (xpath = "//strong[contains(text(),'Logout')]")
	private WebElement linkLogout;
	
	@FindBy (xpath = "//a[@href='#Cars']")
	private WebElement linkCars;
	
	@FindBy (xpath = "//a[@href='#Cars']//following::a")
	private WebElement linkCarsMenu;
	

	
	public boolean validar_pagina() { 
		return Helper.elemento_existe(linkLogout, 10);
	}
	public void clikcarCars() {
		Helper.elemento_existe(linkCars, 10);
		linkCars.click();
	}
	
	public void validarItensCars() {
		
		
	}
	
	
}