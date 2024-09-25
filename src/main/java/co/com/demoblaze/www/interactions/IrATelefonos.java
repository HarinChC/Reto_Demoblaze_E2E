package co.com.demoblaze.www.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.BTN_TELEFONOS_PHONE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrATelefonos implements Task {


    public static IrATelefonos ir() {
        return Tasks.instrumented(IrATelefonos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_TELEFONOS_PHONE,isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(
            Click.on(BTN_TELEFONOS_PHONE),
                Esperar.enMilisegundos(1000)

        );

    }


}
