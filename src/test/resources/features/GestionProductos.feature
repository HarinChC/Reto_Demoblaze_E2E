# language: es
  #Author:Harin Chaverra Coronado
    #Correo:Harin911227@hotmail.com

Característica: Gestión de productos en el aplicativo Demoblaze
  Como usuario registrado en la aplicación Demoblaze
  Quiero poder agregar y eliminar productos del carrito de compras
  Para realizar tareas como cliente y gestionar mis compras de forma eficiente.

  Antecedentes:
    Dado que el "usuario" ingresa a la url demoblaze

  @CA04 @ValidarCelulares
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales y validar Celular phone
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Y hacemos clic en la categoría de “Phone”
    Entonces veriamos los diferentes celulares
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA05 @ValidarDescripcionSamsung
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales y validar la descripcion
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Y hacemos clic en la categoría de “Phone”
    Y doy click en “Samsung galaxy s6 ”
    Entonces nos debe mostrar el label “Product description”
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA06 @ValidarModal
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales y validar el modal
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Y hacemos clic en la categoría de “Phone”
    Y doy click en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Entonces nos debe mostrar un modal con el mensaje "Product added"
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA07 @Validarcarrito
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales y validar el carrito
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Y hacemos clic en la categoría de “Phone”
    Y doy click en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Y acedemos al carrito para verificar que este agregado el telefono
    Entonces nos debe mostrar el telefono "Samsung galaxy s6"
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA08 @EliminarTelefonoDelCarrito
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales y validar la eliminacion del carrito
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Y hacemos clic en la categoría de “Phone”
    Y doy click en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Y acedemos al carrito para verificar que este agregado el telefono
    Y procedemos a eliminar el telefono
    Entonces veriamos la eliminacion del telefono
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |

  @CA09 @CerrarSesionFinalizar
  Esquema del escenario: El cliente quiere iniciar sesion con sus credenciales y cerrar sesion
    Cuando ingresamos con nuestras credenciales "<usuario>""<clave>"
    Y  hacemos click en “Log in” para ingresar con nuestra cuenta
    Y hacemos clic en la categoría de “Phone”
    Y doy click en “Samsung galaxy s6 ”
    Y hacemos clic en “Add to Cart ”
    Y acedemos al carrito para verificar que este agregado el telefono
    Y procedemos a eliminar el telefono
    Y Cierra la sesion del usuario
    Entonces veriamos la pantalla inicial
    Ejemplos:
      | usuario     | clave     |
      | Harinch001 | Harinc001* |