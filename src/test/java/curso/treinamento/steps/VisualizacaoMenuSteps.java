package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;

public class VisualizacaoMenuSteps {

	MenuPage menupage = new MenuPage(Hooks.get_driver());
	HomePage homePage = new HomePage(Hooks.get_driver());

	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {

		homePage.validar_pagina();

	}

	@Quando("acesso o menu Cars")
	public void acesso_o_menu_Cars() {

		menupage.clikcarCars();

	}

	@Então("são apresentados os itens {string}, {string}")
	public void são_apresentados_os_itens_e(String string, String string2) {

		menupage.validarElementosSubMenu(string, string2);

	}

}
