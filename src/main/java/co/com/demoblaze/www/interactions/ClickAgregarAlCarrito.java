package co.com.demoblaze.www.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.DescripcionTelefonosPage.BTN_AGREGAR_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickAgregarAlCarrito implements Task {


    public static ClickAgregarAlCarrito agregar() {
        return Tasks.instrumented(ClickAgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_AGREGAR_CARRITO,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_AGREGAR_CARRITO),
                Esperar.enMilisegundos(1000)

        );

    }


}
