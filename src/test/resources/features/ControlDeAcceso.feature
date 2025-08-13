# language: es
  #Author:Harin Chaverra Coronado
    #Correo:Harin911227@hotmail.com

Característica: Gestión de autenticación en el aplicativo Demoblaze
  Como usuario o posible usuario del aplicativo Demoblaze
  Quiero poder registrarme e iniciar sesión en la plataforma
  Para realizar diferentes tareas y acceder a los privilegios como cliente

  Antecedentes:
    Dado que el "usuario" ingresa a la url demoblaze

  @CA01 @RegistrarUsuario
  Esquema del escenario: El cliente quiere registrarse en el aplicativo demoblaze
    Cuando se nos muestra la pantalla inicial
    Entonces hacemos clic en “Sing UP” para crear una cuenta "<usuario>""<clave>"
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA02 @Iniciarsesion
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales e ir a la pantalla inicial
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Entonces veriamos la pantalla inicial
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA03 @IniciarsesionValidarNombre
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales e ir a validar su usuario
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Entonces veriamos el nombre de "<usuario>" en la pantalla inicial
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |