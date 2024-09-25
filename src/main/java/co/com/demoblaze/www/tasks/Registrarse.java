package co.com.demoblaze.www.tasks;

import co.com.demoblaze.www.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registrarse implements Task {
    private String Nusuario;
    private String Clave;

    public Registrarse(String Nusuario,String Clave) {
        this.Nusuario = Nusuario;
        this.Clave = Clave;
    }

    public static Registrarse con(String Nusuario, String Clave) {
        return Tasks.instrumented(Registrarse.class, Nusuario,Clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TXT_NOMBRE_USUARIO_REGISTRARSE, isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Enter.theValue(Nusuario).into(TXT_NOMBRE_USUARIO_REGISTRARSE),
                Enter.theValue(Clave).into(TXT_CLAVE_REGISTRARSE),
                Click.on(BTN_REGISTRAR),
                Esperar.enMilisegundos(3000)
                );
        actor.attemptsTo(
                Switch.toAlert());
        actor.attemptsTo(Switch.toAlert().andAccept());

    }
}
