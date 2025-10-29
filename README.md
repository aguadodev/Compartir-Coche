# Compartir Coche

Programa Java con BD para compartir desplazamientos

## Sobre el proyecto

El proyecto consiste en una aplicación de consola que utiliza una base de datos MySQL para almacenar los datos persistentes de usuarios, viajes, pasajeros, etc. 

Para desarrolladores, el repositorio contiene:
- Código fuente en la carpeta `src`
- Estructura de la base de datos en `doc/compartircoche.sql`
- Librerías necesarias en la carpeta `lib`

Para usuarios, el repositorio contiene: 
- Fichero `Compartir-coche.jar` compilado con el JDK 25 que puede ejecutarse con el comando `java -jar Compartir-coche.jar`. Este ejecutable utiliza una base de datos de producción en Internet.
- Fichero `Compartir-coche.bat`: script para facilitar la ejecución del programa desde el entorno de escritorio de Windows.
- Fichero `Compartir-coche.sh`: script para facilitar la ejecución del programa desde el entorno de escritorio de Linux (Requerirá permisos de ejecución, `chmod +x Compartir-coche.sh`).

## Estructura de directorios

El repositorio contiene los siguientes directorios y ficheros:

- `src`: código fuente y tests
- `lib`: librerías de dependencias del proyecto
- `doc`: carpeta con documentación
- - `compartircoche.sql`: fichero con la estructura de la base de datos
- - `javadoc`: documentación generada con Javadoc
- `Compartir-coche.jar`: Bytecode del programa compilado con JDK 25

## Librerías y Dependencias

El proyecto utiliza las siguientes librerías que se incluyen en el repositorio:

- `mysql-connector-j-9.5.0.jar`: Conector ODBC para bases de datos MySQL/MariaDB
- `junit-platform-console-standalone-1.13.0-M3.jar`: Librería de pruebas unitarias JUnit 5
