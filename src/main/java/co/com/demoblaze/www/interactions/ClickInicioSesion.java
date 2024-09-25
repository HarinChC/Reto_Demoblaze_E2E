package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.BTN_INICIARSESION_LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickInicioSesion implements Task {


    public static ClickInicioSesion iniciar() {
        return Tasks.instrumented(ClickInicioSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_INICIARSESION_LOGIN,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_INICIARSESION_LOGIN),
                Esperar.enMilisegundos(1000)

        );

    }


}
