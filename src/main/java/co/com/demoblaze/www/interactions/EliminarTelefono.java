package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.CarritoDeComprasPage.BTN_ELIMINAR;
import static co.com.demoblaze.www.userinterfaces.DescripcionTelefonosPage.BTN_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EliminarTelefono implements Task {


    public static EliminarTelefono ir() {
        return Tasks.instrumented(EliminarTelefono.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_ELIMINAR,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_ELIMINAR),
                Esperar.enMilisegundos(1000)

        );

    }


}
