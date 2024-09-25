package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.CarritoDeComprasPage.LBL_PRODUCTOCARRITO;
import static co.com.demoblaze.www.userinterfaces.InicioPage.LBL_BIENVENIDA_NOMBREU;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionCarritoCompra implements Question<Boolean> {

    private String productoEsperado;

    public ValidacionCarritoCompra(String nombreEsperado) {
        this.productoEsperado = nombreEsperado;
    }

    public static ValidacionCarritoCompra es(String usuario) {
        return new ValidacionCarritoCompra(usuario);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCTOCARRITO, isVisible()).forNoMoreThan(15).seconds()
        );
        if(actor.asksFor(Visibility.of(LBL_PRODUCTOCARRITO).asBoolean())){
            String obtainedMessage = actor.asksFor((TextContent.of(LBL_PRODUCTOCARRITO)));
            return obtainedMessage.contains(productoEsperado);
        } else {
            return false;
        }
    }
}
