package co.com.demoblaze.www.stepDefinitions;


import co.com.demoblaze.www.interactions.*;
import co.com.demoblaze.www.questions.*;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionesTelefonos_StepDefinition {

    @Cuando("hacemos clic en la categoría de “Phone”")
    public void hacemosClicEnLaCategoriaDePhone() {
        theActorInTheSpotlight().attemptsTo(IrATelefonos.ir());
    }

    @Entonces("veriamos los diferentes celulares")
    public void veriamosLosDiferentesCelulares() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionTelefonos.valida()));
    }

    @Entonces("nos debe mostrar el label “Product description”")
    public void nosDebeMostrarElLabelProductDescription() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionDescripcionProd.valida()));

    }

    @Y("doy click en “Samsung galaxy s6 ”")
    public void doyClickEnSamsungGalaxyS() {
        theActorInTheSpotlight().attemptsTo(ClickTelefonoSamsungGs6.ir());
    }

    @Cuando("hacemos clic en “Add to Cart ”")
    public void hacemosClicEnAddToCart() {
        theActorInTheSpotlight().attemptsTo(ClickAgregarAlCarrito.agregar());
    }

    @Entonces("nos debe mostrar un modal con el mensaje {string}")
    public void nosDebeMostrarUnModalConElMensaje(String Mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionModal.valida(Mensaje)));

    }

    @Y("acedemos al carrito para verificar que este agregado el telefono")
    public void acedemosAlCarritoParaVerificarQueEsteAgregadoElTelefono() {
        theActorInTheSpotlight().attemptsTo(IrACarritodeCompras.ir());
    }

    @Entonces("nos debe mostrar el telefono {string}")
    public void nosDebeMostrarElTelefono(String telefono) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionCarritoCompra.es(telefono)));
    }

    @Y("procedemos a eliminar el telefono")
    public void procedemosAEliminarElTelefono() {
        theActorInTheSpotlight().attemptsTo(EliminarTelefono.ir());
    }

    @Entonces("veriamos la eliminacion del telefono")
    public void veriamosLaEliminacionDelTelefono() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionEliminacionTelefono.valida()));
    }

    @Y("Cierra la sesion del usuario")
    public void cierraLaSesionDelUsuario() {
        theActorInTheSpotlight().attemptsTo(CerrarSesion.cerrar());
    }
}

