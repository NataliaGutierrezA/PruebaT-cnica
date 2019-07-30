#Author: natyg.1988l@gmailcom
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Regresion
Feature: Búsqueda exitosa para la palabra pruebas
  El usuario debe poder realizar la búsqueda exitosa para la palabra pruebas

  @CasoExitoso
  Scenario: Realizar la búsqueda exitosa para la palabra pruebas
    Given Visito la plataforma de Google
    When Digito la palabra "pruebaz"
    When Selecciono la palabra correcta
    Then Verifico la cantidad de resultados
   
    
    	
   

