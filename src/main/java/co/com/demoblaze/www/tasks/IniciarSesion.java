package co.com.demoblaze.www.tasks;

import co.com.demoblaze.www.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demoblaze.www.userinterfaces.InicioPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {
    private String usuario;
    private String Clave;

    public IniciarSesion(String usuario, String Clave) {
        this.usuario = usuario;
        this.Clave = Clave;
    }
    public static IniciarSesion con(String usuario, String Clave) {
        return Tasks.instrumented(IniciarSesion.class, usuario,Clave);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_INICIARSESION, isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Click.on(BTN_INICIARSESION),
                Enter.theValue(usuario).into(TXT_NOMBRE_USUARIO_LOGIN),
                Enter.theValue(Clave).into(TXT_CLAVE_USUARIO_LOGIN),
                Esperar.enMilisegundos(1000)
        );

    }
}
