package com.prueba.tecnica.definition;

import com.prueba.tecnica.steps.Búsqueda;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Busqueda {
	
	@Steps
	Búsqueda busquedStep;
	
	
	@Given("^Visito la plataforma de Google$")
	public void visito_la_plataforma_de_Google() throws Throwable {
	      busquedStep.visitarPagina();
	}

	

	@When("^Digito la palabra \"([^\"]*)\"$")
	public void digito_la_palabra(String palabra)throws Throwable {
		 busquedStep.ingresar(palabra);
		 
		} 
	

	@When("^Selecciono la palabra correcta$")
	public void selecciono_la_palabra_correcta() {
		busquedStep.Seleccionar();
	}

	@Then("^Verifico la cantidad de resultados$")
	public void verifico_la_cantidad_de_resultados() {
		busquedStep.Verificar();
	}
}

