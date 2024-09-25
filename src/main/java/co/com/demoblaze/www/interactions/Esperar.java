package co.com.demoblaze.www.interactions;

import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {
    private int time;

    public Esperar(int time) {
        this.time = time;
    }

    public static Esperar enMilisegundos(int time) {
        return instrumented(Esperar.class, time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(time);
    }
}
