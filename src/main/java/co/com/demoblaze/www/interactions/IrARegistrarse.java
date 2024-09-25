package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.BTN_REGISTRARSE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrARegistrarse implements Task {


    public static IrARegistrarse registrarse() {
        return Tasks.instrumented(IrARegistrarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_REGISTRARSE,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_REGISTRARSE)

        );

    }


}
