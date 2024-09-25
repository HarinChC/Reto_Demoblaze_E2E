package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;


public class ValidacionModal implements Question<Boolean> {

    private String MensajeEsperado;

    public ValidacionModal(String mensajeEsperado) {
        MensajeEsperado = mensajeEsperado;
    }

    public static ValidacionModal valida(String Mensaje) {
        return new ValidacionModal(Mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String modal = (actor.asksFor(HtmlAlert.text()));
        actor.attemptsTo(
                Switch.toAlert());
        actor.attemptsTo(Switch.toAlert().andAccept());
        return modal.contains(MensajeEsperado);
    }

}
