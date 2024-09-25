package co.com.demoblaze.www.stepDefinitions;


import co.com.demoblaze.www.interactions.ClickInicioSesion;
import co.com.demoblaze.www.questions.ValidacioPaginaInicio;
import co.com.demoblaze.www.questions.ValidacioUsuarioInicioSesion;
import co.com.demoblaze.www.tasks.IniciarSesion;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class IniciarSesion_StepDefinitions {
   
    @Cuando("ingresamos con nuestras credenciales {string}{string}")
    public void ingresamosConNuestrasCredenciales(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.con(usuario,clave));
    }

    @Y("hacemos click en “Log in” para ingresar con nuestra cuenta")
    public void hacemosClickEnLogInParaIngresarConNuestraCuenta() {
        theActorInTheSpotlight().attemptsTo(ClickInicioSesion.iniciar());
    }

    @Entonces("veriamos la pantalla inicial")
    public void veriamosLaPantallaInicial() throws InterruptedException {
        theActorInTheSpotlight().should(seeThat(ValidacioPaginaInicio.valida()));
    }

    @Entonces("veriamos el nombre de {string} en la pantalla inicial")
    public void veriamosElNombreDeEnLaPantallaInicial(String usuario ) {
        theActorInTheSpotlight().should(seeThat(ValidacioUsuarioInicioSesion.es(usuario)));


    }
}

