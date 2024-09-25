package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.CarritoDeComprasPage.LBL_PRODUCTOCARRITO;
import static co.com.demoblaze.www.userinterfaces.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacioUsuarioInicioSesion implements Question<Boolean> {

    private String nombreEsperado;

    public ValidacioUsuarioInicioSesion(String nombreEsperado) {
        this.nombreEsperado = nombreEsperado;
    }

    public static ValidacioUsuarioInicioSesion es(String telefono) {
        return new ValidacioUsuarioInicioSesion(telefono);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_BIENVENIDA_NOMBREU, isVisible()).forNoMoreThan(15).seconds()
        );
        if(actor.asksFor(Visibility.of(LBL_BIENVENIDA_NOMBREU).asBoolean())){
            String obtainedMessage = actor.asksFor((TextContent.of(LBL_BIENVENIDA_NOMBREU)));
            return obtainedMessage.contains(nombreEsperado);
        } else {
            return false;
        }
    }
}
