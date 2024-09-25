# Reto_Demoblaze
Escenarios creados dentes flujos del aplicativo DEMOBLAZE
# Descripción
Este repositorio contiene las pruebas automatizadas para validar el funcionamiento de la aplicación web DemoBlaze. Las pruebas se han diseñado para cubrir los siguientes escenarios:

# Registro de usuario:
Validar el proceso de creación de una nueva cuenta.

# Inicio de sesión:
Verificar que los usuarios registrados puedan iniciar sesión correctamente.
Navegación: Asegurar que la navegación entre las diferentes secciones de la página funciona correctamente.
Añadir productos al carrito: Comprobar que los productos se añaden correctamente al carrito de compras.
Gestión del carrito: Validar las funcionalidades de eliminar productos del carrito y realizar el logout.
Prerrequisitos


# Herramientas:
Asegúrate de tener instaladas las siguientes herramientas o paquetes:
[Lista de herramientas utilizadas, por ejemplo, java, gradle, Intelij, etc.]
Configuración: Configura tu entorno de desarrollo según las instrucciones de las herramientas utilizadas.
Ejecución de las Pruebas

Clonar el repositorio: 
Bash git clone https://github.com/HarinChC/Reto_Demoblaze.git
Usa el código con precaución. 
E instala las dependencias primeramente:

# Comando para instalar las dependencias, por ejemplo, con gradle:
Dirigete a la parte derecha del aplicativo Intelij encontraras el icono de gradle (Elefante) y ejecuta el actualizardor de dependencias

# Ejecutar las pruebas:
Dirigete a la carpeta  con ruta src/test/java/co/com/demoblaze/www/runners y hay encontraras los ejecutables (Runners) de cada escenario de prueba


# Estructura del proyecto


### Main: 
Contiene los archivos de codigo fuente principal del proyecto de automatizacion(userinterfaces,utils,tasks...)
### Tests:
Contiene los archivos de prueba individuales para cada escenario.

### userinterfaces:
Contiene los objetos de página que representan los diferentes Elementos que se interactua de la aplicación.
### utils: 
Contiene funciones utilitarias utilizadas en las pruebas en este caso las costantes.
### interactions: 
Contiene las interaciones basicas que fueron requeridas para interactura con los elementos de la aplicacion
### Questions: 
Contiene las validaciones que se realizaron en la ejecucion del proyecto
### Tasks:
Contiene todas las tareas que se ejecutaran en la automatizacion

## Escenarios de Prueba
Los siguientes escenarios de prueba están cubiertos, tener presente que el escenario de cierre de sesion es el mas completo:

##### CA01: Registro de un nuevo usuario
##### CA02: Inicio de sesión de un usuario registrado
##### CA03: Verificación de que el nombre de usuario aparece después de iniciar sesión
##### CA04: Navegación a la categoría de "Phone"
##### CA05: Selección de un producto específico ("Samsung galaxy s6")
##### CA06: Adición del producto al carrito
##### CA07: Verificación del producto en el carrito
##### CA08: Eliminación del producto del carrito
##### CA09: Cierre de sesión

