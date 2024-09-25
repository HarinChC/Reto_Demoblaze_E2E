# language: es
  #Author:Harin Chaverra Coronado
    #Correo:Harin911227@hotmail.com
    #Correo:Harinchc11@gmail.com

Característica: como usuario del aplicativo de Demoblaze
  Como  usuario de la aplicación demoblaze y que
  Quiero realizar diferentes tareas en su aplicativo
  Requiero realizar el inicio de sesion con mi usuario y clave

  Antecedentes:
    Dado que el "usuario" ingresa a la url demoblaze

  @CA02 @Iniciarsesion @Regresion
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales e ir a la pantalla inicial
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Entonces veriamos la pantalla inicial
    Ejemplos:
      | usuario   | clave     |
      | Harinch1111 | Harinc123 |

  @CA03 @IniciarsesionValidarNombre @Regresion
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales e ir a validar su usuario
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Entonces veriamos el nombre de "<usuario>" en la pantalla inicial
    Ejemplos:
      | usuario    | clave     |
      | Harinch1111 | Harinc123 |