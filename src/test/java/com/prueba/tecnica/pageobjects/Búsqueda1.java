package com.prueba.tecnica.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Búsqueda1 extends PageObject{
		
	@FindBy(xpath="//*[@id=\"taw\"]/div[2]/div/p/a")
	private WebElementFacade txtPalabra;
	
	@FindBy(xpath="//*[@id=\"nav\"]/tbody/tr/td[8]/a")
		private WebElementFacade resultado;
	
	public void Seleccionar() {
		txtPalabra.click();
	}
	
			
	public boolean Verificar() {
	boolean Result=resultado.isPresent();
	if (Result) {
		System.out.println("La cantidad de resultados es mayor a 6");
	} else {
		System.out.println("La cantidad de resultados es menor a 6");
	}
	return Result;
	
	}
	
	
	

}
