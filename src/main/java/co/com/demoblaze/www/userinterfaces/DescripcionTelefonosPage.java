package co.com.demoblaze.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescripcionTelefonosPage {

    public static final Target LBL_PRODUCT_DESCRIPTION = Target.the("Lbl descripcion de producto").
            located(By.id("more-information"));
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton de agregar al carrito").
            located(By.xpath("//a[normalize-space()='Add to cart']"));
    public static final Target BTN_CARRITO = Target.the("Boton ir al carrito").
            located(By.id("cartur"));


}
