package co.com.demoblaze.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.DescripcionTelefonosPage.LBL_PRODUCT_DESCRIPTION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionDescripcionProd implements Question<Boolean> {

    public static ValidacionDescripcionProd valida() {
        return new ValidacionDescripcionProd();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCT_DESCRIPTION, isVisible()).forNoMoreThan(15).seconds()
        );
        return LBL_PRODUCT_DESCRIPTION.resolveFor(actor).isDisplayed();
    }
}
