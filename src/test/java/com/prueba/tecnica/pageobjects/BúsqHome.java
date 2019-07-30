package com.prueba.tecnica.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")

	public class BúsqHome extends PageObject{
	
		@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
		private WebElementFacade txtBuscar;
		
		@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")
		private WebElementFacade btnBuscar;
		
		@FindBy(xpath="//*[@id=\"taw\"]/div[2]/div/p/a")
		private WebElementFacade lblPalabra;
		
		public void Ingresar(String palabra) {
		txtBuscar.sendKeys(palabra);
		btnBuscar.click();
		
		}
		
		public void VerificarPalabra() {
			String labelv="pruebas";
			String strMensaje= lblPalabra.getText();
			assertThat(strMensaje, containsText(labelv));
			System.out.println("La palabra mostrada es "  +  strMensaje);
			
		}
		

}
