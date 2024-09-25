package co.com.demoblaze.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoDeComprasPage {

    public static final Target LBL_PRODUCTOCARRITO = Target.the("Lbl producto carrito").
            located(By.xpath("(//td[contains(text(),'Samsung galaxy s6')])[1]"));

    public static final Target BTN_ELIMINAR = Target.the("Boton de eliminar elemento").
            located(By.xpath("(//a[@href='#'][normalize-space()='Delete'])[1]"));

    public static final Target BTN_CERRAR_SESION = Target.the("Boton de cerrar sesion").
            located(By.id("logout2"));

}
