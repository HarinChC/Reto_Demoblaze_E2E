package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.CarritoDeComprasPage.LBL_PRODUCTOCARRITO;
import static co.com.demoblaze.www.userinterfaces.DescripcionTelefonosPage.LBL_PRODUCT_DESCRIPTION;
import static co.com.demoblaze.www.userinterfaces.InicioPage.LBL_HOME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionEliminacionTelefono implements Question<Boolean> {


    public static ValidacionEliminacionTelefono valida() {
        return new ValidacionEliminacionTelefono();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCTOCARRITO, isNotVisible()).forNoMoreThan(15).seconds()
        );
        return !actor.asksFor(Visibility.of(LBL_PRODUCTOCARRITO).asBoolean());

    }
}
