package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacioPaginaInicio implements Question<Boolean> {
    public static ValidacioPaginaInicio valida() {
        return new ValidacioPaginaInicio();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_HOME, isVisible()).forNoMoreThan(60).seconds()
        );

        return LBL_HOME.resolveFor(actor).isDisplayed();
    }
}
