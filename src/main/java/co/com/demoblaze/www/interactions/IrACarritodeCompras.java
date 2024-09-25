package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.DescripcionTelefonosPage.BTN_CARRITO;
import static co.com.demoblaze.www.userinterfaces.InicioPage.BTN_TELEFONOS_PHONE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrACarritodeCompras implements Task {


    public static IrACarritodeCompras ir() {
        return Tasks.instrumented(IrACarritodeCompras.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_CARRITO,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_CARRITO),
                Esperar.enMilisegundos(1000)

        );

    }


}
