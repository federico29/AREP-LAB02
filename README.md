# Calculadora de media y desviación estándar
Este proyecto es una calculadora estadística que lee y procesa un conjunto de n números reales introducidos por un 
usuario desde un sitio web y calcula la media y desviación estándar. Esto se logra mediante la implementación de una lista enlazada 
y todos sus componentes.

## ¿Cómo empezar?
Para utilizar la aplicación web, solo debe hacer click en el botón morado de este documento, dicho botón lo dirigirá directamente a
la calculadora estadística.
En caso de que quiera tener una copia de este proyecto en su máquina local funcionando 
correctamente, siga las instrucciones mostradas en la sección de instalación.

### Requerimientos
Las siguientes herramientas son necesarias para que este proyecto funcione correctamente en su máquina:
- [Java 8](https://www.java.com/es/)
- [Maven](https://maven.apache.org/download.cgi)
- [GIT](https://git-scm.com/downloads)
- [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli)

### Instalación
Para que el proyecto esté listo para usarse, ejecute las siguientes instrucciones en el intérprete de 
comandos de su sistema operativo:

1. Ubíquese en el directorio donde desee guardar la copia de este repositorio
2. Abra el intérprete de comandos de su sistema operativo en dicho directorio y escriba los siguientes 
   comandos:
    - Clonar este repositorio:
        ```
        git clone https://github.com/federico29/AREP-LAB01.git
        ```
    - Compilar y empaquetar el código:
        ```
        mvn package
        ```

## Ejecutar pruebas
Para ejecutar las pruebas de este programa, abra el intérprete de comandos de su sistema operativo en 
el directorio del repositorio y escriba el siguiente comando:
```
mvn test
```

## Ejecutar el programa
Hay dos opciones para ejecutar el programa:
1. Abra el intérprete de comandos de su sistema operativo en el directorio del 
repositorio y escriba el siguiente comando:
```
java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebApp
```
Luego en su navegador de preferencia ingrese al siguiente enlace: http://localhost:4567/hello
2. Puede abrir la aplicación directamente dando click en el siguiente botón:
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://fathomless-coast-19607.herokuapp.com/hello)

## Generar documentación
Una vez clonado e instalado el proyecto, para generar la documentación del proyecto abra el intérprete 
de comandos de su sistema operativo en el directorio del repositorio y escriba el siguiente comando:
```
mvn javadoc:javadoc
```
Luego dirijase a la carpeta **\target\site\apidocs** y abra el archivo **index.html**.

## Construido y desplegado con
- Maven
- Java 8
- GIT
- Heroku

## Autor
- Federico Barrios Meneses - Estudiante de Ingeniería de Sistemas.

## Licencia
Este proyecto está bajo la Licencia GNU General Public License - ver 
[LICENSE.txt](https://github.com/federico29/AREP-LAB02/blob/master/LICENSE.txt) para más detalles.
