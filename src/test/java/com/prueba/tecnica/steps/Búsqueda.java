package com.prueba.tecnica.steps;

import com.prueba.tecnica.pageobjects.BúsqHome;
import com.prueba.tecnica.pageobjects.Búsqueda1;

import net.thucydides.core.annotations.Step;

public class Búsqueda {
	
	BúsqHome visitador;
	Búsqueda1 home;
	
	@Step
	public void visitarPagina() {
		visitador.open();
	}
	
	
	@Step
	public void ingresar(String palabra) {
		visitador.Ingresar(palabra);
	}

	@Step
	public void Seleccionar() {
		visitador.VerificarPalabra();
		home.Seleccionar();
	}

	@Step
	public void Verificar() {
		home.Verificar();
		
	}


}
