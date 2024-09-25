package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.CarritoDeComprasPage.BTN_CERRAR_SESION;
import static co.com.demoblaze.www.userinterfaces.InicioPage.BTN_INICIARSESION_LOGIN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CerrarSesion implements Task {


    public static CerrarSesion cerrar() {
        return Tasks.instrumented(CerrarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_CERRAR_SESION,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_CERRAR_SESION),
                Esperar.enMilisegundos(1000)

        );

    }


}
