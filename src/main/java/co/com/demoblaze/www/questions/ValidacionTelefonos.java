package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionTelefonos implements Question<Boolean> {

    public static ValidacionTelefonos valida() {
        return new ValidacionTelefonos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TELEFONOS_SAMSUNG_S6, isVisible()).forNoMoreThan(15).seconds(),
                WaitUntil.the(TELEFONOS_NOKIA, isVisible()).forNoMoreThan(15).seconds()
        );

        return TELEFONOS_SAMSUNG_S6.resolveFor(actor).isDisplayed();
    }
}
