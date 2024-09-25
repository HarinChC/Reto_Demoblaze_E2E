package co.com.demoblaze.www.stepDefinitions;


import co.com.demoblaze.www.interactions.IrARegistrarse;
import co.com.demoblaze.www.questions.ValidacioPaginaInicio;
import co.com.demoblaze.www.tasks.Registrarse;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.demoblaze.www.utils.Constantes.URL_PAGINA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuario_StepDefinition {

    @Dado("que el {string} ingresa a la url demoblaze")
    public void queElIngresaALaUrlDemoblaze(String usuario) {
        theActorCalled(usuario).attemptsTo(Open.url(URL_PAGINA));
    }

    @Cuando("se nos muestra la pantalla inicial")
    public void seNosMuestraLaPantallaInicial() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacioPaginaInicio.valida()));
            }

    @Entonces("hacemos clic en “Sing UP” para crear una cuenta {string}{string}")
    public void hacemosClicEnSingUPParaCrearUnaCuenta(String usuario, String clave) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(IrARegistrarse.registrarse());
        theActorInTheSpotlight().attemptsTo(Registrarse.con(usuario,clave));

    }

}

