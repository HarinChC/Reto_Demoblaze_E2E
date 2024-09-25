# language: es
  #Author:Harin Chaverra Coronado
    #Correo:Harin911227@hotmail.com
    #Correo:Harinchc11@gmail.com

@Regresion
Característica: registrar usuario en el aplicativo de Demoblaze
  Como posible usuario de la aplicación demoblaze y que
  Quiero realizar diferentes tareas en su aplicativo
  Requiero realizar el registro de mi usuario en la misma para tener los privilegios como cliente

  @CA01 @RegistrarUsuario
  Esquema del escenario: El cliente quiere registrarse en el aplicativo demoblaze
    Dado que el "usuario" ingresa a la url demoblaze
    Cuando se nos muestra la pantalla inicial
    Entonces hacemos clic en “Sing UP” para crear una cuenta "<usuario>""<clave>"
    Ejemplos:
      | usuario  | clave     |
      | Harinch5 | Harinchc3 |