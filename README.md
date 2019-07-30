# PruebaTecnica
Prueba Técnica de Automatización

# Configuración
A continuación relaciono las herramientas que debe tener instaladas y algunas configuraciones básicas

Eclipse Oxigen o Neon
JAVA 1.8 y JDK
Instalación
Configurar variables de Entorno
Maven
Instalación
Configurar variables de Entorno
Cucumber
Importar Proyecto
Build Path JREs

#ECLIPSE OXIGEN
Verifique la versión de Eclipse que tenga instalada, si aún no la ha instalado descarguela de la siguiente página : http://www.eclipse.org/downloads/eclipse-packages/

#JAVA
Verifique la versión de Java que tenga instalada, se recomienda la versión 1.8, si no la tiene descarguela de la pagina de Oracle:
http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html

#MAVEN
Descargue Maven desde http://maven.apache.org/index.html
Seleccionar Download y descargar el binary zip archive
Crear una carpeta en D:\Maven y descomprimir el archivo zip descargado previamente
Crear o actualizar las siguientes variables de entorno

MAVEN_HOME
D:\Maven\apache-maven-3.5.0
MAVEN
%MAVEN_HOME%\bin
JAVA_HOME
C:\Program Files\Java\jdk1.8.0_144 ‘Ruta del JDK
Agregar al path lo siguiente:
Path
%JAVA_HOME%\bin;%MAVEN%

Verificar la instalación de Maven: ingresa al cmd y escribe “mvn -version”

#AGREGAR PLUGIN CUCUMBER
Launch the Eclipse IDE and from Help menu, click “Install New Software”.
You will see a dialog window, click “Add” button.
Type name as you wish, let’s take “Cucumber” and type “http://cucumber.github.com/cucumber-eclipse/update-site” as location. Click OK.
You come back to the previous window but this time you must see Cucumber Eclipse Plugin option in the available software list. Just Check the box and press “Next” button.
Click on Next.
Click “I accept the terms of the license agreement” then click Finish.
Let it install, it will take few seconds to complete.
You may or may not encounter a Security warning, if in case you do just click OK.
You are all done now, just Click Yes.

#IMPORTAR PROYECTO
Importar proyecto:
Para importar: File > Import > Maven > Existing Maven Projects > Next
Next
Browse: seleccione la ruta donde se encuentra el proyecto
Finish, este proceso durará varios minutos
Verificar Build Path.
Clic derecho sobre “JRE System Library” > properties >
En la opción “Execution environment” seleccionar “JavaSE-1.8”

