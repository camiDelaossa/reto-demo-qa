# Proyecto de Pruebas Automatizadas

Este proyecto de pruebas automatizadas utilizando Cucumber y Serenity para probar la plataforma DemoQA.

## Requisitos Previos

- Java 8 o superior
- Maven 3.6 o superior
- Un IDE como IntelliJ IDEA o Eclipse (opcional)

## Descarga y Configuración de ChromeDriver

1. **Descargar ChromeDriver**: Ve a la [página de descargas de ChromeDriver](https://chromedriver.chromium.org/downloads) y selecciona la versión que corresponde a tu versión de Chrome.
2. **Agregar a la carpeta raíz**: Copia el archivo `chromedriver.exe` (o el correspondiente para tu sistema operativo) y pégalo en la carpeta raíz de tu proyecto, donde se encuentra el archivo `pom.xml`.


## Cómo Ejecutar las Pruebas

Las pruebas pueden ejecutarse utilizando Maven desde la línea de comandos en la raiz del proyecto.

### Ejecutar un Runner Específico

Para ejecutar un runner específico (por ejemplo, `TextBoxDemoQARunner`), utiliza el siguiente comando:

mvn test -Dtest=TextBoxDemoQARunner

### Ejecutar Todas las Pruebas de los Test Runners

Para ejecutar todas las pruebas configuradas en los test runners, utiliza el siguiente comando:

mvn test -Dtest=*Runner

