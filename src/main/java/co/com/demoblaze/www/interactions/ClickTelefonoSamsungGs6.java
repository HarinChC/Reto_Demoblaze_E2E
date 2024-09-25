package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickTelefonoSamsungGs6 implements Task {


    public static ClickTelefonoSamsungGs6 ir() {
        return Tasks.instrumented(ClickTelefonoSamsungGs6.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TELEFONOS_SAMSUNG_S6,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(TELEFONOS_SAMSUNG_S6),
                Esperar.enMilisegundos(1000)

        );

    }


}
